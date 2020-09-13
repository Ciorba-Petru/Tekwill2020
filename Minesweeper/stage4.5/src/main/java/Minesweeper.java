import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        minesweeper.randomX();
    }

    char[][] minesweeper = new char[9][9];
    Random randNum = new Random();
    Scanner sc = new Scanner(System.in);

    public Minesweeper() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                minesweeper[i][j] = '.';
            }
        }
    }

    public void changeMinesweeper() {
        while (true) {

            System.out.print("Set/delete mines marks (x and y coordinates): ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = n - 1;
            int y = m - 1;
        }
    }

    public void printMinesweeper() {
        System.out.println(" " + "|" + "123456789" + "|");
        System.out.println("-" + "|" + "---------" + "|");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < 9; j++) {
                if (minesweeper[i][j] == 'X') {
                    System.out.print('.');
                } else {
                    System.out.print(getCharAt(i, j));
                }
            }
            System.out.println("|");
        }
        System.out.println("-" + "|" + "---------" + "|");
    }

    private String getCharAt(int i, int j) {
        if (mineAt(i, j)) {
            return "X";
        }

        int minesNear = countMinesNear(i, j);
        if (minesNear == 0) {
            return ".";
        } else {
            return Integer.toString(minesNear);
        }
    }

    private boolean mineAt(int i, int j) {
        return minesweeper[i][j] == 'X';
    }

    private int countMinesNear(int i, int j) {
        int mines = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (x + i >= 0 && x + i < minesweeper.length && y + j >= 0 && y + j < minesweeper.length) {
                    if (minesweeper[x + i][y + j] == 'X') {
                        mines++;
                    }
                }
            }
        }
        return mines;
    }

    public void randomX() {
        System.out.print("How many mines do you want on the field?: ");
        int numberOfMines = sc.nextInt();
        int i = 0;
        while (i < numberOfMines) {
            int x = randNum.nextInt(9);
            int y = randNum.nextInt(9);
            if (minesweeper[x][y] == '.') {
                minesweeper[x][y] = 'X';
                i++;
            }
        }
        printMinesweeper();
    }
}