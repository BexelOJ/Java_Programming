
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261018_07_MinimumOfEverySubarrayOfSizeK {

    public static int[] minOfEverySubarray(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];

        // Store indices in increasing order of their values
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove larger elements from the back
            while (!deque.isEmpty() &&
                   arr[deque.peekLast()] >= arr[i]) {
                deque.pollLast();
            }

            // Add the current element's index
            deque.offerLast(i);

            // Record the minimum when the window is complete
            if (i >= k - 1) {
                result[resultIndex] = arr[deque.peekFirst()];
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = minOfEverySubarray(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Minimum of every window:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}





