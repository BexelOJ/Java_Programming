public class Java_20261023_12_FindMaximumElementUsingRecursion {
    static int max(int[] a, int index) {
        if (index == a.length - 1) return a[index];
        return Math.max(a[index], max(a, index + 1));
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{3, 9, 2, 7}, 0));
    }
}


