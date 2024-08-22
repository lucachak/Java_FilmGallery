package usables;
import java.sql.*;

public class LibManagement {

    private Film film;

    public LibManagement(Film film){
        this.film = film;
    }
    //add

    public static void addfilm(Film film) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/filmsDB",
                    "root",
                    "lucas123"
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("type_of_user"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


    //delete
    //update
    //Display
    //Search
}
