
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_17_CountSubarraysWithZeroSum {

    public static void main(String[] args) {
        int[] array = {1, -1, 2, -2, 3, -3};

        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);

        long prefixSum = 0;
        int count = 0;

        for (int value : array) {
            prefixSum += value;

            count += prefixCount.getOrDefault(prefixSum, 0);

            prefixCount.put(
                    prefixSum,
                    prefixCount.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Zero-sum subarrays: " + count);
    }
}




