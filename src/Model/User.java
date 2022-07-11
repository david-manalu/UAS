package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User{
    int id;
    String name;
    String email;
    String password;
    int idCategory;
    String photo;

    public User() {
    }

    public User(int id, String name, String email, String password, int idCategory, String photo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.idCategory = idCategory;
        this.photo = photo;
    }

    public User(ResultSet rs) throws SQLException
    {
        this.id = rs.getInt("id");
        this.name = rs.getString("name");
        this.email = rs.getString("email");
        this.password = rs.getString("password");
        this.idCategory = rs.getInt("idCategory");
        this.photo = rs.getString("photo");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
