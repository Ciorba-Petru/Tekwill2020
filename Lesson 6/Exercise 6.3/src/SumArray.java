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





       /* int n = array.nextInt();
        if (n>numbers[arraySize]) {
            sum+= numbers[arraySize];
        }
        System.out.println(sum);
    }
}*/
       /* public class ReadingWithScanner {
            public static void main(String args[]) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the length of the array:");
                int length = s.nextInt();
                int [] myArray = new int[length];
                System.out.println("Enter the elements of the array:");

                for(int i=0; i<length; i++ ) {
                    myArray[i] = s.nextInt();
                }

                System.out.println(Arrays.toString(myArray));
            }
        }*/