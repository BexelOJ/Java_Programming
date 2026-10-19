
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_21_CountSubarraysWithSumK {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, -2, 2};
        int k = 3;

        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);

        long prefixSum = 0;
        int count = 0;

        for (int value : array) {
            prefixSum += value;

            count += prefixCount.getOrDefault(prefixSum - k, 0);

            prefixCount.put(
                prefixSum,
                prefixCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println("Number of subarrays with sum " + k
                + ": " + count);
    }
}



