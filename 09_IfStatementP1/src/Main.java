// to check wheter or not the number is even
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb = input.nextInt(); /// its .next not newww

        if (numb % 2 == 0) {
            System.out.println( numb + " is even");
        } else {
            System.out.println( numb + " is odd");
        }
    }
}