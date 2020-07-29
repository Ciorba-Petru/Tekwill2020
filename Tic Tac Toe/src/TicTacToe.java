import java.util.Scanner;

public class TicTacToe {
    private char[][] board = new char[3][3];
    private char currentPlayerMark;

    public void printBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String input = sc.nextLine();
        int nextChar = 0;
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                board[i][j] = input.charAt(nextChar++);
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public boolean checkForWinX() {

        return (checkRowsForWinX() || checkColumnsForWinX() || checkDiagonalsForWinX());
    }

    public boolean checkForWinO() {

        return (checkRowsForWinO() || checkColumnsForWinO() || checkDiagonalsForWinO());
    }

    public boolean checkRowsForWinX() {
        for (int i = 0; i < 3; i++) {
            if (checkX(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkRowsForWinO() {
        for (int i = 0; i < 3; i++) {
            if (checkO(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumnsForWinX() {
        for (int i = 0; i < 3; i++) {
            if (checkX(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumnsForWinO() {
        for (int i = 0; i < 3; i++) {
            if (checkO(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalsForWinX() {
        return ((checkX(board[0][0], board[1][1], board[2][2])) || (checkX(board[0][2], board[1][1], board[2][0])));
    }

    public boolean checkDiagonalsForWinO() {
        return ((checkO(board[0][0], board[1][1], board[2][2])) || (checkX(board[0][2], board[1][1], board[2][0])));
    }

    public boolean checkX(char c1, char c2, char c3) {

        return ((c1 == 'X') && (c1 == c2) && (c2 == c3));
    }

    public boolean checkO(char c1, char c2, char c3) {

        return ((c1 == 'O') && (c1 == c2) && (c2 == c3));
    }

    public boolean isImpossible() {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    countX++;
                } else if (board[i][j] == 'O') {
                    countO++;
                }
            }
        }
            return Math.abs(countX - countO) > 1;
    }
    public boolean isFinished() {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
        public String result () {
            if (checkForWinX() && checkForWinO()|| isImpossible()) {
                return "Impossible";
            } else if (checkForWinX()) {
                return "X wins";
            } else if (checkForWinO()) {
                return "O wins";
            } else if (!isFinished()) {
                return "Game not finished";

            }
            return "Draw";
        }
    }






