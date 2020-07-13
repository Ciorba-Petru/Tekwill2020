import java.util.Scanner;

public class IgnoringWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String trimmedFirst = first.trim();
        String trimmedSecond = second.trim();
        if (trimmedFirst.replace(" ", "").equals(trimmedSecond.replace(" ", ""))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}