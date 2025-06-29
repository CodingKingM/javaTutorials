public class Main {

    public static void main(String[] args) {
        Course c1 = Course.IME;
        Course c2 = Course.ICS;
//        System.out.println(c1.toString());
//        System.out.println(c1.ordinal());
        System.out.println(c1.compareTo(c2));  // It compares the ordinal value. c1 (IME) has an ordinal value of 1
        System.out.println(c2.equals(c1));


    }

}
