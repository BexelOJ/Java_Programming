public class Java_20261024_09_FindAllPathsInGrid {
    static void find(int r, int c, int rows, int cols, String path) {
        if (r >= rows || c >= cols) return;

        if (r == rows - 1 && c == cols - 1) {
            System.out.println(path);
            return;
        }

        find(r, c + 1, rows, cols, path + "R");
        find(r + 1, c, rows, cols, path + "D");
    }

    public static void main(String[] args) {
        find(0, 0, 3, 3, "");
    }
}


