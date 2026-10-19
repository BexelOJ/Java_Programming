
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_25_FindSubarrayWithSumMultipleOfK {

    public static void main(String[] args) {
        int[] array = {23, 2, 4, 6, 7};
        int k = 6;

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long prefixSum = 0;
        int start = -1;
        int end = -1;
        long divisor = Math.abs((long) k);

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long key;

            if (divisor == 0) {
                key = prefixSum;
            } else {
                key = prefixSum % divisor;
            }

            if (firstIndex.containsKey(key)) {
                int previous = firstIndex.get(key);

                if (i - previous >= 2) {
                    start = previous + 1;
                    end = i;
                    break;
                }
            } else {
                firstIndex.put(key, i);
            }
        }

        if (start == -1) {
            System.out.println("No valid subarray found.");
        } else {
            System.out.println("Valid subarray found:");

            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println();
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        }
    }
}



