public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(10);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
    }
}
