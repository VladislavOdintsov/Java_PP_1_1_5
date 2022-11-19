package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван", "Золо", (byte) 18);
        userService.saveUser("Николай", "Балакин", (byte) 20);
        userService.saveUser("Света", "Шмелева", (byte) 25);
        userService.saveUser("Игорь", "Сивый", (byte) 19);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();











//        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Иван", "Золо", (byte) 18);
//        userService.saveUser("Николай", "Балакин", (byte) 20);
//        userService.saveUser("Света", "Шмелева", (byte) 25);
//        userService.saveUser("Игорь", "Сивый", (byte) 19);
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();

    }
}
