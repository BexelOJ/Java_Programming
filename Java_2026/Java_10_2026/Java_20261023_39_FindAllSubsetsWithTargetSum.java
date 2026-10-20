import java.util.*;

public class Java_20261023_39_FindAllSubsetsWithTargetSum {
    static void solve(int[] a, int index, int target,
                      List<Integer> current) {
        if (index == a.length) {
            if (target == 0) System.out.println(current);
            return;
        }

        current.add(a[index]);
        solve(a, index + 1, target - a[index], current);
        current.remove(current.size() - 1);

        solve(a, index + 1, target, current);
    }

    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 4}, 0, 5, new ArrayList<>());
    }
}


