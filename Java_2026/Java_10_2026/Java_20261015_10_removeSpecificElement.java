
import java.util.Arrays;

public class Java_20261015_10_removeSpecificElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 50};
        int target = 20;

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != target) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing " + target + ":");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew logical length: " + k);
    }
}




