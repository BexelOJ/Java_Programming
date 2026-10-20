
import java.util.Arrays;

public class Java_20261022_20_MinimumPlatformsForTrains {

    public static int minimumPlatforms(
            int[] arrival, int[] departure) {

        if (arrival.length == 0) {
            return 0;
        }

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 0;
        int j = 0;
        int currentPlatforms = 0;
        int requiredPlatforms = 0;

        while (i < arrival.length) {
            if (j == departure.length ||
                    arrival[i] <= departure[j]) {
                currentPlatforms++;

                requiredPlatforms = Math.max(
                    requiredPlatforms, currentPlatforms
                );

                i++;
            } else {
                currentPlatforms--;
                j++;
            }
        }

        return requiredPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {
            900, 940, 950, 1100, 1500, 1800
        };

        int[] departure = {
            910, 1200, 1120, 1130, 1900, 2000
        };

        System.out.println(
            "Minimum platforms required: " +
            minimumPlatforms(arrival, departure)
        );
    }
}



