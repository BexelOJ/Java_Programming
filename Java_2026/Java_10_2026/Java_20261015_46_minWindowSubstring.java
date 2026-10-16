public class Java_20261015_46_minWindowSubstring {

    public static String minWindow(String s, String t) {

        if (t.length() > s.length() || t.isEmpty()) {
            return "";
        }

        int[] freq = new int[65536];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int required = t.length();
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                required--;
            }

            freq[ch]--;

            while (required == 0) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
             ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        System.out.println(
            minWindow("ADOBECODEBANC", "ABC")
        );
    }
}




