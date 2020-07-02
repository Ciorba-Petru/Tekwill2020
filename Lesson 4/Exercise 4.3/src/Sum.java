import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.print("Sample input 1: ");
        int number = digit.nextInt();
        int sum = (number / 100 + (number / 10) % 10 + number % 10);
        System.out.println("Sample output 1: " + sum);
    }
}
