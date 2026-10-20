
import java.util.Arrays;

public class Java_20261022_38_CheapestFlightsWithinKStops {

    public static int findCheapestPrice(
            int n, int[][] flights,
            int src, int dst, int k) {

        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[src] = 0;

        for (int i = 0; i <= k; i++) {
            long[] next = distance.clone();

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (distance[from] != Long.MAX_VALUE) {
                    next[to] = Math.min(
                        next[to], distance[from] + price
                    );
                }
            }

            distance = next;
        }

        if (distance[dst] == Long.MAX_VALUE) {
            return -1;
        }

        return Math.toIntExact(distance[dst]);
    }

    public static void main(String[] args) {
        int n = 4;

        int[][] flights = {
            {0, 1, 100},
            {1, 2, 100},
            {2, 0, 100},
            {1, 3, 600},
            {2, 3, 200}
        };

        System.out.println(
            "Cheapest price: " +
            findCheapestPrice(n, flights, 0, 3, 1)
        );
    }
}



