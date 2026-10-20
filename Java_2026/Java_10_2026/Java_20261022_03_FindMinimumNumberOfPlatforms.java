
import java.util.Arrays;

public class Java_20261022_03_FindMinimumNumberOfPlatforms {

    public static int findPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 0;
        int maximumPlatforms = 0;
        int i = 0, j = 0;

        while (i < arrival.length) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                maximumPlatforms = Math.max(
                    maximumPlatforms, platforms
                );
                i++;
            } else {
                platforms--;
                j++;
            }
        }

        return maximumPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(
            "Minimum platforms: " +
            findPlatforms(arrival, departure)
        );
    }
}



