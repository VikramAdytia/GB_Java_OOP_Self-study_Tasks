package TaskSeventh_Final.Notes.Model;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonNoteMapper {

    public String map(List<Note> notes) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(notes);

    }
    public List<Note> remap(List<String> lines) {
        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            result.append(line);
        }

        Type listOfMyClassObject = new TypeToken<ArrayList<Note>>() {}.getType();
        Gson gson =new Gson();

        return gson.fromJson(result.toString(), listOfMyClassObject);
    }


}
