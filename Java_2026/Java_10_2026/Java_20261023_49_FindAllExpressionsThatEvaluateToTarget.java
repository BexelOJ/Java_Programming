import java.util.*;

public class Java_20261023_49_FindAllExpressionsThatEvaluateToTarget {
    static void solve(String digits, int index, long target,
                      long value, long previous, String expression) {
        if (index == digits.length()) {
            if (value == target)
                System.out.println(expression);
            return;
        }

        for (int end = index; end < digits.length(); end++) {
            if (end > index && digits.charAt(index) == '0') break;

            String part = digits.substring(index, end + 1);
            long number = Long.parseLong(part);

            if (index == 0) {
                solve(digits, end + 1, target, number,
                      number, part);
            } else {
                solve(digits, end + 1, target,
                      value + number, number,
                      expression + "+" + part);

                solve(digits, end + 1, target,
                      value - number, -number,
                      expression + "-" + part);

                solve(digits, end + 1, target,
                      value - previous + previous * number,
                      previous * number,
                      expression + "*" + part);
            }
        }
    }

    public static void main(String[] args) {
        solve("123", 0, 6, 0, 0, "");
    }
}


