
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_20261021_43_FindSkylineUsingDivideAndConquer {

    static List<int[]> getSkyline(int[][] buildings, int left, int right) {
        List<int[]> result = new ArrayList<>();

        if (left > right) {
            return result;
        }

        if (left == right) {
            int[] b = buildings[left];
            result.add(new int[]{b[0], b[2]});
            result.add(new int[]{b[1], 0});
            return result;
        }

        int mid = left + (right - left) / 2;

        List<int[]> first = getSkyline(buildings, left, mid);
        List<int[]> second = getSkyline(buildings, mid + 1, right);

        return merge(first, second);
    }

    static List<int[]> merge(List<int[]> a, List<int[]> b) {
        List<int[]> result = new ArrayList<>();

        int i = 0, j = 0;
        int heightA = 0, heightB = 0;
        int previousHeight = 0;

        while (i < a.size() || j < b.size()) {
            int x;

            if (j >= b.size()
                    || (i < a.size() && a.get(i)[0] < b.get(j)[0])) {
                x = a.get(i)[0];
                heightA = a.get(i)[1];
                i++;
            } else if (i >= a.size()
                    || b.get(j)[0] < a.get(i)[0]) {
                x = b.get(j)[0];
                heightB = b.get(j)[1];
                j++;
            } else {
                x = a.get(i)[0];
                heightA = a.get(i)[1];
                heightB = b.get(j)[1];
                i++;
                j++;
            }

            int currentHeight = Math.max(heightA, heightB);

            if (currentHeight != previousHeight) {
                result.add(new int[]{x, currentHeight});
                previousHeight = currentHeight;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] buildings = {
            {2, 9, 10},
            {3, 7, 15},
            {5, 12, 12},
            {15, 20, 10},
            {19, 24, 8}
        };

        Arrays.sort(buildings,
                (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> skyline =
                getSkyline(buildings, 0, buildings.length - 1);

        System.out.println("Skyline key points:");
        for (int[] point : skyline) {
            System.out.println(Arrays.toString(point));
        }
    }
}

