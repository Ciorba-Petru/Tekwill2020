import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner parameters = new Scanner(System.in);
        System.out.print("Please, introduce the segments length, width and number of segments to break off: ");
        int length = parameters.nextInt();
        int width = parameters.nextInt();
        int cellsNumbers = parameters.nextInt();

        if (cellsNumbers <= length * width && cellsNumbers > 0) {
            if (cellsNumbers % length == 0 || cellsNumbers % width == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}


