import java.util.Scanner;
// nu-mi este clar cum de returnat valoarea default int daca scriem null
public class Main {
    public static int convert(Long val) {
        if(val > Integer.MAX_VALUE){
           return Integer.MAX_VALUE;
        }else if(val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(val == null) {
            return 0;
        } else {
            return new Integer(String.valueOf(val));
        }
// Write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();

        Long longVal = "null".equals(val) ? null :
                Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
