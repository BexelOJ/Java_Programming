public class Java_20261015_44_LongestRepeatingCharReplacement {

    public static int characterReplacement(
            String s, int k) {

        int[] freq = new int[128];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;

            maxFreq = Math.max(maxFreq, freq[ch]);

            while (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(
                maxLength, right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(
            characterReplacement("AABABBA", 1)
        );
    }
}




