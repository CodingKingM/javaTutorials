public class Box<T> { // to set a type parameter
    // when we create our box object, its going to act like a container so we will store a value inside

    T item; // we are storing an item within a box but we dont the exact type

    // method where we set our item

    public void setIem(T item){
        this.item = item;
    }

    // method to get the item back

    public T getItem(){
        return item;
    }
}
