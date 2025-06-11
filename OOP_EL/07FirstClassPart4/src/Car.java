public class Car {

    private String maker;
    private int model;

    public void setmaker(String m) {

        if ( m == "Toyota" || m == "Honda" || m == "Mercedes" ) { // to accept certain manufactureres
            maker = m;
        } else {
            System.out.println("Invalid maker");
        }

    }
    public void setmodel(int year) {
        if (year > 2010) {  // so the year cant be a negative also not smaller than year 0 lol
            model = year;
        } else {
            System.out.println("Invalid model year");
        }

    }

    public String getmaker() {
        return maker;
    }
    public int getmodel() {
        return model;
    }

}

