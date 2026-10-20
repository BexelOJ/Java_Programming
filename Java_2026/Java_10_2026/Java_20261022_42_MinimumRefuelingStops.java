
import java.util.PriorityQueue;

public class Java_20261022_42_MinimumRefuelingStops {

    public static int minRefuelStops(
            int target, int startFuel, int[][] stations) {

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        long reach = startFuel;
        int stops = 0;
        int i = 0;

        while (reach < target) {
            while (i < stations.length &&
                    stations[i][0] <= reach) {
                maxHeap.offer(stations[i][1]);
                i++;
            }

            if (maxHeap.isEmpty()) {
                return -1;
            }

            reach += maxHeap.poll();
            stops++;
        }

        return stops;
    }

    public static void main(String[] args) {
        int target = 100;
        int startFuel = 10;

        int[][] stations = {
            {10, 60},
            {20, 30},
            {30, 30},
            {60, 40}
        };

        System.out.println(
            "Minimum refueling stops: " +
            minRefuelStops(target, startFuel, stations)
        );
    }
}



