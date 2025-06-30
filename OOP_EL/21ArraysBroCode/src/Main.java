public class Main {
    public static void main(String[] args) {

        // array used to store multiple values in one variable

        String[] cars = {"Mercedes", "BMW", "Nissan", "Ford"}; // starts with 0

        cars[0] = "Mustang"; // we can manually assign it, Mercedes gets replaced with Mustang

        // we can use exception handeling (optioinal) just to revise
//        try {
//            System.out.println(cars[4]);
//        }
//        catch (Exception e) {
//            System.out.print("Error!" + e.getMessage());
//        }

        System.out.println(cars[3]);


    }
}
