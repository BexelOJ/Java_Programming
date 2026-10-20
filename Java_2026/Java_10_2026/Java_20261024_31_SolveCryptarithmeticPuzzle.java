public class Java_20261024_31_SolveCryptarithmeticPuzzle {
    static int[] digit = new int[26];
    static boolean[] used = new boolean[10];
    static String letters = "SENDMORY";

    static long number(String s) {
        long value = 0;
        for (char ch : s.toCharArray())
            value = value * 10 + digit[ch - 'A'];
        return value;
    }

    static void solve(int index) {
        if (index == letters.length()) {
            long send = number("SEND");
            long more = number("MORE");
            long money = number("MONEY");

            if (send + more == money) {
                System.out.println(send + " + " + more + " = " + money);
                for (char ch : letters.toCharArray())
                    System.out.println(ch + " = " + digit[ch - 'A']);
            }
            return;
        }

        char ch = letters.charAt(index);

        for (int d = 0; d <= 9; d++) {
            if (used[d]) continue;
            if (d == 0 && "SM".indexOf(ch) >= 0) continue;

            digit[ch - 'A'] = d;
            used[d] = true;
            solve(index + 1);
            used[d] = false;
        }
    }

    public static void main(String[] args) {
        solve(0);
    }
}


