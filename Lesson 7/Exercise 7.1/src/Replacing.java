import java.util.Scanner;

public class Replacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a sequence of litres: ");
        String litres = sc.nextLine();
        for (int i = 0; i < litres.length(); i++) {
            if (litres.charAt(i) == 'a') {
                System.out.print('b');
            } else {
                System.out.print(litres.charAt(i));
            }
        }
    }
}
