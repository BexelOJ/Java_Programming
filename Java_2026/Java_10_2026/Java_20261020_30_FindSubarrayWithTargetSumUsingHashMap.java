
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_30_FindSubarrayWithTargetSumUsingHashMap {

    public static void main(String[] args) {
        int[] array = {10, 2, -2, -20, 10};
        int target = -10;

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long prefixSum = 0;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long required = prefixSum - target;

            if (firstIndex.containsKey(required)) {
                int start = firstIndex.get(required) + 1;

                System.out.println("Subarray found:");

                for (int j = start; j <= i; j++) {
                    System.out.print(array[j] + " ");
                }

                System.out.println();
                System.out.println("Start index: " + start);
                System.out.println("End index: " + i);
                return;
            }

            firstIndex.putIfAbsent(prefixSum, i);
        }

        System.out.println("No subarray found.");
    }
}



