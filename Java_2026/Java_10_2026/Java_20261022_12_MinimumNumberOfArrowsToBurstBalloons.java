
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_12_MinimumNumberOfArrowsToBurstBalloons {

    public static int findMinArrows(int[][] balloons) {
        if (balloons.length == 0) {
            return 0;
        }

        Arrays.sort(balloons,
            Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int arrowPosition = balloons[0][1];

        for (int i = 1; i < balloons.length; i++) {
            if (balloons[i][0] > arrowPosition) {
                arrows++;
                arrowPosition = balloons[i][1];
            }
        }

        return arrows;
    }

    public static void main(String[] args) {
        int[][] balloons = {
            {10, 16},
            {2, 8},
            {1, 6},
            {7, 12}
        };

        System.out.println(
            "Minimum arrows: " + findMinArrows(balloons)
        );
    }
}



