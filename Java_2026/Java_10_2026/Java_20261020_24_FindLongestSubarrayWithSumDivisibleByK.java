
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_24_FindLongestSubarrayWithSumDivisibleByK {

    public static void main(String[] args) {
        int[] array = {4, 5, 0, -2, -3, 1};
        int k = 5;

        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);

        long prefixSum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];

            int remainder = (int) (prefixSum % k);
            if (remainder < 0) {
                remainder += k;
            }

            if (firstIndex.containsKey(remainder)) {
                int length = i - firstIndex.get(remainder);

                if (length > maxLength) {
                    maxLength = length;
                    start = firstIndex.get(remainder) + 1;
                    end = i;
                }
            } else {
                firstIndex.put(remainder, i);
            }
        }

        System.out.println("Longest length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        }
    }
}



