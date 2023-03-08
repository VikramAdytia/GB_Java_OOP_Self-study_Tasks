package TaskSeventh_Final.Notes.Controler;

import TaskSeventh_Final.Notes.Model.Note;
import TaskSeventh_Final.Notes.Model.RepositoryInFace;

import java.util.List;
import java.util.stream.Collectors;

public class NoteController implements InFaceController {
    
    private final RepositoryInFace repository;
    public NoteController(RepositoryInFace repository) {
        this.repository = repository;
    }

    public void exit() { repository.exit(); }

    public void saveNote(Note noteCreate) {
        repository.noteCreate(noteCreate);
    }

    public boolean recordsExist() {
        List<Note> notes =repository.getAllNotes();
        boolean result = ((notes!=null)&&(notes.size()!=0));
        if (!result)
            System.out.println("\nСписок заметок пустой.\n");
        return result;
    }

    public boolean idExists(String id) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = notes.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
        if (note == null)
            throw new Exception("Заметка с идентификатром: " + id + " не найдена.");
        return true;
    }

    public Note noteRead(String id) {
        return repository.noteRead(id);
    }

    public void noteUpdate(String id, Note noteUpdate) {
        noteUpdate.setId(id);
        repository.noteUpdate(noteUpdate);
    }

    public void noteDelete(String id) {
        Note note = repository.getAllNotes().stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
        repository.noteDelete(note);
    }

    public List<Note> readAll() {
        return repository.getAllNotes();
    }
}
