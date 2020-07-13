import java.util.Scanner;

public class CheckBurgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce city's name: ");
        String city = sc.nextLine();
        boolean endsWith = city.endsWith("burg");
        System.out.println(endsWith);
    }
}
