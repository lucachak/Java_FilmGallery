package usables;

public class Admin extends User {

    private int id;
    private String name;
    private String password;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.id = id;
        this.name = name;
        this.password = password;
    }


}
