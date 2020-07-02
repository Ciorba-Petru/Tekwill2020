import java.util.Scanner;

public class printBoolean {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Sample input: ");
        int value = number.nextInt();
        boolean result = (value > 0 && value < 10);
        System.out.println("Sample output: " + result);
    }
}
