public class Java_20261023_14_CheckIfArrayIsSortedUsingRecursion {
    static boolean isSorted(int[] a, int index) {
        if (index >= a.length - 1) return true;

        return a[index] <= a[index + 1]
                && isSorted(a, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 3, 4}, 0));
    }
}


