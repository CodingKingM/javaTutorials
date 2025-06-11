package if_else_if_statement;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numb1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int numb2 = input.nextInt();

        if(numb1 >= 0 && numb2 >= 0 && numb1 == numb2){
            System.out.println("Both numbers are equal");
        }
        else if (numb1 > numb2){
            System.out.println(numb1 + " is greater than " + numb2);
        } else if (numb1 < numb2){
            System.out.println(numb2 + " is greater than " + numb1);
        }
    }
}