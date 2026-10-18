
public class Java_20261018_49_MaximumSumOfTwoNonOverlappingSubarrays {

    public static int maxSumTwoNoOverlap(
            int[] nums, int firstLen, int secondLen) {

        return Math.max(
                maxInOrder(nums, firstLen, secondLen),
                maxInOrder(nums, secondLen, firstLen)
        );
    }

    private static int maxInOrder(
            int[] nums, int leftLen, int rightLen) {

        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        int maxLeftSum = 0;
        int maxTotal = 0;

        for (int i = leftLen + rightLen; i <= n; i++) {
            int leftSum = prefixSum[i - rightLen]
                    - prefixSum[i - rightLen - leftLen];

            maxLeftSum = Math.max(maxLeftSum, leftSum);

            int rightSum = prefixSum[i]
                    - prefixSum[i - rightLen];

            maxTotal = Math.max(
                    maxTotal, maxLeftSum + rightSum);
        }

        return maxTotal;
    }

    public static void main(String[] args) {
        int[] nums = {0, 6, 5, 2, 2, 5, 1, 9, 4};
        int firstLen = 1;
        int secondLen = 2;

        System.out.println(
                maxSumTwoNoOverlap(nums, firstLen, secondLen));
    }
}




