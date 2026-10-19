
public class Java_20261021_50_SolveJosephusProblemUsingRecursion {

    // Returns the survivor's 0-based index.
    static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        if (n < 1 || k < 1) {
            System.out.println("n and k must be positive");
            return;
        }

        int survivorIndex = josephus(n, k);
        int survivorPosition = survivorIndex + 1;

        System.out.println("Number of people: " + n);
        System.out.println("Elimination interval: " + k);
        System.out.println("Survivor index (0-based): "
                + survivorIndex);
        System.out.println("Survivor position (1-based): "
                + survivorPosition);
    }
}



