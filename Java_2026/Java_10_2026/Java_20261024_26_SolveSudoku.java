public class Java_20261024_26_SolveSudoku {
    static boolean safe(int[][] b, int r, int c, int x) {
        for (int i = 0; i < 9; i++)
            if (b[r][i] == x || b[i][c] == x) return false;

        int sr = r / 3 * 3, sc = c / 3 * 3;

        for (int i = sr; i < sr + 3; i++)
            for (int j = sc; j < sc + 3; j++)
                if (b[i][j] == x) return false;

        return true;
    }

    static boolean solve(int[][] b) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (b[r][c] != 0) continue;

                for (int x = 1; x <= 9; x++) {
                    if (safe(b, r, c, x)) {
                        b[r][c] = x;
                        if (solve(b)) return true;
                        b[r][c] = 0;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] b = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        if (solve(b)) {
            for (int[] row : b) {
                for (int x : row) System.out.print(x + " ");
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}


