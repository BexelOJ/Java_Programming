public class Java_20261023_24_ConvertDecimalToBinaryUsingRecursion {
    static String toBinary(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n < 2) return String.valueOf(n);

        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(25));
    }
}


