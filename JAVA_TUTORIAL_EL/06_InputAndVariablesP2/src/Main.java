import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String firstName = input.next();

        System.out.print("Enter your salary: ");
        float salary = input.nextFloat();

        float netSalary = salary - (salary * 0.19f); //f to indicate that it is a float number

        System.out.print("Hello " + firstName + "!" + "\nYour net salary is: " + netSalary);
    }
}