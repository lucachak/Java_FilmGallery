import usables.Film;
import usables.LibManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         [  TO DO  ]
           - Implement all the methods to all classes.
        */
        while(true){
            System.out.print("Enter the option:\n[1] - update film\n[2] - delete film\n[3] - Display films\n[4] - add films\n[0] - Break\n ->");
            int valOption;
            try{
                valOption = Integer.valueOf(scanner.nextLine());
                if (valOption == 0){
                    break;
                }else if(valOption == 1){
                    LibManagement.displayFilms();
                    System.out.print("Enter the film id: ");
                    valOption = Integer.valueOf(scanner.nextLine());
                    LibManagement.updateFilms(valOption);
                }else if(valOption == 2){
                    LibManagement.displayFilms();
                    System.out.print("Enter the film id: ");
                    valOption = Integer.valueOf(scanner.nextLine());
                    LibManagement.deleteFilms(valOption);
                }else if(valOption == 3){
                    LibManagement.displayFilms();
                }else if(valOption == 4){
                    System.out.print("Enter the film id: ");
                    valOption = Integer.valueOf(scanner.nextLine());
                    System.out.println("Enter the film genre");
                    String genre = scanner.nextLine();
                    System.out.println("Enter the film title");
                    String name = scanner.nextLine();
                    System.out.println("Enter the film year");
                    int year = Integer.valueOf(scanner.nextLine());
                    Film newfilm = new Film(valOption, name, genre, year);
                    LibManagement.addFilms(newfilm);
                }
            }catch (Exception e){
                System.out.println("Invalid option");
            }

        }
    }
}