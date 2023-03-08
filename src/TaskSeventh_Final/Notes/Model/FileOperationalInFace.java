package TaskSeventh_Final.Notes.Model;

import java.util.List;

public interface FileOperationalInFace {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
