package TaskSeventh_Final.Notes.Model;

import java.util.ArrayList;
import java.util.List;

public class JsonRepositoryFile implements RepositoryInFace {

    private final JsonNoteMapper jsonNoteMapper =
            new JsonNoteMapper();

    private final FileOperationalImpl fileOperational;
    public JsonRepositoryFile(FileOperationalImpl fileOperational) {
        this.fileOperational = fileOperational;
    }


    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperational.readAllLines();
        return jsonNoteMapper.remap(lines);
    }

    @Override
    public void noteCreate(Note note) {
        List<Note> notes;
        if (getAllNotes() != null) {
            notes = getAllNotes();
        } else {
            notes = new ArrayList<>();
        }

        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        writeToFile(notes);
    }
    @Override
    public void noteUpdate(Note note) {
        List<Note> notes = getAllNotes();
        Note noteToBeUpdated = notes.stream().filter(p -> p.getId()
                .equals(note.getId())).findFirst().orElse(null);

        if (noteToBeUpdated != null) {
        noteToBeUpdated.setTitle(note.getTitle());
        noteToBeUpdated.setText(note.getText());
        noteToBeUpdated.setDate(note.getDate());
        writeToFile(notes);
    } else System.out.println("Заметка с идентификатором: " + note.getId() + " не найдена");

    }

    @Override
    public void noteDelete(Note note) {
        List<Note> notes =getAllNotes();
        notes.removeIf(p -> p.getId().equals(note.getId()));
        writeToFile(notes);
    }

    @Override
    public Note noteRead(String id) {
        List<Note> notes = getAllNotes();
        return notes.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void exit() {}

    private void writeToFile(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        lines.add(jsonNoteMapper.map(notes));
        fileOperational.saveAllLines(lines);
    }

}
