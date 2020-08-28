import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> storesNames = new ArrayList<>();
        int numberOfStores = sc.nextInt();
        for (int i = 0; i < numberOfStores; i++) {
            String storeName = sc.next();
            LocalTime closingTime = LocalTime.parse(sc.next());
            if (closingTime.isAfter(LocalTime.parse("20:00"))) {
                storesNames.add(storeName);
            }
        }
        for (String s : storesNames) {
            System.out.println(s);
        }
    }
}