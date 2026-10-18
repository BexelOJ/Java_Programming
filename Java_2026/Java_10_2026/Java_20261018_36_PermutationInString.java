
public class Java_20261018_36_PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] frequency = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
            frequency[s2.charAt(i)]--;
        }

        if (allZero(frequency)) {
            return true;
        }

        for (int right = s1.length(); right < s2.length(); right++) {
            frequency[s2.charAt(right)]--;
            frequency[s2.charAt(right - s1.length())]++;

            if (allZero(frequency)) {
                return true;
            }
        }

        return false;
    }

    private static boolean allZero(int[] frequency) {
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}




