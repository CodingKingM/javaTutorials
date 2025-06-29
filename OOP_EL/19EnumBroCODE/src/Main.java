import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // to accept user input
        System.out.print("Enter a day of the week");
        String dayOfWeek = input.nextLine().toUpperCase();

        Day day = Day.THURSDAY;
        System.out.println(day);
        System.out.println(day.dayNumber());

        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It is a weekday");
    }

    }
}
