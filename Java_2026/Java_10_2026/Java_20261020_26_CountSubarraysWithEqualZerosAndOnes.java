
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_26_CountSubarraysWithEqualZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 0, 1, 1, 0};

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int value : array) {
            prefixSum += (value == 0) ? -1 : 1;

            count += prefixCount.getOrDefault(prefixSum, 0);

            prefixCount.put(
                prefixSum,
                prefixCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println(
            "Subarrays with equal zeros and ones: " + count
        );
    }
}



