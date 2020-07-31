import java.util.Scanner;

public class Heron {
    public static void main(String[] args) {
        Scanner sides = new Scanner(System.in);
        int s1 = sides.nextInt();
        int s2 = sides.nextInt();
        int s3 = sides.nextInt();
        int area = (s1 + s2 + s3) / 2;
        System.out.println(Math.sqrt(area * (area - s1) * (area - s2) * (area - s3)));
    }
}






