public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }

    public String toString() {
        return "A rectangle has two different sides a = " + a + ", b = " + b + " : perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
