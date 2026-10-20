
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_18_MaximumUnitsOnATruck {

    public static int maximumUnits(
            int[][] boxTypes, int truckCapacity) {

        Arrays.sort(boxTypes,
            Comparator.comparingInt((int[] b) -> b[1]).reversed());

        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int boxesToLoad = Math.min(box[0], truckCapacity);

            totalUnits += boxesToLoad * box[1];
            truckCapacity -= boxesToLoad;

            if (truckCapacity == 0) {
                break;
            }
        }

        return totalUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {
            {1, 3},
            {2, 2},
            {3, 1}
        };

        int truckCapacity = 4;

        System.out.println(
            "Maximum units: " +
            maximumUnits(boxTypes, truckCapacity)
        );
    }
}



