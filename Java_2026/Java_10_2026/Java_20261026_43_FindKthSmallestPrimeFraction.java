import java.util.*;

public class Java_20261026_43_FindKthSmallestPrimeFraction {
    static class Fraction {
        int i, j;

        Fraction(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int n = arr.length;

        if (k < 1 || k > n * (n - 1) / 2)
            throw new IllegalArgumentException("Invalid k");

        PriorityQueue<Fraction> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(
                (long) arr[a.i] * arr[b.j],
                (long) arr[b.i] * arr[a.j]
            )
        );

        for (int j = 1; j < n; j++)
            pq.offer(new Fraction(0, j));

        Fraction current = null;

        for (int count = 0; count < k; count++) {
            current = pq.poll();

            if (current.i + 1 < current.j) {
                pq.offer(new Fraction(current.i + 1, current.j));
            }
        }

        System.out.println(
            "[" + arr[current.i] + ", " + arr[current.j] + "]"
        );
    }
}



