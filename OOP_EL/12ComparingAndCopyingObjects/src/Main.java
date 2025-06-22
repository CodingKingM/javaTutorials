public class Main {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle(10,50);
        Rectangle room2 = new Rectangle(room1);

       room2.getInfo();
//        r2 = r1; // reference copy// they both point at the same address



//        if (room1.isEqual(room2)) {
//            System.out.println("The objects are equal");
//        } else {
//          System.out.println("The objects are NOT equal");
//        }

    }
}


