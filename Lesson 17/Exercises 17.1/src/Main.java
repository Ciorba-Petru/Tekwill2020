import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LocalDate.parse(sc.nextLine()).minusYears(30));
        System.out.println(LocalDate.parse(sc.nextLine()).plusYears(30));
    }
}
