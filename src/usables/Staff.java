package usables;

public class Staff extends User{
    private float dept;
    private String name;
    private int id;

    public Staff(int id,String name,float dept ) {
        super(id,name);
        this.dept = dept;
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
        LibManagement.displayFilms();
    }

    //add films
    //remove films
    //update films

}
