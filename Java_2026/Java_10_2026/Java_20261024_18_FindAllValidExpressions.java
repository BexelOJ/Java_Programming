public class Java_20261024_18_FindAllValidExpressions {
    static void solve(String s, int index, long target,
                      long value, long previous, String expr) {
        if (index == s.length()) {
            if (value == target) System.out.println(expr);
            return;
        }

        for (int end = index; end < s.length(); end++) {
            if (end > index && s.charAt(index) == '0') break;

            String token = s.substring(index, end + 1);
            long x;

            try {
                x = Long.parseLong(token);
            } catch (NumberFormatException e) {
                continue;
            }

            if (index == 0) {
                solve(s, end + 1, target, x, x, token);
            } else {
                solve(s, end + 1, target, value + x, x,
                      expr + "+" + token);
                solve(s, end + 1, target, value - x, -x,
                      expr + "-" + token);

                try {
                    long product = Math.multiplyExact(previous, x);
                    long newValue = Math.addExact(
                        Math.subtractExact(value, previous), product);

                    solve(s, end + 1, target, newValue, product,
                          expr + "*" + token);
                } catch (ArithmeticException ignored) {
                    // Skip expressions exceeding long arithmetic.
                }
            }
        }
    }

    public static void main(String[] args) {
        solve("123", 0, 6, 0, 0, "");
    }
}


