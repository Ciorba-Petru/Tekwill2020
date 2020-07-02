import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner heightFeeds = new Scanner(System.in);
        System.out.print("Sample input 1: ");
        int h = heightFeeds.nextInt();
        int a = heightFeeds.nextInt();
        int b = heightFeeds.nextInt();
        System.out.println("Sample output 1: " + h / (a - b));
        System.out.print("Sample input 2: ");
        int h1 = heightFeeds.nextInt();
        int a1 = heightFeeds.nextInt();
        int b1 = heightFeeds.nextInt();
        System.out.println("Sample output 2: " + h1 / (a1 - b1));
    }
}
