import java.util.*;

public class Main {
    public static double sqrt(double x) throws IllegalArgumentException {// write your code here
        throw new IllegalArgumentException("Expecte non-negative number, got " + x);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
