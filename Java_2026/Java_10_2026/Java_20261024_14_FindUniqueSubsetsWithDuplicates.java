import java.util.*;

public class Java_20261024_14_FindUniqueSubsetsWithDuplicates {
    static void solve(int[] a, int start, List<Integer> path) {
        System.out.println(path);

        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) continue;

            path.add(a[i]);
            solve(a, i + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        Arrays.sort(a);
        solve(a, 0, new ArrayList<>());
    }
}


