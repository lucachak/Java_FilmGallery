package usables;

public class Staff extends User{
    private float dept;
    private String name;
    private int id;

    public Staff(int id,String name,float dept ) {
        super(id,name);
        this.dept = dept;
    }

    private boolean validateStaff(Staff staff) {



        return true;
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    //get all films
    private void display() {
        LibManagement.displayFilms();
    }
    //check films that are borrowed
    private void onStock(int id){
        LibManagement.searchFilm(id);
    }
    //add films
    private void addFilm(Film film){
        LibManagement.addFilms(film);
    }
    //remove films
    private void removeFilm(Film film){
        LibManagement.deleteFilms(film.getId());
    }

    //update films
    private void updateFilm(Film film){
        LibManagement.updateFilms(film.getId());
    }
}
