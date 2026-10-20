import java.util.*;

public class Java_20261023_48_SolvePalindromePartitioning {
    static boolean palindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    static void solve(String s, int start, List<String> current) {
        if (start == s.length()) {
            System.out.println(current);
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (palindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));
                solve(s, end + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        solve("aab", 0, new ArrayList<>());
    }
}


