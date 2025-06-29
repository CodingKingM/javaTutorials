public class Main {

    public static void main(String[] args) {

       // RetailItem r1 = new RetailItem(); // doesnt work as we cant create an object from an interface

        // CD obj1 = new CD("By the moon", "Malek", 30);
         // obj1.getItemPrice();

        RetailItem r1 = new CD(); //reference variable r1 is type RetailItem which stores the address of class CD
        r1.getItemPrice();
        //r1.setTitle(); // wouldnt work cuz r1 is type RetailItem, so it only knows the methods in RetailItem

        Displayable d1 = new CD(); // d1 only knows the methods in Interface Displayable
        d1.display();
    }
}
