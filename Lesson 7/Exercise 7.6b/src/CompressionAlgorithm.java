import java.util.*;

public class CompressionAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char zero = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == zero) {
                count++;
            } else {
                System.out.printf("%c%d", zero, count);
                zero = str.charAt(i);
                count = 1;
            }
        }
        System.out.printf("%c%d", zero, count);
    }
}


