import usables.Film;
import usables.LibManagement;

public class Main {
    public static void main(String[] args) {

        Film film = new Film(52,"Some","Action",2001);
        /*



         [  TO DO  ]
           - fix DataBase
           - fix and update LibMan
           - Implement all the methods to all classes.

           - create a main loop for interaction with DB

           --> SQL commands:
                    INSERT INTO table_name (column1, column2, column3, ...)
                    VALUES (value1, value2, value3, ...);

                    [Exemples]:
                    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
                    VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');


            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                System.out.print("UserName : "+rs.getString("username")+"  ");
                System.out.print("Password : "+rs.getString("password")+"  ");
                System.out.println("Name : "+ rs.getString("name")+"  ");
                System.out.println("[TypeOfUser : "+ rs.getString("type_of_user")+"]  ");
            }*/

        LibManagement.addFilms(film);
    }
}