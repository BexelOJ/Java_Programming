public class Java_20261025_09_HouseRobberII {
    static int robRange(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return Math.max(0, nums[0]);

        return Math.max(
            robRange(nums, 0, nums.length - 2),
            robRange(nums, 1, nums.length - 1)
        );
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 3, 2})); // 3
    }
}


