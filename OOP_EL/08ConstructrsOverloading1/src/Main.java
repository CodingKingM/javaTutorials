public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(); // uses the constructor default values

        System.out.println(c1.getMaker());
        System.out.println(c1.getModel());

        Car c2 = new Car("Kia", 2000);
        System.out.println(c2.getMaker());
        System.out.println(c2.getModel());



    }
}
