
import java.util.Arrays;

public class Java_20261022_48_MinimumCostToMakeArrayEqual {

    static class Element {
        int value;
        int cost;

        Element(int value, int cost) {
            this.value = value;
            this.cost = cost;
        }
    }

    public static long minCost(int[] nums, int[] costs) {
        int n = nums.length;
        Element[] elements = new Element[n];
        long totalWeight = 0;

        for (int i = 0; i < n; i++) {
            elements[i] = new Element(nums[i], costs[i]);
            totalWeight += costs[i];
        }

        Arrays.sort(elements,
            (a, b) -> Integer.compare(a.value, b.value));

        long prefixWeight = 0;
        int target = elements[0].value;

        for (Element element : elements) {
            prefixWeight += element.cost;

            if (prefixWeight * 2 >= totalWeight) {
                target = element.value;
                break;
            }
        }

        long totalCost = 0;

        for (int i = 0; i < n; i++) {
            totalCost += Math.abs((long) nums[i] - target) * costs[i];
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2};
        int[] costs = {2, 3, 1, 14};

        System.out.println(
            "Minimum cost: " + minCost(nums, costs)
        );
    }
}



