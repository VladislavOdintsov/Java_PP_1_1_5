package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
//    private Statement statement;
//    {
//        try {
//            statement = Util.getConnection().createStatement();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    Connection connection = getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            String sql = "CREATE TABLE `mydbusers`.`users` (\n" +
//                    "  `id` BIGINT NOT NULL AUTO_INCREMENT,\n" +
//                    "  `name` VARCHAR(20) NOT NULL,\n" +
//                    "  `lastName` VARCHAR(20) NOT NULL,\n" +
//                    "  `age` TINYINT NOT NULL,\n" +
//                    "  PRIMARY KEY (`id`))\n" +
//                    "ENGINE = InnoDB\n" +
//                    "DEFAULT CHARACTER SET = utf8;";
//            statement.execute(sql);
//            System.out.println("Таблица создана");
//        } catch (SQLException e) {
//            System.out.println("Таблица уже создана");
//        }

    }

    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            String sql = "DROP TABLE users";
//            statement.execute(sql);
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            System.out.println("Нет таблицы которую можно удалить");
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("User с именем - " + name + " добавлен в базу данных");
//        } catch (SQLException e) {
//            System.out.println("Не удалось добавить пользователя");
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE id = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь удален");
//        } catch (SQLException e) {
//            System.out.println("Не удалось удалить пользователя");
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String sql = "SELECT * FROM users";
//        try (Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                User user = new User(resultSet.getString("name"), resultSet.getString("lastName"), resultSet.getByte("age"));
//                user.setId(resultSet.getLong(1));
//                users.add(user);
//            }
//            System.out.println("Все пользователи получены в виде листа");
//        } catch (SQLException e) {
//            System.out.println("Не удалось получить пользователей");
//        }
//        return users;
        return null;
    }

    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            String sql = "DELETE FROM users";
//            statement.execute(sql);
//            System.out.println("Все данные в таблице удалены");
//        } catch (SQLException e) {
//            System.out.println("Ну удалось удалить данные из таблицы");
//        }
    }
}
