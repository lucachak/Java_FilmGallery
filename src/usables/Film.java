package usables;

public class Film {
    private int id;
    private String name;
    private String genre;
    private int year;
    private int inStock;


    public Film(int id, String name, String genre, int year) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.inStock = 1;
    }

    //getters
    public int getId() {return id;}
    public int getYear() {return year;}
    public String getGenre() {return genre;}
    public String getName() {return name;}
    public int getInStock() {return inStock;}

    //setters
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setYear(int year) {this.year = year;}
    public void setInStock(int inStock) {this.inStock = inStock;}

    //methods
    // will be updated later, alongside with the database
    public String Feedback(){
        return "good";
    }


    @Override
    public String toString() {
        return  this.id + this.name + this.genre + this.year;
    }
}
