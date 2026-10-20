
import java.util.Arrays;

public class Java_20261022_45_CarPooling {

    public static boolean carPooling(
            int[][] trips, int capacity) {

        int[][] events = new int[trips.length * 2][2];
        int index = 0;

        for (int[] trip : trips) {
            events[index++] = new int[]{
                trip[1], trip[0]
            };

            events[index++] = new int[]{
                trip[2], -trip[0]
            };
        }

        Arrays.sort(events, (a, b) ->
            Integer.compare(a[0], b[0]));

        int passengers = 0;

        for (int[] event : events) {
            passengers += event[1];

            if (passengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] trips = {
            {2, 1, 5},
            {3, 3, 7}
        };

        int capacity = 4;

        System.out.println(
            "Can complete all trips: " +
            carPooling(trips, capacity)
        );
    }
}



