import java.util.*;

public class Java_20261023_37_SolveCombinationSum {
    static void solve(int[] a, int start, int target,
                      List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }

        for (int i = start; i < a.length; i++) {
            if (a[i] > target) continue;

            current.add(a[i]);
            solve(a, i, target - a[i], current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve(new int[]{2, 3, 6, 7}, 0, 7, new ArrayList<>());
    }
}


