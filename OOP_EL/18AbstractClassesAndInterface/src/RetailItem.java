public interface RetailItem {

    String storeName = "abc"; // because the field has to be FINAL
    double getItemPrice(); // automatically is set to public static final
}
