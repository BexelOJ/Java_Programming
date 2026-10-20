
public class Java_20261022_22_RemoveKDigitsToMakeSmallestNumber {

    public static String removeKdigits(String number, int k) {
        if (k >= number.length()) {
            return "0";
        }

        char[] stack = new char[number.length()];
        int top = 0;

        for (char digit : number.toCharArray()) {
            while (top > 0 && k > 0 &&
                    stack[top - 1] > digit) {
                top--;
                k--;
            }

            stack[top++] = digit;
        }

        top -= k;

        int start = 0;
        while (start < top && stack[start] == '0') {
            start++;
        }

        return start == top
            ? "0"
            : new String(stack, start, top - start);
    }

    public static void main(String[] args) {
        String number = "1432219";
        int k = 3;

        System.out.println(
            "Smallest number: " + removeKdigits(number, k)
        );
    }
}



