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
}

public void Player() {
        if (currentPlayerMark == 'O') {
            currentPlayerMark = 'X';
        } else {
            currentPlayerMark = 'O';
        }
    }



