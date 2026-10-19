
public class Java_20261020_39_FindMaximumAbsoluteSumOfAnySubarray {

    public static void main(String[] args) {
        int[] array = {1, -3, 2, 3, -4};

        long maxEnding = array[0];
        long minEnding = array[0];

        long maxSum = array[0];
        long minSum = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEnding = Math.max(array[i], maxEnding + array[i]);
            minEnding = Math.min(array[i], minEnding + array[i]);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        long maxAbsoluteSum = Math.max(maxSum, Math.abs(minSum));

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum absolute sum: " + maxAbsoluteSum);
    }
}



