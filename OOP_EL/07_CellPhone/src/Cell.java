public class Cell {

    private String manufacturer;
    private String model;
    private double retailPrice;

    public void setManufacturer(String manu) {
        manufacturer = manu;
    }
    public void setModel(String mod) {
        model = mod;
    }
    public void setRetailPrice(double price) {
        retailPrice = price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
}
