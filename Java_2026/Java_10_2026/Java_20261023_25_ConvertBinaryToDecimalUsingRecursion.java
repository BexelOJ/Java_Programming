public class Java_20261023_25_ConvertBinaryToDecimalUsingRecursion {
    static long toDecimal(String binary, int index) {
        if (index == binary.length()) return 0;

        char bit = binary.charAt(index);
        if (bit != '0' && bit != '1')
            throw new IllegalArgumentException("Invalid binary");

        return bit - '0'
                * 0L + (bit - '0') * powerOfTwo(binary.length() - 1 - index)
                + toDecimal(binary, index + 1);
    }

    static long powerOfTwo(int n) {
        if (n == 0) return 1;
        return 2 * powerOfTwo(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("11001", 0));
    }
}


