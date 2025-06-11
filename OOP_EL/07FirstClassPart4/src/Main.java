import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c1;
        c1 = new Car();
        Car c2 = new Car();


        c1.setmaker("Honda");
        c1.setmodel(2024);

        c2.setmaker("Toyota");
        c2.setmodel(2023);

        System.out.println(c1.getmaker());
        System.out.println(c1.getmodel());
        System.out.println(c2.getmaker());
        System.out.println(c2.getmodel());



    }
}
