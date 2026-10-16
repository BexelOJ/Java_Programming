import java.util.*;

public class Java_20261015_48_longestSubstringAtMostK {

    public static int longestSubstringKDistinct(
            String s, int k) {

        if (k <= 0) {
            return 0;
        }

        Map<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.size() > k) {

                char leftChar = s.charAt(left);

                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

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
            longestSubstringKDistinct("eceba", 2)
        );
    }
}



