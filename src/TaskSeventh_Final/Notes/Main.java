package TaskSeventh_Final.Notes;

import TaskSeventh_Final.Notes.Controler.NoteController;
import TaskSeventh_Final.Notes.Logger.FileAppendOperationImpl;
import TaskSeventh_Final.Notes.Logger.FileLogger;
import TaskSeventh_Final.Notes.Logger.LogRepositoryFileDecorator;
import TaskSeventh_Final.Notes.Model.FileOperationalImpl;
import TaskSeventh_Final.Notes.Model.JsonRepositoryFile;
import TaskSeventh_Final.Notes.Model.RepositoryInFace;
import TaskSeventh_Final.Notes.Views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperationalImpl fileOperational =
                new FileOperationalImpl("notes.json");
        RepositoryInFace repository =
                new LogRepositoryFileDecorator(
                new JsonRepositoryFile(fileOperational),
                new FileLogger(new FileAppendOperationImpl("log.txt"))
                );
        NoteController noteController = new NoteController(repository);
        new ViewNote(noteController).run();
    }
}
