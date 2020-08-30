public class Minesweeper {
    char[][] board = new char[9][9];

    public void Minesweeper() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(board[i][j]);
            }
        }

    }
}
