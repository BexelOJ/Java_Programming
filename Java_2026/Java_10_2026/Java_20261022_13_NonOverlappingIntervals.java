
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_13_NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals,
            Comparator.comparingInt(a -> a[1]));

        int removals = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                removals++;
            } else {
                lastEnd = intervals[i][1];
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 3}
        };

        System.out.println(
            "Minimum removals: " +
            eraseOverlapIntervals(intervals)
        );
    }
}



