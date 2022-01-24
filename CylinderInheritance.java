
public class CylinderInheritance extends CircleInheritance {
    private double height;

    public CylinderInheritance(double height, double radius, String color) {
        super(radius, color); // Invoke superclass constructor Circle(radius)
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "This is a Cylinder";
    }
}
