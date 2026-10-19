
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_23_FindNumberOfSubarraysWithSumDivisibleByK {

    public static void main(String[] args) {
        int[] array = {4, 5, 0, -2, -3, 1};
        int k = 5;

        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);

        long prefixSum = 0;
        int count = 0;

        for (int value : array) {
            prefixSum += value;

            int remainder = (int) (prefixSum % k);
            if (remainder < 0) {
                remainder += k;
            }

            count += remainderCount.getOrDefault(remainder, 0);

            remainderCount.put(
                remainder,
                remainderCount.getOrDefault(remainder, 0) + 1
            );
        }

        System.out.println(
            "Subarrays divisible by " + k + ": " + count
        );
    }
}



