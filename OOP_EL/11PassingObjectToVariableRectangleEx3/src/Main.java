public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10,50);
        Rectangle r2 = new Rectangle(30, 70);
        // to combine two objects r1 and r2
       // Rectangle r3 =  r1.addObject(r2); //
        System.out.println(r1.addObject(r2).getLength());
        System.out.println(r1.addObject(r2).getWidth());

    }
}


