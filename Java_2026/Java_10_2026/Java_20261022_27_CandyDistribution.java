
import java.util.Arrays;

public class Java_20261022_27_CandyDistribution {

    public static int minimumCandies(int[] ratings) {
        int n = ratings.length;

        if (n == 0) {
            return 0;
        }

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(
                    candies[i], candies[i + 1] + 1
                );
            }
        }

        int total = 0;
        for (int candy : candies) {
            total += candy;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};

        System.out.println(
            "Minimum candies: " + minimumCandies(ratings)
        );
    }
}



