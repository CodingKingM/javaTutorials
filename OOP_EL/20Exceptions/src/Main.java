public class Main {

    public static void main(String[] args) {
        try
        {
            int x = 10, y = 0;
            System.out.print(x/y);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ERROR! Division by zero NOT allowed!");
        }
        System.out.println("Program continues");

    }
}
