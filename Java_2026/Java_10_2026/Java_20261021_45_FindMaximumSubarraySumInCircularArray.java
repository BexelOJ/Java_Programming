
import java.util.Arrays;

public class Java_20261021_45_FindMaximumSubarraySumInCircularArray {

    static int maxCircularSubarraySum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException(
                    "Array cannot be empty");
        }

        int total = 0;
        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int value : array) {
            currentMax = Math.max(value, currentMax + value);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(value, currentMin + value);
            minSum = Math.min(minSum, currentMin);

            total += value;
        }

        // If all elements are negative, wrapping would give zero
        // by choosing an empty subarray, which is not allowed.
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {
        int[] array = {5, -3, 5};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum circular subarray sum: "
                + maxCircularSubarraySum(array));
    }
}



