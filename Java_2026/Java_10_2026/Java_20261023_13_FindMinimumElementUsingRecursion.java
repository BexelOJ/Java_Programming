public class Java_20261023_13_FindMinimumElementUsingRecursion {
    static int min(int[] a, int index) {
        if (index == a.length - 1) return a[index];
        return Math.min(a[index], min(a, index + 1));
    }

    public static void main(String[] args) {
        System.out.println(min(new int[]{3, 9, 2, 7}, 0));
    }
}


