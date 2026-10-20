
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Java_20261022_14_MergeOverlappingIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals,
            Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}



