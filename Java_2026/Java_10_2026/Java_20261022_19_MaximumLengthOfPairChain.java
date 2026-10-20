
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_19_MaximumLengthOfPairChain {

    public static int maximumLength(int[][] pairs) {
        Arrays.sort(pairs,
            Comparator.comparingInt(p -> p[1]));

        int length = 0;
        int previousEnd = Integer.MIN_VALUE;

        for (int[] pair : pairs) {
            if (pair[0] > previousEnd) {
                length++;
                previousEnd = pair[1];
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {1, 2},
            {2, 3},
            {3, 4},
            {5, 6}
        };

        System.out.println(
            "Maximum pair chain length: " + maximumLength(pairs)
        );
    }
}



