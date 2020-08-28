import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.abs(LocalTime.parse(sc.nextLine()).toSecondOfDay() - LocalTime.parse(sc.nextLine()).toSecondOfDay()));
    }
}