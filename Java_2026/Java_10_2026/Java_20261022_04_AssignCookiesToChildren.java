
import java.util.Arrays;

public class Java_20261022_04_AssignCookiesToChildren {

    public static int findContentChildren(
            int[] greed, int[] cookies) {

        Arrays.sort(greed);
        Arrays.sort(cookies);

        int child = 0;
        int cookie = 0;

        while (child < greed.length && cookie < cookies.length) {
            if (cookies[cookie] >= greed[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }

    public static void main(String[] args) {
        int[] greed = {1, 2, 3};
        int[] cookies = {1, 1};

        System.out.println(
            "Content children: " +
            findContentChildren(greed, cookies)
        );
    }
}



