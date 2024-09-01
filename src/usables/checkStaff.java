package usables;

import java.sql.*;
import java.util.Scanner;

public class checkStaff {

    private Scanner scan = new Scanner(System.in);
    private int id;
    private String username;
    private String password;

    public checkStaff(int id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public String getInfoStaff(){
        String info = "";
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE type_of_user='staff'" );

            while (rs.next()) {
                int id_check = rs.getInt("id");
                String username_check = rs.getString("username");
                String passwd_check = rs.getString("password");

                if(this.id == id_check && this.username.equals(username_check) && this.password.equals(passwd_check) ){
                    info = "Youre logged in";
                    return info;
                }

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        info = "not in";
        return info;
    }
}
