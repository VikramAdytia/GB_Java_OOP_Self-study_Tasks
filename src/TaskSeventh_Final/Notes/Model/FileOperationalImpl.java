package TaskSeventh_Final.Notes.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationalImpl implements FileOperationalInFace {
    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = bufferReader.readLine();
            if (line!=null) {
                lines.add(line);
            }
            while (line != null) {
                line = bufferReader.readLine();
                if(line!=null){
                    lines.add(line);
                }
            }
            fileReader.close();
        } catch (IOException IOex){
            IOex.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            for (String line : lines) {
                fileWriter.write(line);
                fileWriter.append("\n");
            }
            fileWriter.flush();
            System.out.println("\nОперация прозведена успешно\n");
        }  catch (IOException IOex) {
            System.out.println("\nОперация не произведена\n");
            System.out.println(IOex.getMessage());
        }
    }

    private final String fileName;

    public FileOperationalImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.flush();
        } catch (IOException IOex) {
            System.out.println(IOex.getMessage() + "FileOperationalImpl");
        }
    }
}
