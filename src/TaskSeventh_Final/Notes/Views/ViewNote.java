package TaskSeventh_Final.Notes.Views;

import TaskSeventh_Final.Notes.Controler.NoteController;
import TaskSeventh_Final.Notes.Model.Note;

import java.util.Scanner;

public class ViewNote {

    private final NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {

        String command;

        while (true) {

            command = prompt("""
                     create - создать заметку
                     read - прочитать заметку
                     update - обновить заметку
                     delete - удалить заметку
                     list - прочитать все заметки
                     exit - выход
                    Сделайте Ваш выбор:\s""").toLowerCase();

            if (command.equals("exit")) {
                noteController.exit();
                return;
            }
            try {
                switch (command) {
                    case "create" -> caseCreate();
                    case "read" -> caseRead();
                    case "update" -> caseUpdate();
                    case "delete" -> caseDelete();
                    case "list" -> caseList();
                    default -> System.out.println("\n Команда не найдена");
                }
            } catch (Exception e) {
                System.out.println("Ошибка. " + e.getMessage());
            }

        }
    }

    private void caseList() {
        if (noteController.recordsExist()) {
            System.out.println("Список всех заметок:");
            for (Note item : noteController.readAll()) {
                System.out.println(item);
            }
        }
    }

    private void caseDelete() throws Exception {
        if (noteController.recordsExist()) {
            String id = prompt("Введите id для редактирования: ");
            noteController.idExists(id);
            noteController.noteDelete(id);
        }
    }

    private void caseUpdate() throws Exception {
        if (noteController.recordsExist()) {
            String id = prompt("Введите id для редактирования: ");
            noteController.idExists(id);
            noteController.noteUpdate(id, noteCreate());
        }
    }

    private void caseRead() throws Exception {
        if (noteController.recordsExist()) {
            String id = prompt("Введите id заметки: ");
            if (noteController.idExists(id)) {
                Note note = noteController.noteRead(id);
                System.out.println("Найденная заметка:");
                System.out.println(note);
            }
        }
    }

    private void caseCreate() {
        noteController.saveNote(noteCreate());
    }

    private Note noteCreate() {
        String title = prompt("Заголовок: ");
        String text = prompt("Содержание: ");
        return (new Note(title, text));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
