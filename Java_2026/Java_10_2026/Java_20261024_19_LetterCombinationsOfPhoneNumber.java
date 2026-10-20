import java.util.*;

public class Java_20261024_19_LetterCombinationsOfPhoneNumber {
    static String[] map = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    static void solve(String digits, int index, String path) {
        if (index == digits.length()) {
            System.out.println(path);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray())
            solve(digits, index + 1, path + ch);
    }

    public static void main(String[] args) {
        String digits = "23";

        if (!digits.isEmpty() && digits.matches("[2-9]+"))
            solve(digits, 0, "");
    }
}


