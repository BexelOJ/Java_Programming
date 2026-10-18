
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261018_06_MaximumOfEverySubarrayOfSizeK {

    public static int[] maxOfEverySubarray(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];

        // Store indices of elements in decreasing order of values
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() &&
                   arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current element's index
            deque.offerLast(i);

            // Record the maximum when the first window is complete
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

        int[] result = maxOfEverySubarray(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Maximum of every window:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}





