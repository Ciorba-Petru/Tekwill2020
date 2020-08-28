import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(LocalDateTime.parse(sc.nextLine()).plusDays(sc.nextInt()).minusHours(sc.nextInt()));
    }
}