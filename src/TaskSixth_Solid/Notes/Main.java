package TaskSixth_Solid.Notes;

import TaskSixth_Solid.Notes.controllers.NoteController;
import TaskSixth_Solid.Notes.model.*;
import TaskSixth_Solid.Notes.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        NoteController controller = new NoteController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
