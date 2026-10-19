
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_11_FindSubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] array = {10, 2, -2, -20, 10};
        int target = -10;

        Map<Long, Integer> prefixMap = new HashMap<>();
        long prefixSum = 0;

        prefixMap.put(0L, -1);

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long required = prefixSum - target;

            if (prefixMap.containsKey(required)) {
                int start = prefixMap.get(required) + 1;

                System.out.println("Subarray found:");
                for (int j = start; j <= i; j++) {
                    System.out.print(array[j] + " ");
                }

                System.out.println("\nStart index: " + start);
                System.out.println("End index: " + i);
                return;
            }

            prefixMap.putIfAbsent(prefixSum, i);
        }

        System.out.println("No subarray found.");
    }
}



