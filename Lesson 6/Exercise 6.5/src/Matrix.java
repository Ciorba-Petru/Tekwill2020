import java.util.Scanner;
public class Matrix {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = Math.abs(i - j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}