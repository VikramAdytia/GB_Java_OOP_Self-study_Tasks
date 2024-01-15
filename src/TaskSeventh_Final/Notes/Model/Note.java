package TaskSeventh_Final.Notes.Model;

import java.util.Date;

public class Note {

    private String id;
    private String title;
    private String text;
    private Date date;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
        date = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "id= " + id + '\n' +
                "title= " + title + '\n' +
                "text= " + text + '\n' +
                "Дата= " + date
                + "\n" + "~~~~~~~~~~~~~~~~~~~~~";
    }
}
