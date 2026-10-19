
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_48_FindCountOfSubarraysWithEqualSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 1};
        int target = 3;

        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);

        long prefixSum = 0;
        long count = 0;

        for (int value : array) {
            prefixSum += value;

            count += prefixCount.getOrDefault(
                prefixSum - target, 0
            );

            prefixCount.put(
                prefixSum,
                prefixCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println(
            "Subarrays with sum " + target + ": " + count
        );
    }
}



