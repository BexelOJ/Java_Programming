
public class Java_20261022_44_MinimumNumberOfTapsToWaterGarden {

    public static int minTaps(int n, int[] ranges) {
        int[] farthest = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);

            farthest[left] = Math.max(farthest[left], right);
        }

        int taps = 0;
        int currentEnd = 0;
        int nextEnd = 0;

        for (int i = 0; i < n; i++) {
            nextEnd = Math.max(nextEnd, farthest[i]);

            if (i == currentEnd) {
                if (nextEnd <= currentEnd) {
                    return -1;
                }

                taps++;
                currentEnd = nextEnd;

                if (currentEnd >= n) {
                    return taps;
                }
            }
        }

        return currentEnd >= n ? taps : -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ranges = {3, 4, 1, 1, 0, 0};

        System.out.println("Minimum taps: " + minTaps(n, ranges));
    }
}



