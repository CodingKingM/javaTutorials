public class Car extends Vehicle {
    int numDoors;
    // Constructor with super()
    public Car(){
        super(); // calls default Vehicle Constructor
        numDoors = 0;
    }
    public Car(int numDoors) {
        this.numDoors = numDoors;
    }
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }
    //Methods
    public void displayInfo(){
        super.displayInfo(); // calls displayInfo method from Vehicle and copies its content.
        System.out.println("Number of Doors: " + numDoors);
    }

}
