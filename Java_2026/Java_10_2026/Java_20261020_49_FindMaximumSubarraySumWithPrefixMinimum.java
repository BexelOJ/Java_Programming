
public class Java_20261020_49_FindMaximumSubarraySumWithPrefixMinimum {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        long prefixSum = 0;
        long minPrefix = 0;
        long maxSum = Long.MIN_VALUE;

        int minPrefixIndex = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long currentSum = prefixSum - minPrefix;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = minPrefixIndex;
                end = i;
            }

            if (prefixSum < minPrefix) {
                minPrefix = prefixSum;
                minPrefixIndex = i + 1;
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
    }
}



