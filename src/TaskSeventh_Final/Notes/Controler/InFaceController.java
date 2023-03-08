package TaskSeventh_Final.Notes.Controler;

import TaskSeventh_Final.Notes.Model.Note;

import java.util.List;

public interface InFaceController {

    public void exit() ;

    public void saveNote(Note noteCreate);

    public boolean recordsExist() ;

    public boolean idExists(String id) throws Exception ;

    public Note noteRead(String id);

    public void noteUpdate(String id, Note noteUpdate);

    public void noteDelete(String id);

    public List<Note> readAll();
}