public class Java_20261023_23_FindLCMUsingRecursion {
    static long gcd(long a, long b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs((a / gcd(a, b)) * b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(12, 18));
    }
}


