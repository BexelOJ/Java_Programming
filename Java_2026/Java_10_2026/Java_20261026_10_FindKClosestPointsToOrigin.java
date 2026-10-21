import java.util.*;

public class Java_20261026_10_FindKClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {
            {1, 3}, {-2, 2}, {5, 8}, {0, 1}
        };
        int k = 2;

        Arrays.sort(points, Comparator.comparingLong(
            p -> (long) p[0] * p[0] + (long) p[1] * p[1]
        ));

        for (int i = 0; i < Math.min(k, points.length); i++)
            System.out.println(Arrays.toString(points[i]));
    }
}


