import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date1 = LocalDate.parse(sc.next());
        LocalDate date2 = date1.plusDays(sc.nextInt());
        System.out.println(date1.getYear() != date2.getYear());
    }

}
