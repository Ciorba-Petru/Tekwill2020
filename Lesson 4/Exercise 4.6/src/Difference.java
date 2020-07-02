import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Sample input 1: ");
        double one = inputNumbers.nextDouble();
        double two = inputNumbers.nextDouble();
        System.out.println("Sample output 1: " + (two - one));
    }
}
