import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-DDD HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(sc.nextLine()).plusMinutes(sc.nextInt());
        String formattedDateTime = ldt.format(formatter);
        System.out.println(formattedDateTime);
    }
}
