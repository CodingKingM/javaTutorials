public class Car {

    private String maker;
    private int model;

    public Car() { // constructor which are the default values
        maker = "Honda";
        model = 2020;
    }

    public Car(String m, int mo) { // so the user can input the default values
        maker = m;
        model = mo;
    }

    public void setMaker(String m) {

        if ( m == "Toyota" || m == "Honda" || m == "Mercedes" ) { // to accept certain manufactureres
            maker = m;
        } else {
            System.out.println("Invalid maker");
        }

    }
    public void setModel(int year) {
        if (year > 2010) {  // so the year cant be a negative also not smaller than year 0 lol
            model = year;
        } else {
            System.out.println("Invalid model year");
        }

    }

    public String getMaker() {
        return maker;
    }
    public int getModel() {
        return model;
    }

}

