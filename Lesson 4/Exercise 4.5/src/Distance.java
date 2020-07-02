import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.println("Sample input 1: ");
        double dis = date.nextDouble();
        double time = date.nextDouble();
        System.out.println("Sample output 1: " + dis / time);
    }
}
