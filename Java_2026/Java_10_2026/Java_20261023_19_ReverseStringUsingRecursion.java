public class Java_20261023_19_ReverseStringUsingRecursion {
    static String reverse(String s) {
        if (s.isEmpty()) return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Java"));
    }
}


