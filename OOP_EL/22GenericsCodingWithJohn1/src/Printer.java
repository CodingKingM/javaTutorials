 class Printer <T> {

    T thingToPrint;

    // Constructor
    public Printer(T thingToPrint) {
       this.thingToPrint = thingToPrint;
    }
    //Method
    public void print(){
        System.out.println(thingToPrint);
    }
}

