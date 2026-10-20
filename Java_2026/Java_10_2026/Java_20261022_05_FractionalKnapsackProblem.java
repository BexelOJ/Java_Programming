
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_05_FractionalKnapsackProblem {

    static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        double ratio() {
            return (double) value / weight;
        }
    }

    public static double fractionalKnapsack(
            Item[] items, int capacity) {

        Arrays.sort(items,
            Comparator.comparingDouble(Item::ratio).reversed());

        double totalValue = 0;

        for (Item item : items) {
            if (capacity == 0) {
                break;
            }

            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += item.ratio() * capacity;
                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        System.out.printf(
            "Maximum value: %.2f%n",
            fractionalKnapsack(items, 50)
        );
    }
}



