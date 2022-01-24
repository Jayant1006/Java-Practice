public class Circle {
    private double radius;
    private String color;

    // Constructor : without any arguments

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // constructor with single argument
    public Circle(double val) {
        radius = val;
        color = "red";
    }

    // constructor with both the variables passed as an arguments
    public Circle(double val, String s) {
        radius = val;
        color = s;
    }

    // Public methods

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
