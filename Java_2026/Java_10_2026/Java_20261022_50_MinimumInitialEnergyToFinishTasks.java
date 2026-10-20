
import java.util.Arrays;

public class Java_20261022_50_MinimumInitialEnergyToFinishTasks {

    public static long minimumEnergy(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> {
            long differenceA = (long) a[1] - a[0];
            long differenceB = (long) b[1] - b[0];

            return Long.compare(differenceB, differenceA);
        });

        long energyNeeded = 0;
        long remainingEnergy = 0;

        for (int[] task : tasks) {
            int actualCost = task[0];
            int minimumRequired = task[1];

            if (remainingEnergy < minimumRequired) {
                energyNeeded += minimumRequired - remainingEnergy;
                remainingEnergy = minimumRequired;
            }

            remainingEnergy -= actualCost;
        }

        return energyNeeded;
    }

    public static void main(String[] args) {
        int[][] tasks = {
            {1, 2},
            {2, 4},
            {4, 8}
        };

        System.out.println(
            "Minimum initial energy: " + minimumEnergy(tasks)
        );
    }
}



