import java.util.*;

public class Java_20261026_46_FindKClosestPointsToMultipleTargets {
    static long minDistanceSquared(int[] point, int[][] targets) {
        long best = Long.MAX_VALUE;

        for (int[] target : targets) {
            long dx = (long) point[0] - target[0];
            long dy = (long) point[1] - target[1];
            best = Math.min(best, dx * dx + dy * dy);
        }

        return best;
    }

    public static void main(String[] args) {
        int[][] points = {
            {1, 2}, {5, 5}, {2, 1}, {8, 8}, {4, 3}
        };

        int[][] targets = {
            {0, 0}, {6, 6}
        };

        int k = 3;

        Arrays.sort(points, (a, b) -> {
            int cmp = Long.compare(
                minDistanceSquared(a, targets),
                minDistanceSquared(b, targets)
            );

            if (cmp != 0) return cmp;
            cmp = Integer.compare(a[0], b[0]);
            return cmp != 0 ? cmp : Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < Math.min(k, points.length); i++)
            System.out.println(Arrays.toString(points[i]));
    }
}



