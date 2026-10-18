
public class Java_20261018_50_MinimumSwapsToGroupAllOnesTogether {

    public static int minSwaps(int[] nums) {
        int ones = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
        }

        if (ones <= 1) {
            return 0;
        }

        int zeroCount = 0;

        for (int i = 0; i < ones; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        int minSwaps = zeroCount;

        for (int right = ones; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            if (nums[right - ones] == 0) {
                zeroCount--;
            }

            minSwaps = Math.min(minSwaps, zeroCount);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};

        System.out.println(minSwaps(nums));
    }
}




