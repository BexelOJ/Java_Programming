import java.util.Arrays;

public class Java_20261023_17_ReverseArrayUsingRecursion {
    static void reverse(int[] a, int left, int right) {
        if (left >= right) return;

        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

        reverse(a, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        reverse(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}


