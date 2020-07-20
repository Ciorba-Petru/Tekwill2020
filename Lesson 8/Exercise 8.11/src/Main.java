import java.util.*;

public class Main {
    public static double power(double x, int y) {
        if (y != 0) {
            return (x * power(x, y - 1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int y = sc.nextInt();
        double result = power(x, y);
        System.out.printf("%.3f", result);
    }
}
