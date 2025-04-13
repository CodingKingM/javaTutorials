// an app to find the area of a rectangle
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // input is the object name and it can be anything
        System.out.println("Welcome to the Rectangle Area calculator!");

        System.out.print("Enter a width: ");
        double width = input.nextDouble();  // nextDouble() is a method from the Scanner class

        System.out.print("Enter a length: ");
        double length = input.nextDouble();

        double area = width * length;  // to calculate the area

        System.out.println("The area of the rectangle is: " + area);
    }
}