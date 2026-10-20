
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_08_MaximumMeetingsInOneRoom {

    static class Meeting {
        int start, end, number;

        Meeting(int start, int end, int number) {
            this.start = start;
            this.end = end;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Meeting[] meetings = {
            new Meeting(1, 2, 1),
            new Meeting(3, 4, 2),
            new Meeting(0, 6, 3),
            new Meeting(5, 7, 4),
            new Meeting(8, 9, 5),
            new Meeting(5, 9, 6)
        };

        Arrays.sort(meetings,
            Comparator.comparingInt((Meeting m) -> m.end)
                      .thenComparingInt(m -> m.number));

        int lastEnd = Integer.MIN_VALUE;
        int count = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start > lastEnd) {
                System.out.println("Meeting " + meeting.number);
                lastEnd = meeting.end;
                count++;
            }
        }

        System.out.println("Maximum meetings: " + count);
    }
}



