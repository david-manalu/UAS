package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;

public class Register {
    public String InputController(String email, String nama, String password, String photo, String kategori){
        String query;
        try {
            DatabaseHandler conn = new DatabaseHandler();
            conn.connect();
            PreparedStatement stmt;
            query = "INSERT INTO ktp(email,nama,password,photo,kategori) VALUES(?,?,?,?,?)";
            stmt = conn.con.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, nama);
            stmt.setString(3, password);
            stmt.setString(4, photo);
            stmt.setString(5, kategori);
            stmt.executeUpdate();
            return "Berhasil";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Gagal";
        }
    }
}
