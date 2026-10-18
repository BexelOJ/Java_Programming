
public class Java_20261018_13_CheckStringContainsPermutation {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (char ch : s1.toCharArray()) {
            frequency[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            // Add incoming character
            frequency[s2.charAt(i) - 'a']--;

            // Remove outgoing character
            if (i >= k) {
                frequency[s2.charAt(i - k) - 'a']++;
            }

            // Check complete window
            if (i >= k - 1) {

                boolean matches = true;

                for (int count : frequency) {
                    if (count != 0) {
                        matches = false;
                        break;
                    }
                }

                if (matches) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println("Permutation exists: "
                + checkInclusion(s1, s2));
    }
}



