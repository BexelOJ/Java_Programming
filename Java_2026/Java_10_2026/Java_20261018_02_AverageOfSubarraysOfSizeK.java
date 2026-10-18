
public class Java_20261018_02_AverageOfSubarraysOfSizeK {

    public static double[] averageOfSubarrays(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        double[] averages = new double[arr.length - k + 1];

        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        averages[0] = (double) windowSum / k;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {

            // Remove the element leaving the window
            windowSum -= arr[i - k];

            // Add the element entering the window
            windowSum += arr[i];

            // Calculate the average of the current window
            averages[i - k + 1] = (double) windowSum / k;
        }

        return averages;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        double[] result = averageOfSubarrays(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Averages of subarrays:");

        for (double average : result) {
            System.out.printf("%.2f ", average);
        }

        System.out.println();
    }
}

