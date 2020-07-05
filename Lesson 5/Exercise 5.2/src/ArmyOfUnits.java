import java.util.Scanner;

public class ArmyOfUnits {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduce the number of your units: ");
        int numberOfUnits = number.nextInt();
        String generalText = "Your army corresponding to: ";
        if (numberOfUnits < 1) {
            System.out.println(generalText + "no army");
        } else if (numberOfUnits <= 19) {
            System.out.println(generalText + "pack");
        }
        else if (numberOfUnits <= 249) {
            System.out.println(generalText + "throng");
        }
        else if (numberOfUnits <= 999) {
            System.out.println(generalText + "zounds");
        }else{
            System.out.println(generalText + "legion");
        }
    }
}
