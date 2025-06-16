public class Main {
    public static void main(String[] args) {

        Rectangle room3 = new Rectangle();

        Rectangle myInputObject = new Rectangle(10,30); // parameter


        room3.modifyObject(myInputObject);

       System.out.println(myInputObject.getLength());
       System.out.println(myInputObject.getWidth());

        System.out.println(room3.getLength());
        System.out.println(room3.getWidth());






    }
}


