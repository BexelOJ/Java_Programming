public class Java_20261023_16_BinarySearchUsingRecursion {
    static int search(int[] a, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (a[mid] == target) return mid;
        if (target < a[mid])
            return search(a, target, low, mid - 1);

        return search(a, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(search(a, 40, 0, a.length - 1));
    }
}


