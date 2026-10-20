import java.util.*;

public class Java_20261024_39_FindAllDerangements {
    static void solve(int n, int index, int[] p, boolean[] used) {
        if (index == n) {
            System.out.println(Arrays.toString(p));
            return;
        }

        for (int x = 0; x < n; x++) {
            if (used[x] || x == index) continue;

            p[index] = x;
            used[x] = true;

            solve(n, index + 1, p, used);

            used[x] = false;
        }
    }

    public static void main(String[] args) {
        solve(4, 0, new int[4], new boolean[4]);
    }
}


