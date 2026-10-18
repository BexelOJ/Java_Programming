
public class Java_20261018_11_MaximumVowelsInSubstringOfSizeK {

    public static int maxVowels(String s, int k) {

        if (s == null || k <= 0 || k > s.length()) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int windowVowels = 0;
        int maxVowels = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                windowVowels++;
            }
        }

        maxVowels = windowVowels;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {

            // Remove the outgoing character
            if (isVowel(s.charAt(i - k))) {
                windowVowels--;
            }

            // Add the incoming character
            if (isVowel(s.charAt(i))) {
                windowVowels++;
            }

            // Update the maximum vowel count
            maxVowels = Math.max(maxVowels, windowVowels);

            // Stop early if all characters are vowels
            if (maxVowels == k) {
                return maxVowels;
            }
        }

        return maxVowels;
    }

    // Check whether a character is a vowel
    private static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        int result = maxVowels(s, k);

        System.out.println("String: " + s);
        System.out.println("Window size: " + k);
        System.out.println("Maximum vowels in any substring: " + result);
    }
}




