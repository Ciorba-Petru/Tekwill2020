import java.awt.Point;
import java.util.*;

public class Minesweeper {

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        minesweeper.randomX();
        minesweeper.game();
    }

    private static final int NR_OF_FIELDS = 81;
    private static final char EMPTY_SPACE = '.';
    char[][] minesweeper = new char[9][9];
    Random randNum = new Random();
    Scanner sc = new Scanner(System.in);
    static List<Point> points = new ArrayList<>();
    static List<Point> guess = new ArrayList<>();
    static Map<Point, Character> fields = init();

    public Minesweeper() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                minesweeper[i][j] = '.';
            }
        }
    }

    boolean finished = false;

    public void game() {
        while (!finished) {
            System.out.print("Set/delete mines marks (x and y coordinates): ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = n - 1;
            int y = m - 1;

            if (n < 0 || n > 9 || m < 0 || m > 9) {
                System.out.println("Coordinates should be from 1 to 9!");

            } else if (fields.get(new Point(x, y)) == '.' && (getCharAt(x, y) == "0" || getCharAt(x, y) == "X")) {
                fields.put(new Point(x, y), '*');
                guess.add(new Point(x, y));
                finished = checkIfFinished();
                printMinesweeper();
            } else if (fields.get(new Point(x, y)) == '*') {
                fields.put(new Point(x, y), '.');
                guess.remove(new Point(x, y));
                finished = checkIfFinished();
                printMinesweeper();
            } else {
                System.out.println("There is a number here!");
            }
        }
        System.out.println("Congratulations! You found all mines!");
    }

    private static boolean checkIfFinished() {
        return points.equals(guess);
    }

    private static Map<Point, Character> init() {
        Map<Point, Character> fields = new HashMap<>(81);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                fields.put(new Point(i, j), '.');
        }
        return fields;
    }

    public void printMinesweeper() {
        System.out.println(" " + "|" + "123456789" + "|");
        System.out.println("-" + "|" + "---------" + "|");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < 9; j++) {
                if (fields.get(new Point(i, j)) == '*') {
                    System.out.print(minesweeper[i][j] = fields.get(new Point(i, j)));
                    minesweeper[i][j] = 'X';
                } else if (minesweeper[i][j] == 'X') {
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
            points.add(new Point(x, y));
            if (minesweeper[x][y] == '.') {
                minesweeper[x][y] = 'X';
                i++;
            }
        }
        printMinesweeper();
    }
}

