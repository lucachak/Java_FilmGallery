package usables;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters
    public String getId() {return ""+id;}
    public String getName() {return this.name;}
    //setters
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}

    //methods


    public void getDept(){};
    public void getClassStudent(){};






}
