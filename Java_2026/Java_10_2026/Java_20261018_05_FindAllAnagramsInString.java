
import java.util.ArrayList;
import java.util.List;

public class Java_20261018_05_FindAllAnagramsInString {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s == null || p == null ||
            p.isEmpty() || p.length() > s.length()) {
            return result;
        }

        int[] frequency = new int[26];

        // Count characters in the pattern
        for (char ch : p.toCharArray()) {
            frequency[ch - 'a']++;
        }

        int windowSize = p.length();

        // Sliding window
        for (int i = 0; i < s.length(); i++) {

            // Add the incoming character
            frequency[s.charAt(i) - 'a']--;

            // Remove the outgoing character if window exceeds size
            if (i >= windowSize) {
                frequency[s.charAt(i - windowSize) - 'a']++;
            }

            // Check only complete windows
            if (i >= windowSize - 1) {

                boolean isAnagram = true;

                for (int count : frequency) {
                    if (count != 0) {
                        isAnagram = false;
                        break;
                    }
                }

                if (isAnagram) {
                    result.add(i - windowSize + 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);

        System.out.println("String: " + s);
        System.out.println("Pattern: " + p);
        System.out.println("Starting indices: " + result);
    }
}

