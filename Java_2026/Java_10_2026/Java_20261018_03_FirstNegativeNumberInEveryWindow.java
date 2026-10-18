
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261018_03_FirstNegativeNumberInEveryWindow {

    public static int[] firstNegativeInEveryWindow(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];

        // Store indices of negative elements
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Store the index if the current element is negative
            if (arr[i] < 0) {
                deque.offerLast(i);
            }

            // Process the window once its size reaches k
            if (i >= k - 1) {

                if (!deque.isEmpty()) {
                    result[resultIndex] = arr[deque.peekFirst()];
                } else {
                    result[resultIndex] = 0;
                }

                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int[] result = firstNegativeInEveryWindow(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("First negative number in every window:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}





