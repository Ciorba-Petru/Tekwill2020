import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner interval = new Scanner(System.in);
        System.out.println("Introduce interval: ");
        int a = interval.nextInt();
        int b = interval.nextInt();
        for (int i = a; i <= b; i++) {

            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBizz");
            } else if (i % 5 == 0) {
                System.out.println("Bizz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }


        }
    }
}
