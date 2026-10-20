public class Java_20261023_40_FindAllPathsInMaze {
    static void solve(int[][] maze, int row, int col, String path) {
        int n = maze.length;
        int m = maze[0].length;

        if (row >= n || col >= m || maze[row][col] == 0) return;

        if (row == n - 1 && col == m - 1) {
            System.out.println(path);
            return;
        }

        solve(maze, row, col + 1, path + "R");
        solve(maze, row + 1, col, path + "D");
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        solve(maze, 0, 0, "");
    }
}


