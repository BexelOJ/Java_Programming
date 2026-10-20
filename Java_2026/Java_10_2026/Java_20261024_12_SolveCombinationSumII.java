import java.util.*;

public class Java_20261024_12_SolveCombinationSumII {
    static void solve(int[] a, int start, int target,
                      List<Integer> path) {
        if (target == 0) {
            System.out.println(path);
            return;
        }

        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) continue;
            if (a[i] > target) break;

            path.add(a[i]);
            solve(a, i + 1, target - a[i], path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(a);
        solve(a, 0, 8, new ArrayList<>());
    }
}


