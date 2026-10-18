
public class Java_20261018_42_NumberOfSubstringsContainingAllThreeCharacters {

    public static long numberOfSubstrings(String s) {
        int[] frequency = new int[3];
        int left = 0;
        long count = 0;

        for (int right = 0; right < s.length(); right++) {
            frequency[s.charAt(right) - 'a']++;

            while (frequency[0] > 0
                    && frequency[1] > 0
                    && frequency[2] > 0) {

                count += s.length() - right;
                frequency[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";

        System.out.println(numberOfSubstrings(s));
    }
}




