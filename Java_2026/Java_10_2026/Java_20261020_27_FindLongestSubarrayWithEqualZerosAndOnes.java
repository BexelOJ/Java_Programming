
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_27_FindLongestSubarrayWithEqualZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 0, 1, 1, 0};

        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length; i++) {
            prefixSum += (array[i] == 0) ? -1 : 1;

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

        System.out.println("Longest length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);

            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}



