import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LocalTime.parse(sc.nextLine()).minusHours(sc.nextInt()).minusMinutes(sc.nextInt()));
    }
}