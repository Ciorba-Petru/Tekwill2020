public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double semi = (a + b + c) / 2;
        return Math.sqrt(semi * ((semi - a) * (semi - b) * (semi - c)));
    }

    public String toString() {
        return "A triangle has three sides a = " + a + ", b = " + b + " and c = " + c + " : perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
