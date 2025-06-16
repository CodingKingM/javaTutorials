public class Rectangle {

    // we have 2 attributes LENGTH and Width

    private double length;     // private is used as data hiding
    private double width;      // is an instance variable

    public Rectangle() {    //creating a constructor with default values for length and width
        length = 10;        // default values
        width = 15;
        System.out.println("a new room is created with " + length + " length and " + width + " width");
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        length = 70;
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
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

