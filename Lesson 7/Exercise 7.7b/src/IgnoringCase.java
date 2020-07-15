import java.util.Scanner;

public class IgnoringCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder strb = new StringBuilder(s);
        System.out.println(strb.substring(0, 1).equalsIgnoreCase("j"));
    }
}
