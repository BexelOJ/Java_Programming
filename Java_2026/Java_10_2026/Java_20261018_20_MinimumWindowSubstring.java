
public class Java_20261018_20_MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s == null || t == null ||
                s.isEmpty() || t.isEmpty() ||
                t.length() > s.length()) {
            return "";
        }

        // Supports all Java char values (UTF-16 code units)
        int[] required = new int[65536];
        int[] window = new int[65536];

        for (char ch : t.toCharArray()) {
            required[ch]++;
        }

        int left = 0;
        int matched = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {

            char incoming = s.charAt(right);
            window[incoming]++;

            // Count only characters still needed
            if (required[incoming] > 0 &&
                    window[incoming] <= required[incoming]) {
                matched++;
            }

            // All characters of t are satisfied
            while (matched == t.length()) {

                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                }

                char outgoing = s.charAt(left);

                // Removing this character may invalidate the window
                if (required[outgoing] > 0 &&
                        window[outgoing] <= required[outgoing]) {
                    matched--;
                }

                window[outgoing]--;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Source string: " + s);
        System.out.println("Target string: " + t);
        System.out.println("Minimum window: " + minWindow(s, t));
    }
}




