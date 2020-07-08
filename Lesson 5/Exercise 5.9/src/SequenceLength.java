import java.util.Scanner;

public class SequenceLength {
    public static void main(String[] args) {
        Scanner sequence = new Scanner(System.in);
        System.out.print("Introduce 5 numbers: ");
        int a = sequence.nextInt(); //= sequence.nextInt();
        int count = 0;
        while (a != 0) {
            count++;
            a = sequence.nextInt();
            if (a == 0) {
                continue;
            }
        }
        System.out.println(count);
    }
}