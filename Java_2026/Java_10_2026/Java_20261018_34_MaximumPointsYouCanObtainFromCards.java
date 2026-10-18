
public class Java_20261018_34_MaximumPointsYouCanObtainFromCards {

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;

        for (int points : cardPoints) {
            total += points;
        }

        if (k == n) {
            return total;
        }

        int windowSize = n - k;
        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        for (int right = windowSize; right < n; right++) {
            windowSum += cardPoints[right];
            windowSum -= cardPoints[right - windowSize];

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        System.out.println(maxScore(cardPoints, k));
    }
}




