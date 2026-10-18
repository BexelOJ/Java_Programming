
public class Java_20261018_41_CountSubarraysWithExactlyKOddNumbers {

    public static long numberOfSubarrays(int[] nums, int k) {
        return countAtMostKOdd(nums, k)
                - countAtMostKOdd(nums, k - 1);
    }

    private static long countAtMostKOdd(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        int left = 0;
        int oddCount = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        System.out.println(numberOfSubarrays(nums, k));
    }
}




