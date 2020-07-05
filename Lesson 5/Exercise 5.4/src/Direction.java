import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please, introduce the number of direction: ");
        int n = number.nextInt();
        switch (n) {
            case 0:
                System.out.println("do not move");
                break;
            case 1:
                System.out.println("up");
                break;
            case 2:
                System.out.println("down");
                break;
            case 3:
                System.out.println("left");
                break;
            case 4:
                System.out.println("right");
                break;
            default:
                System.out.println("error!");
                break;

        }
    }
}
