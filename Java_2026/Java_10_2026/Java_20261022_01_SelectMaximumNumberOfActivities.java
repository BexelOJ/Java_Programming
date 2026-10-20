import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_01_SelectMaximumNumberOfActivities {

    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 3),
            new Activity(2, 5),
            new Activity(4, 6),
            new Activity(6, 7),
            new Activity(5, 8),
            new Activity(8, 9)
        };

        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (Activity activity : activities) {
            if (activity.start >= lastEnd) {
                System.out.println(
                    activity.start + " - " + activity.end
                );
                lastEnd = activity.end;
                count++;
            }
        }

        System.out.println("Maximum activities: " + count);
    }
}



