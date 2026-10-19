
import java.util.Arrays;

public class Java_20261021_05_ReverseArrayUsingDivideAndConquer {

    static void reverse(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverse(array, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        reverse(array, 0, array.length - 1);

        System.out.println("Reversed array: "
                + Arrays.toString(array));
    }
}



