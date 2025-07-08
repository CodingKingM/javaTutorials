public class Main {
    public static void main(String[] args) {

        // array used to store multiple values in one variable

//        String[] cars = {"Mercedes", "BMW", "Nissan", "Ford"}; // starts with 0
//
//        cars[0] = "Mustang"; // we can manually assign it, Mercedes gets replaced with Mustang
//
//        // we can use exception handeling (optioinal) just to revise
////        try {
////            System.out.println(cars[4]);
////        }
////        catch (Exception e) {
////            System.out.print("Error!" + e.getMessage());
////        }
//
//        System.out.println(cars[3]);
        String[] cars = new String[4]; // assigning an array and allocating to it 7 spots
        cars[0] = "Mercedes";
        cars[1] = "BMW";
        cars[2] = "Nissan";
        cars[3] = "Ford";
        System.out.println(cars[3]); // to display a single element of an array
        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }



    }
}
