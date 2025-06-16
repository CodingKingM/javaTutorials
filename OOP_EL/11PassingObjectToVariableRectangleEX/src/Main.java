public class Main {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle(); //object room1 has been created from Rectangle class

        double roomLength = 50;
        room1.setLength(roomLength); // we don't send the roomLength variable itself. we send a copy of the save value at roomLength

        System.out.println(roomLength);



    }
}
