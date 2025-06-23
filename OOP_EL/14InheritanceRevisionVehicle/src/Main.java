public class Main {
    public static void main(String[] args) {

        Vehicle veh1 = new Vehicle();

        Car car1 = new Car("Toyota", 2020, 4);
        Bike bike1 = new Bike("Trek", 2021, true);

        car1.displayInfo();   // Should show brand, year, AND doors
        bike1.displayInfo();  // Should show brand, year, AND basket info
    }
}
