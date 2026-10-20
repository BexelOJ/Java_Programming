public class Java_20261024_44_FindAllExpressionsThatEvaluateToTarget {
    static void solve(String s, int index, long target,
                      long value, long previous, String expr) {
        if (index == s.length()) {
            if (value == target) System.out.println(expr);
            return;
        }

        for (int end = index; end < s.length(); end++) {
            if (end > index && s.charAt(index) == '0') break;

            String part = s.substring(index, end + 1);
            long x;

            try {
                x = Long.parseLong(part);
            } catch (NumberFormatException e) {
                continue;
            }

            if (index == 0) {
                solve(s, end + 1, target, x, x, part);
                continue;
            }

            solve(s, end + 1, target, value + x, x,
                  expr + "+" + part);

            solve(s, end + 1, target, value - x, -x,
                  expr + "-" + part);

            try {
                long product = Math.multiplyExact(previous, x);
                long next = Math.addExact(
                    Math.subtractExact(value, previous), product);

                solve(s, end + 1, target, next, product,
                      expr + "*" + part);
            } catch (ArithmeticException ignored) {
                // Ignore expressions exceeding long arithmetic.
            }
        }
    }

    public static void main(String[] args) {
        solve("123", 0, 6, 0, 0, "");
    }
}


