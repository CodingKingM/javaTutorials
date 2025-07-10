import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        try
//        {
//            int x = 10, y = 0;
//            System.out.print(x/y);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("ERROR! Division by zero NOT allowed!");
//        }
//        System.out.println("Program continues");
        try {
            int x, y;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a value for x: ");
            x = input.nextInt();

            System.out.print("Enter a value for y: ");
            y = input.nextInt();

            System.out.print(x/y);
        }
        catch (ArithmeticException e) {
            System.out.print("Error, Division by zero!!" + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.print("Error, Incorrect Input!!");
        }
        catch (Exception e) { // is an argument in the exception class. e can be named anything
            System.out.print("Error!" + e.getMessage());
        }

//        public ArithmeticException extends Exception { // this is done automatically
//            public ArithmeticException (String message){
//                super(message);
//            }
        }

    }

