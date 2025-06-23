public class Bike extends Vehicle {
    boolean hasBasket;

    public Bike(){
        super();
        hasBasket = false;
    }
    public Bike(String brand, int year, boolean hasBasket){ //had to remove numDoors as its not in the super class
        super(brand, year);
        this.hasBasket = hasBasket;
    }
    //Method
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Basket: " + hasBasket);
    }

}
