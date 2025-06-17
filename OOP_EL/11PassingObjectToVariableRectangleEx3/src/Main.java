public class Main {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle(10,50);
        Rectangle room2 = new Rectangle(30, 70);
        // to combine two objects r1 and r2
       // Rectangle r3 =  r1.addObject(r2); //
        System.out.println(room1.addObject(room2).getLength());
        System.out.println(room1.addObject(room2).getWidth());

    }
}


