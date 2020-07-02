import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner squirrels = new Scanner(System.in);
        System.out.print("Sample Input 1: ");
        int n = squirrels.nextInt();
        Scanner nuts = new Scanner(System.in);
        int k = nuts.nextInt();
        System.out.print("Sample Output 1: ");
        System.out.println(k / n);

    }

}

