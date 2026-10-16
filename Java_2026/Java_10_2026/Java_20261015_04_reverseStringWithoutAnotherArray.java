
import java.util.Arrays;

public class Java_20261015_04_reverseStringWithoutAnotherArray {

    public static void main(String[] args) {

        String str = "HELLO";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));
    }
}

