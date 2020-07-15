import java.util.Scanner;

public class ConvertADate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        StringBuilder sb = new StringBuilder(date);
        String[] parts = date.split("-");
        System.out.printf("%s/%s/%s", parts[1], parts[2], parts[0]);
    }
}