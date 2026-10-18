
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_28_LongestSubstringWithAtMostTwoDistinctCharacters {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> frequency = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            frequency.put(
                current, frequency.getOrDefault(current, 0) + 1
            );

            while (frequency.size() > 2) {

                char outgoing = s.charAt(left);
                int count = frequency.get(outgoing);

                if (count == 1) {
                    frequency.remove(outgoing);
                } else {
                    frequency.put(outgoing, count - 1);
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

        String s = "eceba";

        System.out.println("String: " + s);
        System.out.println("Longest length: "
                + lengthOfLongestSubstringTwoDistinct(s));
    }
}




