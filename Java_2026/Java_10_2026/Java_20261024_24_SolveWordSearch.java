public class Java_20261024_24_SolveWordSearch {
    static boolean search(char[][] b, String word, int r, int c, int i) {
        if (i == word.length()) return true;

        if (r < 0 || c < 0 || r >= b.length ||
            c >= b[0].length || b[r][c] != word.charAt(i))
            return false;

        char old = b[r][c];
        b[r][c] = '#';

        boolean found =
            search(b, word, r + 1, c, i + 1) ||
            search(b, word, r - 1, c, i + 1) ||
            search(b, word, r, c + 1, i + 1) ||
            search(b, word, r, c - 1, i + 1);

        b[r][c] = old;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";
        boolean found = false;

        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[0].length; c++)
                if (search(board, word, r, c, 0))
                    found = true;

        System.out.println(found);
    }
}


