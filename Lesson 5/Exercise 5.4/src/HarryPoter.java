import java.util.Scanner;

public class HarryPoter {
    public static void main(String[] args) {
        Scanner house = new Scanner(System.in);
        System.out.print("Please, introduce the house: ");
        String h = house.nextLine();
        String g = "The " + h + " house means: ";
        switch (h) {
            case "gryffindor":
                System.out.println(g + "bravery");
                break;
            case "hufflepuff":
                System.out.println(g + "loyalty");
                break;
            case "slytherin":
                System.out.println(g + "cunning");
                break;
            case "ravenclaw":
                System.out.println(g + "intellect");
                break;
            default:
                System.out.println(g + "not a valid house");
                break;
        }
    }
}
