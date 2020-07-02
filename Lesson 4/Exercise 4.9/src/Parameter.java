import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Sample input 1: ");
        int one = numbers.nextInt();
        int two = numbers.nextInt();
        int three = numbers.nextInt();
        boolean compare = ((one > 0 && two <= 0 && three <= 0) || (one <= 0 && two > 0 && three <= 0) || (one > 0 && two <= 0 && three <= 0));
        System.out.println("Sample output 1: " + compare);
        System.out.print("Sample input 2: ");
        int one1 = numbers.nextInt();
        int two1 = numbers.nextInt();
        int three1 = numbers.nextInt();
        boolean compare2 = ((one1 > 0 && two1 <= 0 && three1 <= 0) || (one1 <= 0 && two1 > 0 && three1 <= 0) || (one1 > 0 && two1 <= 0 && three1 <= 0));
        System.out.println("Sample output 2: " + compare2);
    }
}

