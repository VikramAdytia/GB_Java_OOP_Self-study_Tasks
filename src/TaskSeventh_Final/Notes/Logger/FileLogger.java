package TaskSeventh_Final.Notes.Logger;

import java.util.Date;

public class FileLogger implements Loggable{
    FileLoggerOperationInFace fileLoggerOperation;

    public FileLogger(FileLoggerOperationInFace fileLoggerOperation) {
        this.fileLoggerOperation = fileLoggerOperation;
    }

    @Override
    public void saveLog(String message) {
        fileLoggerOperation.saveLogToFile(new Date() + ": " + message);
    }
}
