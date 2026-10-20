import java.util.*;

public class Java_20261024_37_SolveEqualSumPartition {
    static boolean solve(int[] a, int index, int target,
                         List<Integer> path) {
        if (target == 0) {
            System.out.println("First subset: " + path);
            return true;
        }

        if (index == a.length || target < 0) return false;

        path.add(a[index]);
        if (solve(a, index + 1, target - a[index], path))
            return true;

        path.remove(path.size() - 1);
        return solve(a, index + 1, target, path);
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 11, 5};
        int sum = Arrays.stream(a).sum();

        if (sum % 2 != 0) {
            System.out.println("No equal partition");
        } else if (!solve(a, 0, sum / 2, new ArrayList<>())) {
            System.out.println("No equal partition");
        }
    }
}


