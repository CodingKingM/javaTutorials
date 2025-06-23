public class Vehicle {

    String brand;
    int year;

    //constructor
    public Vehicle(){
        brand = "none";
        year = 0;
    }
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    // setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear(int year){
        this.year = year;
    }
    // Getter
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;

    }
}
