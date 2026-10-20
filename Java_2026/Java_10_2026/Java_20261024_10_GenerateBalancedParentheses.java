public class Java_20261024_10_GenerateBalancedParentheses {
    static void generate(String path, int open, int close, int n) {
        if (path.length() == 2 * n) {
            System.out.println(path);
            return;
        }

        if (open < n)
            generate(path + "(", open + 1, close, n);

        if (close < open)
            generate(path + ")", open, close + 1, n);
    }

    public static void main(String[] args) {
        generate("", 0, 0, 3);
    }
}


