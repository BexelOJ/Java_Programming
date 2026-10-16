import java.util.*;

public class Java_20261015_37_findNumTriangleFromArray {

    public static long countTriangles(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        long count = 0;

        for (int k = n - 1; k >= 2; k--) {

            int left = 0;
            int right = k - 1;

            while (left < right) {

                if ((long) arr[left] + arr[right] > arr[k]) {

                    count += right - left;
                    right--;

                } else {
                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 7};

        System.out.println(countTriangles(arr));
    }
}




