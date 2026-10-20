import java.util.*;

public class Java_20261024_16_PalindromePartitioning {
    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    static void solve(String s, int start, List<String> path) {
        if (start == s.length()) {
            System.out.println(path);
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                solve(s, end + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        solve("aab", 0, new ArrayList<>());
    }
}


