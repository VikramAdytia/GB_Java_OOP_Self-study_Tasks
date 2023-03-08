package TaskSeventh_Final.Notes.Model;

import java.util.List;

public interface RepositoryInFace {
    List<Note> getAllNotes();
    void noteCreate(Note note);
    void noteUpdate(Note note);
    void noteDelete(Note note);
    Note noteRead(String id);
    void exit();
}
