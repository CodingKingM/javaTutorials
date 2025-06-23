public class Main {
    public static void main(String[] args) {

        Vehicle veh1 = new Vehicle();
        veh1.setBrand("Mercedes");
        veh1.setYear(2020);
        System.out.println(veh1.getBrand());
        System.out.println(veh1.getYear());
        System.out.println("--Display information--");
        veh1.displayInfo();
    }
}
