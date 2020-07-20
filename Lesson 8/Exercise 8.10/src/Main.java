import java.util.Scanner;

public class Main {
    public static long sum(int s) {
        if (s == 1) {
            return 1;
        } else {
            return s + sum(s - 1);
        }
    }

    /*Do not change the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}