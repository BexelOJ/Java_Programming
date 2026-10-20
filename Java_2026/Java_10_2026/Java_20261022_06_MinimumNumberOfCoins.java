
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Java_20261022_06_MinimumNumberOfCoins {

    public static List<Integer> minimumCoins(
            int[] coins, int amount) {

        Arrays.sort(coins);
        List<Integer> result = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
            }
        }

        if (amount != 0) {
            return Collections.emptyList();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;

        List<Integer> result = minimumCoins(coins, amount);

        if (result.isEmpty() && amount != 0) {
            System.out.println("Exact amount cannot be formed.");
        } else {
            System.out.println("Coins: " + result);
            System.out.println("Number of coins: " + result.size());
        }
    }
}



