public class Java_20261023_29_FindHCFOfArrayUsingRecursion {
    static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    static int arrayGcd(int[] a, int index) {
        if (index == a.length - 1) return Math.abs(a[index]);
        return gcd(a[index], arrayGcd(a, index + 1));
    }

    public static void main(String[] args) {
        System.out.println(arrayGcd(new int[]{24, 36, 60}, 0));
    }
}


