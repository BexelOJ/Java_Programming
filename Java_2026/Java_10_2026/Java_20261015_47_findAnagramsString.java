import java.util.*;

public class Java_20261015_47_findAnagramsString {

    public static List<Integer> findAnagrams(
            String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] freq = new int[65536];

        for (char ch : p.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int remaining = p.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                remaining--;
            }

            freq[ch]--;

            if (right - left + 1 > p.length()) {

                char old = s.charAt(left);
                freq[old]++;

                if (freq[old] > 0) {
                    remaining++;
                }

                left++;
            }

            if (right - left + 1 == p.length()
                    && remaining == 0) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            findAnagrams("cbaebabacd", "abc")
        );
    }
}



