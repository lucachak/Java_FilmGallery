package usables;
import java.sql.*;


public class LibManagement {

    //add
    public static void addFilms(Film film) {

        int id = film.getId();
        int year = film.getYear();
        String name = film.getName();
        String genre = film.getGenre();


        try {

            String sql = "INSERT INTO films (id,name, year, genre) VALUES (?, ?, ?, ?)";
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");

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
    public static void deleteFilms(Film film) {
        String sql = "DELETE FROM films WHERE id = ?";
        int id = film.getId();

        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");
            Statement stmt = conn.createStatement();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A new user was deleted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //update
    public static void updateFilms(Film film) {
        int id=film.getId();
        int year = film.getYear();
        String name = film.getName();
        String genre = film.getGenre();
        int new_id = 1002;

        String statement = "UPDATE films SET id = ? WHERE id = ?";

        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");

            PreparedStatement preparedStatement = conn.prepareStatement(statement);
            preparedStatement.setInt(1, new_id);
            preparedStatement.setInt(2, id);

            int rowsChanged = preparedStatement.executeUpdate();
            if (rowsChanged > 0) {
                System.out.println("A new user was updated successfully!");
            }


        }catch (SQLException e){
            e.printStackTrace();
        }

    };

    //Display
    public static void DisplayFilms() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM films");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String genre = rs.getString("genre");
                int year = rs.getInt("year");
                System.out.println(id + " " + name + " " + genre + " " + year);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Search
}
