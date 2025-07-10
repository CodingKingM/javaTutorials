import java.util.ArrayList;
//coding with John
public class Main {

    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(20);
        printer.print();

        Printer<Double> printer2 = new Printer<>(30.0);
        printer2.print();

        Printer<String> printer3 = new Printer<>("Hello!");
        printer3.print();

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");

        ArrayList<Integer> gradesList = new ArrayList<>();
        gradesList.add(100);
    }
}
