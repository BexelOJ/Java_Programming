import java.util.*;

public class Java_20261015_41_longestSubstring {

    public static int longestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(
                maxLength, right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}




