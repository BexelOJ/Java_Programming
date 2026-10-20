import java.util.*;

public class Java_20261024_13_SolveCombinationSumIII {
    static void solve(int start, int k, int target,
                      List<Integer> path) {
        if (path.size() == k) {
            if (target == 0) System.out.println(path);
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > target) break;

            path.add(i);
            solve(i + 1, k, target - i, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve(1, 3, 9, new ArrayList<>());
    }
}


