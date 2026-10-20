public class Java_20261024_22_FindAllPathsInMazeWithObstacles {
    static int[][] maze = {
        {1, 1, 0, 1},
        {1, 1, 1, 1},
        {0, 1, 1, 1},
        {1, 1, 0, 1}
    };

    static void solve(int r, int c, boolean[][] visited, String path) {
        int n = maze.length;

        if (r < 0 || c < 0 || r >= n || c >= n ||
            maze[r][c] == 0 || visited[r][c]) return;

        if (r == n - 1 && c == n - 1) {
            System.out.println(path);
            return;
        }

        visited[r][c] = true;

        solve(r + 1, c, visited, path + "D");
        solve(r, c + 1, visited, path + "R");

        visited[r][c] = false;
    }

    public static void main(String[] args) {
        solve(0, 0, new boolean[4][4], "");
    }
}


