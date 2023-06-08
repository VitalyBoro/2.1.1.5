package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl  implements UserService {
   public static final UserDao userDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
    }
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }
    public List<User> getAllUsers() {
       userDao.getAllUsers();
       for (User user : userDao.getAllUsers()) {
           System.out.println(user);
       }
       return userDao.getAllUsers();
    }
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
