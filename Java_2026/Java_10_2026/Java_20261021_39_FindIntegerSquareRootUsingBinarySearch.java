
public class Java_20261021_39_FindIntegerSquareRootUsingBinarySearch {

    static long integerSquareRoot(long n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Cannot find square root of a negative integer");
        }

        long left = 0;
        long right = Math.min(n, 3037000499L);
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid == 0 || mid <= n / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long n = 27;

        System.out.println("Number: " + n);
        System.out.println("Integer square root: "
                + integerSquareRoot(n));
    }
}



