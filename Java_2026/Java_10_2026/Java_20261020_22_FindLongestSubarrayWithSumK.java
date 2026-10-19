
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_22_FindLongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] array = {1, -1, 5, -2, 3};
        int k = 3;

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long prefixSum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            long required = prefixSum - k;

            if (firstIndex.containsKey(required)) {
                int length = i - firstIndex.get(required);

                if (length > maxLength) {
                    maxLength = length;
                    start = firstIndex.get(required) + 1;
                    end = i;
                }
            }

            firstIndex.putIfAbsent(prefixSum, i);
        }

        System.out.println("Longest length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        }
    }
}




