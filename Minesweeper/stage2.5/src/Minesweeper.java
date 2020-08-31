import java.util.Scanner;
import java.util.Random;

public class Minesweeper {

    char[][] minesweeper = new char[9][9];
    Random randNum = new Random();
    Scanner sc = new Scanner(System.in);

    public Minesweeper() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                minesweeper[i][j] = '*';
            }
        }
    }

    public void printMinesweeper() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(minesweeper[i][j]);
            }
            System.out.println();
        }
    }

    public void randomX() {
        System.out.print("How many mines do you want on the field?: ");
        int numberOfMines = sc.nextInt();
        int i = 0;
        while (i < numberOfMines) {
            int x = randNum.nextInt(9);
            int y = randNum.nextInt(9);
            if (minesweeper[x][y] == '*') {
                minesweeper[x][y] = 'X';
                i++;
            }
        }
        printMinesweeper();
    }
}
