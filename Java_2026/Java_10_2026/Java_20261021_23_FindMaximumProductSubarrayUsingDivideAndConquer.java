
public class Java_20261021_23_FindMaximumProductSubarrayUsingDivideAndConquer {

    static class Result {
        long total;
        long prefixMax;
        long prefixMin;
        long suffixMax;
        long suffixMin;
        long bestMax;
        long bestMin;

        Result(long value) {
            total = prefixMax = prefixMin =
            suffixMax = suffixMin = bestMax = bestMin = value;
        }
    }

    static Result maxProductSubarray(int[] array, int left, int right) {
        if (left == right) {
            return new Result(array[left]);
        }

        int mid = left + (right - left) / 2;

        Result a = maxProductSubarray(array, left, mid);
        Result b = maxProductSubarray(array, mid + 1, right);

        Result result = new Result(0);

        result.total = a.total * b.total;

        result.prefixMax = max(
                a.prefixMax,
                a.total * b.prefixMax);

        result.prefixMax = max(
                result.prefixMax,
                a.total * b.prefixMin);

        result.prefixMin = min(
                a.prefixMin,
                a.total * b.prefixMax);

        result.prefixMin = min(
                result.prefixMin,
                a.total * b.prefixMin);

        result.suffixMax = max(
                b.suffixMax,
                b.total * a.suffixMax);

        result.suffixMax = max(
                result.suffixMax,
                b.total * a.suffixMin);

        result.suffixMin = min(
                b.suffixMin,
                b.total * a.suffixMax);

        result.suffixMin = min(
                result.suffixMin,
                b.total * a.suffixMin);

        long crossMax = max(
                a.suffixMax * b.prefixMax,
                a.suffixMin * b.prefixMin);

        long crossMin = min(
                a.suffixMax * b.prefixMin,
                a.suffixMin * b.prefixMax);

        result.bestMax = max(a.bestMax, b.bestMax);
        result.bestMax = max(result.bestMax, crossMax);

        result.bestMin = min(a.bestMin, b.bestMin);
        result.bestMin = min(result.bestMin, crossMin);

        return result;
    }

    static long max(long a, long b) {
        return Math.max(a, b);
    }

    static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, -2, 4};

        Result result = maxProductSubarray(
                array, 0, array.length - 1);

        System.out.println("Maximum product subarray: "
                + result.bestMax);
    }
}



