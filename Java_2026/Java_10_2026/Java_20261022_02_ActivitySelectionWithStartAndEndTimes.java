
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_02_ActivitySelectionWithStartAndEndTimes {

    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(5, 9),
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9)
        };

        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        int lastEnd = Integer.MIN_VALUE;
        int count = 0;

        for (Activity activity : activities) {
            if (activity.start >= lastEnd) {
                System.out.println(
                    "Start: " + activity.start +
                    ", End: " + activity.end
                );
                lastEnd = activity.end;
                count++;
            }
        }

        System.out.println("Selected activities: " + count);
    }
}



