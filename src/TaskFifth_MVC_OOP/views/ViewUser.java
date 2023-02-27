package TaskFifth_MVC_OOP.views;

import TaskFifth_MVC_OOP.controllers.UserController;
import TaskFifth_MVC_OOP.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public static boolean doIfeelLucky;


    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            doIfeelLucky = false;
            try {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    doIfeelLucky = choice("Вы хотите список через точку с запятой и пробелом, а не через запятую? true or false ?:");
                    caseCreate();
                    break;
                case READ:
                    caseRead();
                    break;
                case LIST:
                    caseList();
                    break;
                case DELETE:
                    caseDeleted();
                    break;
                case UPDATE:
                    String id = prompt("Идентификатор пользователя: (внимание id будет обновлен согласно правилам)");
                    try {
                        User user = userController.readUser(id);
                        System.out.println(user);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    userController.deleteUser(id);
                    caseCreate();
                   /* String update = prompt("Что изменить?: ");
                    switch (update){
                        case "name":
                            break;
                        case "family name":
                            break;
                        case "number":
                            break;
                    }*/
                    break;
            }
            }
            catch  (Exception ee){
                System.out.printf("%s something wrong \n ", ee.getMessage());
            }
        }
    }

    private void caseDeleted() {
        String id = prompt("Идентификатор пользователя: ");
        userController.deleteUser(id);
        System.out.println("user deleted");
    }

    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseList() {
        List<User> usersList = userController.readUsers();
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private boolean choice(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextBoolean();
    }

}
