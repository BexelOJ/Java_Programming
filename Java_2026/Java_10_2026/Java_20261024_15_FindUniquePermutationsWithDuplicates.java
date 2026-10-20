import java.util.*;

public class Java_20261024_15_FindUniquePermutationsWithDuplicates {
    static void solve(int[] a, boolean[] used, List<Integer> path) {
        if (path.size() == a.length) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (used[i]) continue;
            if (i > 0 && a[i] == a[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            path.add(a[i]);

            solve(a, used, path);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        Arrays.sort(a);
        solve(a, new boolean[a.length], new ArrayList<>());
    }
}


