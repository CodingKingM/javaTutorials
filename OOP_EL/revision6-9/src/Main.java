import javax.print.attribute.standard.PrintQuality;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        // System.out.println(displayInfo); cant print it cuz in the class we wrote void so it cant print
        b1.setTitle("Java Programming tutorial");
        b1.setAuthor("Youtuber Malek");
        b1.displayInfo();

        Book b2 = new Book();
        b2.setTitle("Java Programming tutorial 2");
        b2.setAuthor("Youtuber El desouki");
        b2.displayInfo();

        Book b3 = new Book(); // the default constructor run automatically at every object when it gets created/
        b3.displayInfo();
    }
}
