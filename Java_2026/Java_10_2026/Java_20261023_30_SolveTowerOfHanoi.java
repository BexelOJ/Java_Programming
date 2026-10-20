public class Java_20261023_30_SolveTowerOfHanoi {
    static void solve(int n, char from, char aux, char to) {
        if (n == 0) return;

        solve(n - 1, from, to, aux);
        System.out.println(from + " -> " + to);
        solve(n - 1, aux, from, to);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }
}


