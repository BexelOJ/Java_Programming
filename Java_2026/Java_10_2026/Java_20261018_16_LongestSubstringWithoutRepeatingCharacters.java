
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_16_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Move left past the previous occurrence
            if (lastSeen.containsKey(current)
                    && lastSeen.get(current) >= left) {

                left = lastSeen.get(current) + 1;
            }

            // Record the latest index
            lastSeen.put(current, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println("String: " + s);
        System.out.println("Longest substring length: "
                + lengthOfLongestSubstring(s));
    }
}




