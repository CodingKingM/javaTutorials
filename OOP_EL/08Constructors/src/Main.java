
public class Main {


    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();  // Rectangle is the class (blueprint) r1 is the name of the object. new = to create a place in the memory

        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        r1.setLength(20);
        r1.setWidth(20);

        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());




    }
}