import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arraySize = array.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = array.nextInt();
        }
        System.out.println("Enter a number: ");
        int n = array.nextInt();
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] > n) {
                sum += numbers[i];
            }

        }
        System.out.println("The sum is: " + sum);
    }
}





