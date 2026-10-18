
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261018_09_SumOfMinimumAndMaximumInEveryWindow {

    public static int sumOfMinAndMax(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = arr.length;
        int totalSum = 0;

        // Store indices for maximum and minimum elements
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!maxDeque.isEmpty() &&
                   maxDeque.peekFirst() <= i - k) {
                maxDeque.pollFirst();
            }

            while (!minDeque.isEmpty() &&
                   minDeque.peekFirst() <= i - k) {
                minDeque.pollFirst();
            }

            // Maintain decreasing order for maximum
            while (!maxDeque.isEmpty() &&
                   arr[maxDeque.peekLast()] <= arr[i]) {
                maxDeque.pollLast();
            }

            // Maintain increasing order for minimum
            while (!minDeque.isEmpty() &&
                   arr[minDeque.peekLast()] >= arr[i]) {
                minDeque.pollLast();
            }

            // Add the current index to both deques
            maxDeque.offerLast(i);
            minDeque.offerLast(i);

            // Process each complete window
            if (i >= k - 1) {

                int maximum = arr[maxDeque.peekFirst()];
                int minimum = arr[minDeque.peekFirst()];

                totalSum += minimum + maximum;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;

        int result = sumOfMinAndMax(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Sum of minimum and maximum in every window: "
                           + result);
    }
}





