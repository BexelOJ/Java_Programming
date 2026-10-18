
public class Java_20261018_18_LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Count the incoming character
            frequency[current - 'A']++;

            maxFrequency = Math.max(
                    maxFrequency, frequency[current - 'A']
            );

            // Characters requiring replacement exceed k
            while ((right - left + 1) - maxFrequency > k) {

                frequency[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(
                    maxLength, right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        System.out.println("String: " + s);
        System.out.println("Maximum length: "
                + characterReplacement(s, k));
    }
}




