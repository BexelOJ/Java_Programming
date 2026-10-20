import java.util.*;

public class Java_20261024_38_FindKthPermutationSequence {
    static void solve(List<Integer> nums, String path, int[] k) {
        if (nums.isEmpty()) {
            k[0]--;
            if (k[0] == 0) System.out.println(path);
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            int x = nums.remove(i);

            solve(nums, path + x, k);

            nums.add(i, x);

            if (k[0] == 0) return;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 4;

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);

        if (k < 1) {
            System.out.println("Invalid k");
            return;
        }

        solve(nums, "", new int[]{k});
    }
}


