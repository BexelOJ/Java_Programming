public class Java_20261023_15_LinearSearchUsingRecursion {
    static int search(int[] a, int target, int index) {
        if (index == a.length) return -1;
        if (a[index] == target) return index;

        return search(a, target, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{10, 20, 30}, 20, 0));
    }
}


