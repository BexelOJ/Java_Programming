
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java_20261021_42_ConvexHullUsingDivideAndConquer {

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

    static long cross(Point a, Point b, Point p) {
        return (long) (b.x - a.x) * (p.y - a.y)
                - (long) (b.y - a.y) * (p.x - a.x);
    }

    static long areaMagnitude(Point a, Point b, Point p) {
        return Math.abs(cross(a, b, p));
    }

    static void findHullSide(
            Point a, Point b, List<Point> points, List<Point> hull) {

        if (points.isEmpty()) {
            return;
        }

        Point farthest = points.get(0);

        for (Point p : points) {
            if (areaMagnitude(a, b, p)
                    > areaMagnitude(a, b, farthest)) {
                farthest = p;
            }
        }

        List<Point> leftOfAFarthest = new ArrayList<>();
        List<Point> leftOfFarthestB = new ArrayList<>();

        for (Point p : points) {
            if (p == farthest) {
                continue;
            }

            if (cross(a, farthest, p) > 0) {
                leftOfAFarthest.add(p);
            } else if (cross(farthest, b, p) > 0) {
                leftOfFarthestB.add(p);
            }
        }

        findHullSide(a, farthest, leftOfAFarthest, hull);
        hull.add(farthest);
        findHullSide(farthest, b, leftOfFarthestB, hull);
    }

    static List<Point> convexHull(Point[] points) {
        List<Point> hull = new ArrayList<>();

        if (points.length == 0) {
            return hull;
        }

        Point[] sorted = points.clone();
        Arrays.sort(sorted,
                Comparator.comparingInt((Point p) -> p.x)
                        .thenComparingInt(p -> p.y));

        Point left = sorted[0];
        Point right = sorted[sorted.length - 1];

        if (left.x == right.x && left.y == right.y) {
            hull.add(left);
            return hull;
        }

        List<Point> upper = new ArrayList<>();
        List<Point> lower = new ArrayList<>();

        for (Point p : sorted) {
            long side = cross(left, right, p);

            if (side > 0) {
                upper.add(p);
            } else if (side < 0) {
                lower.add(p);
            }
        }

        hull.add(left);
        findHullSide(left, right, upper, hull);
        hull.add(right);
        findHullSide(right, left, lower, hull);

        return hull;
    }

    public static void main(String[] args) {
        Point[] points = {
            new Point(0, 3),
            new Point(2, 2),
            new Point(1, 1),
            new Point(2, 1),
            new Point(3, 0),
            new Point(0, 0),
            new Point(3, 3)
        };

        List<Point> hull = convexHull(points);

        System.out.println("Convex hull points:");
        for (Point p : hull) {
            System.out.println(p);
        }
    }
}



