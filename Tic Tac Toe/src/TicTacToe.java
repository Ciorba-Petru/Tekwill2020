import java.util.Scanner;

class TicTacToe {

    private char[][] board = new char[3][3];
    Scanner sc = new Scanner(System.in);
    char player = 'X';

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public void changeBoard() {
        while (!hasWon('X') && !hasWon('O') && !isFinished()) {

            System.out.print("Enter the coordinates: ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n < 1 || n > 3 || m < 1 || m > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                int x = n - 1;
                int y = m - 1;

                if (board[x][y] == ' ' && player == 'X') {
                    this.board[x][y] = 'X';
                    player = 'O';

                } else if (board[x][y] == ' ' && player == 'O') {
                    this.board[x][y] = 'O';
                    player = 'X';

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            }
            printBoard();
        }
        System.out.println(getResult());
    }


    private boolean hasWon(char ch) {
        return (checkRowForChar(ch) || checkColumnsChar(ch) || checkDiagonals(ch));
    }

    private boolean checkRowForChar(char ch) {
        for (int i = 0; i < 3; i++) {
            if (check(ch, board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsChar(char ch) {
        for (int i = 0; i < 3; i++) {
            if (check(ch, board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(char ch) {
        return ((check(ch, board[0][0], board[1][1], board[2][2])) || (check(ch, board[0][2], board[1][1], board[2][0])));
    }

    private boolean check(char ch, char c1, char c2, char c3) {
        return ((c1 == ch) && (c1 == c2) && (c2 == c3));
    }

    private boolean isFinished() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public String getResult() {
        boolean xWon = hasWon('X');
        boolean oWon = hasWon('O');

        if (xWon) {
            return "X wins";
        } else if (oWon) {
            return "O wins";
        }
        return "Draw";
    }
}