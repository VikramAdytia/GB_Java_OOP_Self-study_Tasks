package TaskSeventh_Final.Notes.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendOperationImpl implements FileLoggerOperationInFace {

    private final String fileName;

    public FileAppendOperationImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.flush();
        } catch (IOException IOex) {
            System.out.println(IOex.getMessage() + "FileOperationalImpl");
        }
    }

    @Override
    public void saveLogToFile(String line) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(fileName, true);
            fileWriter.write(line);
            fileWriter.append("\n");
            fileWriter.flush();
            System.out.println("\nЛогирование прозведено успешно\n");
        }  catch (IOException IOex) {
            System.out.println("\nЛогирование не произведено\n");
            System.out.println(IOex.getMessage());
        }
    }

}
