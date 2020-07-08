import java.util.Scanner;

public class FloorSpace {
    public static void main(String[] args) {
        Scanner roomShape = new Scanner(System.in);
        System.out.println("Please introduce room shape and it's parameters");

        String shape = roomShape.nextLine();
        double a;
        double b;
        double c;
        double r;
        switch (shape) {
            case "triangle":
                a = roomShape.nextDouble();
                b = roomShape.nextDouble();
                c = roomShape.nextDouble();
                double semiPerimeter = (a + b + c) / 2;
                System.out.println(Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)));
                break;
            case "rectangle":
                a = roomShape.nextDouble();
                b = roomShape.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = roomShape.nextDouble();
                System.out.println(Math.PI * r * r);
                break;
        }
    }
}
