import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Squares {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");

        }
    }
}

