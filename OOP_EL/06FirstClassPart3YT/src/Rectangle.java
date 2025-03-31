public class Rectangle {

    // we have 2 attributes LENGTH and Width

    private double length;     // private is used as data hiding
    private double width;      // is an instance variable

    public void setLength(double len) {
        length = len;
    }
    public void setWidth(double w) {
        width = w;
    }

    // we need 3 methods, one to return length, one to return width, one to return the area of the rectangle
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }


}

