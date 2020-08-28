import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}