import java.util.*;

public class Java_20261024_11_SolveCombinationSum {
    static void solve(int[] a, int start, int target,
                      List<Integer> path) {
        if (target == 0) {
            System.out.println(path);
            return;
        }

        for (int i = start; i < a.length; i++) {
            if (a[i] > target) continue;

            path.add(a[i]);
            solve(a, i, target - a[i], path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve(new int[]{2, 3, 6, 7}, 0, 7, new ArrayList<>());
    }
}


