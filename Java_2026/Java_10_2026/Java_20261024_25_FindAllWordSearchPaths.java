public class Java_20261024_25_FindAllWordSearchPaths {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static void search(char[][] b, String word, int r, int c, int i,
                       boolean[][] used, String path) {
        if (i == word.length()) {
            System.out.println(path);
            return;
        }

        if (r < 0 || c < 0 || r >= b.length ||
            c >= b[0].length || used[r][c] ||
            b[r][c] != word.charAt(i)) return;

        used[r][c] = true;
        String next = path + "(" + r + "," + c + ") ";

        for (int d = 0; d < 4; d++)
            search(b, word, r + dr[d], c + dc[d], i + 1,
                   used, next);

        used[r][c] = false;
    }

    public static void main(String[] args) {
        char[][] b = {
            {'A', 'B', 'C'},
            {'D', 'A', 'B'},
            {'C', 'B', 'A'}
        };

        String word = "AB";
        boolean[][] used = new boolean[b.length][b[0].length];

        for (int r = 0; r < b.length; r++)
            for (int c = 0; c < b[0].length; c++)
                search(b, word, r, c, 0, used, "");
    }
}


