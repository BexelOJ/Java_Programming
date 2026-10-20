
public class Java_20261022_26_GasStationCircuit {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int difference = gas[i] - cost[i];

            total += difference;
            tank += difference;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total >= 0 && start < gas.length ? start : -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        System.out.println(
            "Starting station: " + canCompleteCircuit(gas, cost)
        );
    }
}



