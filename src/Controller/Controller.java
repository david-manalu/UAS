package Controller;

import Model.CategoryUser;
import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    public static ArrayList<CategoryUser> getCategoryUser() {
        ArrayList<CategoryUser> categoryUsers = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM categoryuser";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CategoryUser categoryUser = new CategoryUser();
                categoryUser.setId(rs.getInt("id"));
                categoryUser.setName(rs.getString("name"));
                categoryUsers.add(categoryUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (categoryUsers);
    }

    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setIdCategory(rs.getInt("id category"));
                user.setPhoto(rs.getString("photo"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    public static ArrayList<User> getAllUsersByCategory(String kategori) {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user WHERE '" + kategori + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setIdCategory(rs.getInt("id category"));
                user.setPhoto(rs.getString("photo"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    public static boolean login(String email, String password) {
        conn.connect();
        String query = "SELECT * FROM user WHERE email = '" + email + "' && password = '" + password + "'";
        try {
            var user = getAllUsers();
            for (var u : user) {
                if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return (false);
        }
        return false;
    }
}
