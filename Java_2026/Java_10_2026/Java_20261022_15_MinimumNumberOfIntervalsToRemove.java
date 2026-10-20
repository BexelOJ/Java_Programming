
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_15_MinimumNumberOfIntervalsToRemove {

    public static int minimumRemovals(int[][] intervals) {
        Arrays.sort(intervals,
            Comparator.comparingInt(a -> a[1]));

        int kept = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= lastEnd) {
                kept++;
                lastEnd = interval[1];
            }
        }

        return intervals.length - kept;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 5},
            {4, 6}
        };

        System.out.println(
            "Minimum intervals to remove: " +
            minimumRemovals(intervals)
        );
    }
}



