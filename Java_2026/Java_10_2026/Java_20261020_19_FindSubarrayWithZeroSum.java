
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_19_FindSubarrayWithZeroSum {

    public static void main(String[] args) {
        int[] array = {4, 2, -3, 1, 6};

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long prefixSum = 0;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            if (firstIndex.containsKey(prefixSum)) {
                int start = firstIndex.get(prefixSum) + 1;

                System.out.println("Zero-sum subarray found:");

                for (int j = start; j <= i; j++) {
                    System.out.print(array[j] + " ");
                }

                System.out.println("\nStart index: " + start);
                System.out.println("End index: " + i);
                return;
            }

            firstIndex.put(prefixSum, i);
        }

        System.out.println("No zero-sum subarray found.");
    }
}



