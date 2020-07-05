import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner NumberOfHours = new Scanner(System.in);
        System.out.println("Please enter the minimum recommended number of hours for sleep: ");
        int minimHours = NumberOfHours.nextInt();
        System.out.println("Please enter the maximum recommended number of hours for sleep: ");
        int maximHours = NumberOfHours.nextInt();
        System.out.println("Please enter the number of sleeping hours: ");
        int personTotalHoursSleep = NumberOfHours.nextInt();

        if (personTotalHoursSleep < minimHours) {
            System.out.println("Deficiency");
        } else if (personTotalHoursSleep > maximHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
