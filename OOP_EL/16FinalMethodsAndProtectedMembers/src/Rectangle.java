public class Rectangle extends Shape {

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {  // ← Add this
        super(width, height);
    }
    public double getArea() {
        return width * height;

    }
}
