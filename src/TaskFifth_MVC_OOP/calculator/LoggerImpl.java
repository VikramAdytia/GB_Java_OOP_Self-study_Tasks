package TaskFifth_MVC_OOP.calculator;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerImpl implements Logger {

    private String loggerName;

    public LoggerImpl(String fileName ) {
        this.loggerName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void saveAllLines(String result) {
        try (FileWriter writer = new FileWriter(loggerName, true)) {

            writer.write(result);
            // запись по символам
            writer.append('\n');

            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        }
    }
}
