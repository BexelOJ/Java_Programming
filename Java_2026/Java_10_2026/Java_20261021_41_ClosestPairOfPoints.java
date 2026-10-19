import java.util.Arrays;
import java.util.Comparator;

public class Java_20261021_41_ClosestPairOfPoints {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class Result {
        Point a, b;
        double distance;

        Result(Point a, Point b) {
            this.a = a;
            this.b = b;
            this.distance = distance(a, b);
        }
    }

    static double distance(Point a, Point b) {
        long dx = (long) a.x - b.x;
        long dy = (long) a.y - b.y;
        return Math.sqrt((double) dx * dx + (double) dy * dy);
    }

    static Result closestPair(Point[] points) {
        if (points.length < 2) {
            throw new IllegalArgumentException(
                    "At least two points are required");
        }

        Point[] byX = points.clone();
        Arrays.sort(byX, Comparator.comparingInt(p -> p.x));

        Point[] byY = points.clone();
        Arrays.sort(byY, Comparator.comparingInt(p -> p.y));

        return solve(byX, byY);
    }

    static Result solve(Point[] byX, Point[] byY) {
        int n = byX.length;

        if (n <= 3) {
            Result best = null;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    Result candidate = new Result(byX[i], byX[j]);

                    if (best == null
                            || candidate.distance < best.distance) {
                        best = candidate;
                    }
                }
            }

            return best;
        }

        int mid = n / 2;
        Point[] leftX = Arrays.copyOfRange(byX, 0, mid);
        Point[] rightX = Arrays.copyOfRange(byX, mid, n);

        int splitX = rightX[0].x;

        java.util.HashSet<Point> leftPoints =
                new java.util.HashSet<>(Arrays.asList(leftX));

        Point[] leftY = Arrays.stream(byY)
                .filter(leftPoints::contains)
                .toArray(Point[]::new);

        Point[] rightY = Arrays.stream(byY)
                .filter(p -> !leftPoints.contains(p))
                .toArray(Point[]::new);

        Result leftBest = solve(leftX, leftY);
        Result rightBest = solve(rightX, rightY);

        Result best = leftBest.distance <= rightBest.distance
                ? leftBest : rightBest;

        Point[] strip = Arrays.stream(byY)
                .filter(p -> Math.abs((long) p.x - splitX)
                        < best.distance)
                .toArray(Point[]::new);

        for (int i = 0; i < strip.length; i++) {
            for (int j = i + 1;
                    j < strip.length
                    && (long) strip[j].y - strip[i].y < best.distance;
                    j++) {

                Result candidate = new Result(strip[i], strip[j]);

                if (candidate.distance < best.distance) {
                    best = candidate;
                }
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Point[] points = {
            new Point(2, 3),
            new Point(12, 30),
            new Point(40, 50),
            new Point(5, 1),
            new Point(12, 10),
            new Point(3, 4)
        };

        Result result = closestPair(points);

        System.out.println("Closest pair: "
                + result.a + " and " + result.b);
        System.out.printf("Distance: %.3f%n", result.distance);
    }
}

