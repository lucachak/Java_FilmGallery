import usables.Film;
import usables.LibManagement;

public class Main {
    public static void main(String[] args) {

        int valFilm = 12;
        String name = "SomeActualfuck";
        String genre = "Action";
        int year = 2002;

        Film film = new Film(valFilm, name,  genre, year );


        /*
         [  TO DO  ]

        */

        LibManagement.addfilm();
    }
}