
public class Main {
    public static void main(String[] args) {

        Cell cell1 = new Cell();
        cell1.setManufacturer("iPhone");
        cell1.setModel("13 Pro");
        cell1.setRetailPrice(999);

        System.out.println(cell1.getManufacturer());
        System.out.println(cell1.getModel());
        System.out.println(cell1.getRetailPrice());

    }
}