
public class Java_20261022_41_GasStationMinimumStartingFuel {

    public static long minimumInitialFuel(
            int[] fuelGain, int[] travelCost) {

        long currentFuel = 0;
        long initialFuelNeeded = 0;

        for (int i = 0; i < fuelGain.length; i++) {
            currentFuel += fuelGain[i];
            currentFuel -= travelCost[i];

            if (currentFuel < 0) {
                initialFuelNeeded += -currentFuel;
                currentFuel = 0;
            }
        }

        return initialFuelNeeded;
    }

    public static void main(String[] args) {
        int[] fuelGain = {0, 5, 0};
        int[] travelCost = {4, 3, 2};

        System.out.println(
            "Minimum initial fuel: " +
            minimumInitialFuel(fuelGain, travelCost)
        );
    }
}



