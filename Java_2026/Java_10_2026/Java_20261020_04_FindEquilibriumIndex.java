
public class Java_20261020_04_FindEquilibriumIndex {

    public static int findEquilibriumIndex(int[] arr) {
        long totalSum = 0;

        for (int value : arr) {
            totalSum += value;
        }

        long leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int index = findEquilibriumIndex(arr);

        System.out.println("Equilibrium index: " + index);
    }
}





