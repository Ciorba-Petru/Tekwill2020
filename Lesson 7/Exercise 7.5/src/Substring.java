import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String write = sc.nextLine();
        String litresFind = sc.nextLine();
        System.out.println(write.split(litresFind, -1).length - 1);
    }
}

