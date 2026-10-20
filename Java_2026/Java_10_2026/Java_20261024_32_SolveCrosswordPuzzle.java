public class Java_20261024_32_SolveCrosswordPuzzle {
    static char[][] board = {
        {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '-', '-', '-', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '-', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '-', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '-', '-', '-', '-', '+', '+', '+'},
        {'+', '+', '+', '-', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '-', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'}
    };

    static boolean place(String word, int r, int c, boolean horizontal) {
        int dr = horizontal ? 0 : 1;
        int dc = horizontal ? 1 : 0;

        for (int i = 0; i < word.length(); i++) {
            int nr = r + dr * i, nc = c + dc * i;
            if (nr >= 10 || nc >= 10 ||
                (board[nr][nc] != '-' && board[nr][nc] != word.charAt(i)))
                return false;
        }

        for (int i = 0; i < word.length(); i++)
            board[r + dr * i][c + dc * i] = word.charAt(i);

        return true;
    }

    static void printBoard() {
        for (char[] row : board) System.out.println(row);
    }

    public static void main(String[] args) {
        // Demonstrates placing a word horizontally.
        if (place("JAVA", 1, 1, true))
            printBoard();
        else
            System.out.println("Word does not fit");
    }
}


