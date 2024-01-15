package TaskSeventh_Final.Notes.Controler;

import TaskSeventh_Final.Notes.Model.Note;

import java.util.List;

public interface InFaceController {

    void exit() ;

    void saveNote(Note noteCreate);

    boolean recordsExist() ;

    boolean idExists(String id) throws Exception ;

    Note noteRead(String id);

    void noteUpdate(String id, Note noteUpdate);

    void noteDelete(String id);

    List<Note> readAll();
}