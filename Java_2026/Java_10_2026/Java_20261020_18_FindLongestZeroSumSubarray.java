
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_18_FindLongestZeroSumSubarray {

    public static void main(String[] args) {
        int[] array = {15, -2, 2, -8, 1, 7, 10, 23};

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long prefixSum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            if (firstIndex.containsKey(prefixSum)) {
                int length = i - firstIndex.get(prefixSum);

                if (length > maxLength) {
                    maxLength = length;
                    start = firstIndex.get(prefixSum) + 1;
                    end = i;
                }
            } else {
                firstIndex.put(prefixSum, i);
            }
        }

        System.out.println("Longest zero-sum length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        } else {
            System.out.println("No zero-sum subarray found.");
        }
    }
}




