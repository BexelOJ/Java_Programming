public class Java_20261023_44_SolveWordSearch {
    static boolean search(char[][] b, String word,
                          int r, int c, int index) {
        if (index == word.length()) return true;

        if (r < 0 || c < 0 || r >= b.length ||
            c >= b[0].length || b[r][c] != word.charAt(index))
            return false;

        char temp = b[r][c];
        b[r][c] = '#';

        boolean found =
            search(b, word, r + 1, c, index + 1) ||
            search(b, word, r - 1, c, index + 1) ||
            search(b, word, r, c + 1, index + 1) ||
            search(b, word, r, c - 1, index + 1);

        b[r][c] = temp;
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


