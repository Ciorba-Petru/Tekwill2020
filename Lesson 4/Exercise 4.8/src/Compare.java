import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Sample input: ");
        int one = numbers.nextInt();
        int two = numbers.nextInt();
        int three = numbers.nextInt();
        boolean compare = (one == two && two == three && one == three);
        System.out.println("Sample output: " + compare);
    }
}
