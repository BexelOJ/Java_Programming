public class Java_20261023_41_SolveNQueensProblem {
    static int n = 4;
    static int[] queen = new int[n];

    static boolean safe(int row, int col) {
        for (int r = 0; r < row; r++) {
            if (queen[r] == col ||
                Math.abs(queen[r] - col) == row - r) {
                return false;
            }
        }
        return true;
    }

    static void solve(int row) {
        if (row == n) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++)
                    System.out.print(queen[r] == c ? "Q " : ". ");
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (safe(row, col)) {
                queen[row] = col;
                solve(row + 1);
            }
        }
    }

    public static void main(String[] args) {
        solve(0);
    }
}


