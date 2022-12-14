package ge.tbc.testautomation.oop2.figures;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double width, double height) {
        a = width;
        b = height;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
