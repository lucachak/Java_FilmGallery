import usables.Film;
import usables.LibManagement;

public class Main {
    public static void main(String[] args) {

        Film film = new Film(53,"Some","Action",2001);
        /*



         [  TO DO  ]
           - fix DataBase
           - fix and update LibMan
           - Implement all the methods to all classes.

           - create a main loop for interaction with DB

        */
        LibManagement.DisplayFilms();

    }
}