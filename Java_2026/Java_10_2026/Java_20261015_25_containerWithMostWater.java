public class Java_20261016_ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            // Width between the two lines
            int width = right - left;

            // Water level is limited by the shorter line
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the area of water
            int area = width * minHeight;

            // Update maximum area
            maxWater = Math.max(maxWater, area);

            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum water: " + maxWater);
    }
}



