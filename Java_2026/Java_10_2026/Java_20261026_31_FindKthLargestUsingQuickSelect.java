import java.util.*;

public class Java_20261026_31_FindKthLargestUsingQuickSelect {
    static int quickSelect(int[] a, int left, int right, int target) {
        int pivot = a[right];
        int p = left;

        for (int i = left; i < right; i++) {
            if (a[i] <= pivot) {
                int temp = a[i];
                a[i] = a[p];
                a[p++] = temp;
            }
        }

        int temp = a[p];
        a[p] = a[right];
        a[right] = temp;

        if (p == target) return a[p];
        if (p > target) return quickSelect(a, left, p - 1, target);
        return quickSelect(a, p + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException("Invalid k");

        System.out.println(
            quickSelect(arr, 0, arr.length - 1, arr.length - k)
        );
    }
}


