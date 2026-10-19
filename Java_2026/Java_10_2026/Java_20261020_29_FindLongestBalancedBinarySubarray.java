
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_29_FindLongestBalancedBinarySubarray {

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 1, 0, 0};

        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);

        int balance = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length; i++) {
            balance += (array[i] == 0) ? -1 : 1;

            if (firstIndex.containsKey(balance)) {
                int length = i - firstIndex.get(balance);

                if (length > maxLength) {
                    maxLength = length;
                    start = firstIndex.get(balance) + 1;
                    end = i;
                }
            } else {
                firstIndex.put(balance, i);
            }
        }

        System.out.println("Longest balanced length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);

            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}



