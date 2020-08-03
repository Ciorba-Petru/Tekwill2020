public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape();
        Triangle t = new Triangle(4.2, 5.2);
        Circle c = new Circle(2);
        Square sq = new Square(3);
        Rectangle r = new Rectangle(2,3);
        System.out.println(sh.area());
        System.out.println(t.area());
        System.out.println(c.area());
        System.out.println(sq.area());
        System.out.println(r.area());
    }
}
