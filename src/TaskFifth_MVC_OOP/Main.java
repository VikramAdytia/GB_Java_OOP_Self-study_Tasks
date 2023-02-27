package TaskFifth_MVC_OOP;

import TaskFifth_MVC_OOP.model.*;
import TaskFifth_MVC_OOP.controllers.UserController;
import TaskFifth_MVC_OOP.views.ViewUser;


//Сделать сохранение в другом формате,
// например, не через запятую,
// а через точку с запятой,
// и разделителем - пустой строкой.
// Предусмотреть сохранение в старом формате.
public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
