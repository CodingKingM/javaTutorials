public class Car {

    private String maker;
    private int model;
    private static int no_of_objects; // instant field (saves data only to the current object )

    public Car() { // constructor which are the default values
        maker = "Honda";
        model = 2020;
        no_of_objects++;
    }

    public Car(String m, int mo) { // so the user can input the default values
        maker = m;
        model = mo;
        no_of_objects++;
    }

    public static int getNo_of_objects() { // instant method
        return no_of_objects;
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

