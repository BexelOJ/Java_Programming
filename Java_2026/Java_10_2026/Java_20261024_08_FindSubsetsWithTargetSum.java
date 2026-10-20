import java.util.*;

public class Java_20261024_08_FindSubsetsWithTargetSum {
    static void find(int[] a, int index, int target,
                     List<Integer> path) {
        if (index == a.length) {
            if (target == 0) System.out.println(path);
            return;
        }

        path.add(a[index]);
        find(a, index + 1, target - a[index], path);
        path.remove(path.size() - 1);

        find(a, index + 1, target, path);
    }

    public static void main(String[] args) {
        find(new int[]{1, 2, 3, 4}, 0, 5, new ArrayList<>());
    }
}


