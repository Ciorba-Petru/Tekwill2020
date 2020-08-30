import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        try {
            int i = Integer.parseInt(sc.next());
            System.out.println(s[i]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Not exists this index");
        }
    }
}
