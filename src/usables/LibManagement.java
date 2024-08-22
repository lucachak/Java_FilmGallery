package usables;
import java.sql.*;


public class LibManagement {
    //private Film films;

    public LibManagement(){
    }



    //add
    public static void addFilms(Film film) {

        int id = film.getId();
        int year = film.getYear();
        String name = film.getName();
        String genre = film.getGenre();

        try {
            String sql = "INSERT INTO films (id,name, year, genre) VALUES (?, ?, ?, ?)";
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB",
                    "root",
                    "lucas123"
            );
            Statement stmt = conn.createStatement();


            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, year);
            statement.setString(4, genre);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
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
