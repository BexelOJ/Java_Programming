import java.util.*;

public class Java_20261026_40_FindKthSmallestPairDistance {
    static int countPairsWithinDistance(int[] nums, int distance) {
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((long) nums[right] - nums[left] > distance)
                left++;

            count += right - left;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        int k = 1;

        Arrays.sort(nums);

        if (k < 1 || (long) k > (long) nums.length * (nums.length - 1) / 2)
            throw new IllegalArgumentException("Invalid k");

        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (countPairsWithinDistance(nums, mid) >= k)
                right = mid;
            else
                left = mid + 1;
        }

        System.out.println(left);
    }
}


