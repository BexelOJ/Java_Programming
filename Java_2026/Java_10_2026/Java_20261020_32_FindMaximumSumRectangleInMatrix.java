
public class Java_20261020_32_FindMaximumSumRectangleInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2, -1, -4, -20},
            {-8, -3,  4,  2,   1},
            {3,  8, 10,  1,   3},
            {-4, -1,  1,  7,  -6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        long maxSum = Long.MIN_VALUE;
        int finalTop = 0, finalBottom = 0;
        int finalLeft = 0, finalRight = 0;

        for (int left = 0; left < cols; left++) {
            long[] rowSums = new long[rows];

            for (int right = left; right < cols; right++) {
                for (int r = 0; r < rows; r++) {
                    rowSums[r] += matrix[r][right];
                }

                long currentSum = rowSums[0];
                long bestSum = rowSums[0];
                int tempTop = 0;
                int bestTop = 0;
                int bestBottom = 0;

                for (int r = 1; r < rows; r++) {
                    if (currentSum < 0) {
                        currentSum = rowSums[r];
                        tempTop = r;
                    } else {
                        currentSum += rowSums[r];
                    }

                    if (currentSum > bestSum) {
                        bestSum = currentSum;
                        bestTop = tempTop;
                        bestBottom = r;
                    }
                }

                if (bestSum > maxSum) {
                    maxSum = bestSum;
                    finalTop = bestTop;
                    finalBottom = bestBottom;
                    finalLeft = left;
                    finalRight = right;
                }
            }
        }

        System.out.println("Maximum rectangle sum: " + maxSum);
        System.out.println("Top row: " + finalTop);
        System.out.println("Bottom row: " + finalBottom);
        System.out.println("Left column: " + finalLeft);
        System.out.println("Right column: " + finalRight);
    }
}



