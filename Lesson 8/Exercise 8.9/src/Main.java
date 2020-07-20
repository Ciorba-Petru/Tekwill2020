/*Fix the method to print strings in the reverse order(medium) recursion*/
import java.util.Scanner;

public class Main {
    /*Fix this method*/
    public static void printReverseCharByChar(String s) {


        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.print(s.charAt(last));//change place with printReverseCharByChar(s.substring(0, last));
            printReverseCharByChar(s.substring(0, last));//change place with System.out.print(s.charAt(last));
        /* Other method:
            StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
            */
        }

    }

    /*Do not change code below*/
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}