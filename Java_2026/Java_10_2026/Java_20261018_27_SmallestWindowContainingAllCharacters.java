
public class Java_20261018_27_SmallestWindowContainingAllCharacters {

    public static String smallestWindow(String s, String p) {

        if (s == null || p == null ||
                s.isEmpty() || p.isEmpty() ||
                p.length() > s.length()) {
            return "";
        }

        int[] required = new int[65536];
        int[] window = new int[65536];

        for (char ch : p.toCharArray()) {
            required[ch]++;
        }

        int left = 0;
        int matched = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {

            char incoming = s.charAt(right);
            window[incoming]++;

            if (required[incoming] > 0 &&
                    window[incoming] <= required[incoming]) {
                matched++;
            }

            while (matched == p.length()) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    startIndex = left;
                }

                char outgoing = s.charAt(left);

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
        String p = "ABC";

        System.out.println("Smallest window: "
                + smallestWindow(s, p));
    }
}




