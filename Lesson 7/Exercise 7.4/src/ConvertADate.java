import java.util.Scanner;

public class ConvertADate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] parts = date.split("-");
        String[] newParts = new String[3];
        newParts[0] = parts[1];
        newParts[1] = parts[2];
        newParts[2] = parts[0];
        System.out.println(newParts[0] + "/" + newParts[1] + "/" + newParts[2]);
    }
}