
public class Java_20261022_49_LexicographicallySmallestSubsequence {

    public static String smallestSubsequence(String s) {
        int[] lastIndex = new int[256];
        boolean[] used = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i)] = i;
        }

        char[] stack = new char[s.length()];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (used[c]) {
                continue;
            }

            while (top > 0 &&
                    stack[top - 1] > c &&
                    lastIndex[stack[top - 1]] > i) {
                used[stack[--top]] = false;
            }

            stack[top++] = c;
            used[c] = true;
        }

        return new String(stack, 0, top);
    }

    public static void main(String[] args) {
        String s = "cbacdcbc";

        System.out.println(
            "Smallest subsequence: " + smallestSubsequence(s)
        );
    }
}



