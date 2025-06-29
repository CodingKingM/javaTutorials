public class CD implements RetailItem, Displayable {

    String title;
    String artist;
    double price;

    //Constructors
    public CD(){

    }
    public CD(String title){
        this.title = title;
    }
    public CD(String title, String artist){
        this(title);
        this.artist = artist;
    }
    public CD(String title, String artist, double price){
        this(title, artist);
        this.price = price;
    }
    @Override
    public double getItemPrice() {   // this is a must since its implemented from RetailItem
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void display(){
        System.out.println("title: " + title);
        System.out.println("artist: " + artist);
        System.out.println("price: " + price);
        System.out.println("Store" + storeName);
    }
}
