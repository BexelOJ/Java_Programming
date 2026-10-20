import java.util.*;

public class Java_20261023_38_SolveCombinationSumII {
    static void solve(int[] a, int start, int target,
                      List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }

        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) continue;
            if (a[i] > target) break;

            current.add(a[i]);
            solve(a, i + 1, target - a[i], current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(a);
        solve(a, 0, 8, new ArrayList<>());
    }
}


