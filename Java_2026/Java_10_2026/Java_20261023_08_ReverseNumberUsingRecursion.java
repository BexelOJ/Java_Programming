public class Java_20261023_08_ReverseNumberUsingRecursion {
    static long reverse(long n, long result) {
        if (n == 0) return result;

        return reverse(n / 10, result * 10 + n % 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345, 0));
    }
}


