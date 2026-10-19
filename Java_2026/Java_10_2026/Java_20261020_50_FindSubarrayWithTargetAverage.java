
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_50_FindSubarrayWithTargetAverage {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5, 3};
        int targetAverage = 3;

        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);

        long transformedSum = 0;

        for (int i = 0; i < array.length; i++) {
            transformedSum += array[i] - targetAverage;

            if (firstIndex.containsKey(transformedSum)) {
                int start = firstIndex.get(transformedSum) + 1;
                int end = i;

                long sum = 0;
                for (int j = start; j <= end; j++) {
                    sum += array[j];
                }

                double average = (double) sum / (end - start + 1);

                System.out.println("Subarray found:");

                for (int j = start; j <= end; j++) {
                    System.out.print(array[j] + " ");
                }

                System.out.println();
                System.out.println("Start index: " + start);
                System.out.println("End index: " + end);
                System.out.println("Average: " + average);
                return;
            }

            firstIndex.putIfAbsent(transformedSum, i);
        }

        System.out.println("No matching subarray found.");
    }
}



