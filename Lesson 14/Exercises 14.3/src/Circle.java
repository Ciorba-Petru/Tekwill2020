public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "A circle has a radius = " + radius + " : perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
