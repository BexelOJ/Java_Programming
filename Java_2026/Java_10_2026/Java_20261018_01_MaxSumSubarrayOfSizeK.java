
import java.util.Scanner;

public class Java_20261018_01_MaxSumSubarrayOfSizeK {

    public static int maxSumSubarray(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {

            // Remove the element leaving the window
            windowSum -= arr[i - k];

            // Add the new element entering the window
            windowSum += arr[i];

            // Update the maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubarray(arr, k);

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Maximum subarray sum: " + result);
    }
}




