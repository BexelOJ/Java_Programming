
public class Java_20261020_16_FindMinimumSubarraySumUsingPrefixSum {

    public static void main(String[] args) {
        int[] array = {3, -4, 2, -3, -1, 7, -5};

        long prefixSum = 0;
        long maxPrefixSum = 0;
        long minSum = Long.MAX_VALUE;

        int maxPrefixIndex = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long currentSum = prefixSum - maxPrefixSum;

            if (currentSum < minSum) {
                minSum = currentSum;
                start = maxPrefixIndex;
                end = i;
            }

            if (prefixSum > maxPrefixSum) {
                maxPrefixSum = prefixSum;
                maxPrefixIndex = i + 1;
            }
        }

        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
    }
}



