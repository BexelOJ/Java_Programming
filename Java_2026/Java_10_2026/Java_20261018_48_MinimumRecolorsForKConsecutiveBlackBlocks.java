
public class Java_20261018_48_MinimumRecolorsForKConsecutiveBlackBlocks {

    public static int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minRecolors = whiteCount;

        for (int right = k; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') {
                whiteCount++;
            }

            if (blocks.charAt(right - k) == 'W') {
                whiteCount--;
            }

            minRecolors = Math.min(minRecolors, whiteCount);

            if (minRecolors == 0) {
                return 0;
            }
        }

        return minRecolors;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;

        System.out.println(minimumRecolors(blocks, k));
    }
}




