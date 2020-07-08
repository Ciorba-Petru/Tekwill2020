import java.util.Scanner;

public class Produs {
    public static void main(String[] args) {
        Scanner interval = new Scanner(System.in);
        System.out.println("Introduce interval: ");
        int a = interval.nextInt();
        int b = interval.nextInt();
        long produs = 1;
        for (int i = a; i < b; i++) {
            produs *= i;
        }
        System.out.println(produs);

    }
}