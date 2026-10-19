
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_33_FindCountOfSubmatricesWithTargetSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 1, 0}
        };

        int target = 2;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int left = 0; left < cols; left++) {
            int[] rowSums = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int r = 0; r < rows; r++) {
                    rowSums[r] += matrix[r][right];
                }

                Map<Integer, Integer> prefixCount = new HashMap<>();
                prefixCount.put(0, 1);

                int prefixSum = 0;

                for (int sum : rowSums) {
                    prefixSum += sum;

                    count += prefixCount.getOrDefault(
                        prefixSum - target, 0
                    );

                    prefixCount.put(
                        prefixSum,
                        prefixCount.getOrDefault(prefixSum, 0) + 1
                    );
                }
            }
        }

        System.out.println("Submatrices with target sum: " + count);
    }
}



