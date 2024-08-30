package usables;

import java.sql.*;

public class checkStaff {

    private final int id;
    private String username;
    private String password;

    public checkStaff(int id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public static void getInfoStaff(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE type_of_user='staff'" );

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String genre = rs.getString("username");
                String year = rs.getString("type_of_user");
                String passwd = rs.getString("password");
                System.out.println(id + " " + name + " " + genre + " " + year + " " + passwd);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
