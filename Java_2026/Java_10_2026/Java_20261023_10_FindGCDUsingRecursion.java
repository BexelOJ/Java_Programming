public class Java_20261023_10_FindGCDUsingRecursion {
    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
    }
}


