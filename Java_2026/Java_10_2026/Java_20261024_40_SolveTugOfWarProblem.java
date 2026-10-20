import java.util.*;

public class Java_20261024_40_SolveTugOfWarProblem {
    static int bestDiff = Integer.MAX_VALUE;
    static List<Integer> best = new ArrayList<>();

    static void solve(int[] a, int index, List<Integer> left,
                      int sumLeft, int sumTotal) {
        if (index == a.length) {
            if (left.size() != a.length / 2 &&
                left.size() != (a.length + 1) / 2) return;

            int diff = Math.abs(sumTotal - 2 * sumLeft);

            if (diff < bestDiff) {
                bestDiff = diff;
                best = new ArrayList<>(left);
            }
            return;
        }

        if (left.size() < (a.length + 1) / 2) {
            left.add(a[index]);
            solve(a, index + 1, left, sumLeft + a[index], sumTotal);
            left.remove(left.size() - 1);
        }

        solve(a, index + 1, left, sumLeft, sumTotal);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
        int total = Arrays.stream(a).sum();

        solve(a, 0, new ArrayList<>(), 0, total);

        List<Integer> right = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>(best);

        for (int x : a) {
            if (remaining.contains(x)) remaining.remove(Integer.valueOf(x));
            else right.add(x);
        }

        System.out.println("Group 1: " + best);
        System.out.println("Group 2: " + right);
        System.out.println("Difference: " + bestDiff);
    }
}


