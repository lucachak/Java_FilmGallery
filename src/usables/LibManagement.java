package usables;
import java.sql.*;
import java.util.Scanner;

public class LibManagement {
    private static Connection connection(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB", "root", "lucas123");
            return conn;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    //add
    public static void addFilms(Film film) {
        int id = film.getId();
        int year = film.getYear();
        String name = film.getName();
        String genre = film.getGenre();
        try {
            Connection conn = connection();
            String sql = "INSERT INTO films (id,name, year, genre) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, year);
            statement.setString(4, genre);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new film was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete
    public static void deleteFilms(int id) {
        String sql = "DELETE FROM films WHERE id = ?";
        try{
            Connection conn = connection();
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
    public static void updateFilms(int id) {
        String statement = "UPDATE films SET id = ? WHERE id = ?";
        System.out.println("new id: ");
        Scanner scanner = new Scanner(System.in);
        int new_id = Integer.parseInt(scanner.nextLine());
        try{
            Connection conn = connection();
            PreparedStatement preparedStatement = conn.prepareStatement(statement);
            preparedStatement.setInt(1, new_id);
            preparedStatement.setInt(2, id);
            int rowsChanged = preparedStatement.executeUpdate();
            if (rowsChanged > 0) {
                System.out.println("The film was updated successfully!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //Display
    public static void displayFilms() {
        try {
            Connection conn = connection();
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
    public static void searchFilm(int idFilm){
        try{
            Connection conn = connection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM films WHERE ID=%d".formatted(idFilm));

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String genre = rs.getString("genre");
                int year = rs.getInt("year");
                int onStock = rs.getInt("inStock");
                if (onStock == 0) {
                    System.out.println(id + " " + name + " " + genre + " " + year + " is not avaliable.");
                } else {
                    System.out.println(id + " " + name + " " + genre + " " + year);
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
