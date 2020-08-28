import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate initial = LocalDate.of(sc.nextInt(), sc.nextInt(), 1);
        System.out.println(initial.withDayOfMonth(1) + " " + initial.withDayOfMonth(initial.lengthOfMonth()));
    }
}
