package usables;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;



public class LibManagement {
    private Film film;

    public LibManagement(){
    }
    //add

    public static void addfilm() {
        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filmsDB",
                    "root",
                    "lucas123"
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                System.out.print("UserName : "+rs.getString("username")+"  ");
                System.out.print("Password : "+rs.getString("password")+"  ");
                System.out.println("Name : "+ rs.getString("name")+"  ");
                System.out.println("[TypeOfUser : "+ rs.getString("type_of_user")+"]  ");
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
