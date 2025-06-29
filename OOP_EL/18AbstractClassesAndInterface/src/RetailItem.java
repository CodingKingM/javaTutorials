public interface RetailItem {

    String storeName = "abc"; // because the field has to be FINAL
    //methods
    double getItemPrice(); //Methods are public abstract (not static final)
}
