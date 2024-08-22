package usables;

public class Student extends User{
    private String classID ;
    private String name;
    private int id;

    public Student(int id,String name,String classID ) {
        super(id,name);
        this.classID = classID;
    }

    //borrow film
    //check all possible films
    //return film
}
