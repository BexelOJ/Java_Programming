
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_08_CountDistinctElementsInEveryWindow {

    public static int[] countDistinctElements(int[] arr, int k) {

        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];

        // Store each element and its frequency in the current window
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Add the first k elements to the window
        for (int i = 0; i < k; i++) {
            frequencyMap.put(
                arr[i],
                frequencyMap.getOrDefault(arr[i], 0) + 1
            );
        }

        result[0] = frequencyMap.size();

        // Slide the window across the array
        for (int i = k; i < n; i++) {

            // Remove the element leaving the window
            int outgoingElement = arr[i - k];

            int frequency = frequencyMap.get(outgoingElement);

            if (frequency == 1) {
                frequencyMap.remove(outgoingElement);
            } else {
                frequencyMap.put(outgoingElement, frequency - 1);
            }

            // Add the element entering the window
            int incomingElement = arr[i];

            frequencyMap.put(
                incomingElement,
                frequencyMap.getOrDefault(incomingElement, 0) + 1
            );

            // Number of distinct elements equals the map size
            result[i - k + 1] = frequencyMap.size();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        int[] result = countDistinctElements(arr, k);

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Distinct element counts:");

        for (int count : result) {
            System.out.print(count + " ");
        }

        System.out.println();
    }
}





