import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        if(Integer.parseInt(sc.nextLine()) == 0) {
            list.add(sc.nextLine());
        } else {
            return;
        }
        /*for (String s : list) {
            try {
                Integer.parseInt(s);
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }

        }*/

    }
}
