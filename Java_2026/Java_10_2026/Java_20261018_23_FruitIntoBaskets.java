
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_23_FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            frequency.put(
                fruits[right],
                frequency.getOrDefault(fruits[right], 0) + 1
            );

            while (frequency.size() > 2) {

                int outgoing = fruits[left];
                int count = frequency.get(outgoing);

                if (count == 1) {
                    frequency.remove(outgoing);
                } else {
                    frequency.put(outgoing, count - 1);
                }

                left++;
            }

            maxFruits = Math.max(
                maxFruits, right - left + 1
            );
        }

        return maxFruits;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3};

        System.out.println("Maximum fruits: " + totalFruit(fruits));
    }
}




