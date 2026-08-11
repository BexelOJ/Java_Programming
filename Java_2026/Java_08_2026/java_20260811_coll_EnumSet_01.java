import java.util.EnumSet;
import java.util.Iterator;

public class java_20260811_coll_EnumSet_01 {

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. allOf()

        //-------------------------------------------

        EnumSet<Day> days =
                EnumSet.allOf(Day.class);

        System.out.println(
                "\nEnumSet.allOf(Day.class): \n" +
                days
        );


        //-------------------------------------------

        // 2. noneOf()

        //-------------------------------------------

        EnumSet<Day> emptyDays =
                EnumSet.noneOf(Day.class);

        System.out.println(
                "\nEnumSet.noneOf(Day.class): \n" +
                emptyDays
        );


        //-------------------------------------------

        // 3. add()

        //-------------------------------------------

        emptyDays.add(Day.MONDAY);
        emptyDays.add(Day.WEDNESDAY);
        emptyDays.add(Day.FRIDAY);

        System.out.println(
                "\nAfter add(): \n" +
                emptyDays
        );


        //-------------------------------------------

        // 4. add(duplicate)

        //-------------------------------------------

        boolean added =
                emptyDays.add(Day.MONDAY);

        System.out.println(
                "\nAfter add(MONDAY): \n" +
                emptyDays
        );

        System.out.println(
                "Result of add(): " +
                added
        );


        //-------------------------------------------

        // 5. remove()

        //-------------------------------------------

        boolean removed =
                emptyDays.remove(Day.WEDNESDAY);

        System.out.println(
                "\nAfter remove(WEDNESDAY): \n" +
                emptyDays
        );

        System.out.println(
                "Result of remove(): " +
                removed
        );


        //-------------------------------------------

        // 6. contains()

        //-------------------------------------------

        System.out.println(
                "\nemptyDays.contains(Day.MONDAY): " +
                emptyDays.contains(Day.MONDAY)
        );


        //-------------------------------------------

        // 7. size()

        //-------------------------------------------

        System.out.println(
                "\nemptyDays.size(): " +
                emptyDays.size()
        );


        //-------------------------------------------

        // 8. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nemptyDays.isEmpty(): " +
                emptyDays.isEmpty()
        );


        //-------------------------------------------

        // 9. of()

        //-------------------------------------------

        EnumSet<Day> weekdays =
                EnumSet.of(
                        Day.MONDAY,
                        Day.TUESDAY,
                        Day.WEDNESDAY,
                        Day.THURSDAY,
                        Day.FRIDAY
                );

        System.out.println(
                "\nEnumSet.of(): \n" +
                weekdays
        );


        //-------------------------------------------

        // 10. range()

        //-------------------------------------------

        EnumSet<Day> workDays =
                EnumSet.range(
                        Day.MONDAY,
                        Day.FRIDAY
                );

        System.out.println(
                "\nEnumSet.range(MONDAY, FRIDAY): \n" +
                workDays
        );


        //-------------------------------------------

        // 11. complementOf()

        //-------------------------------------------

        EnumSet<Day> weekends =
                EnumSet.complementOf(workDays);

        System.out.println(
                "\nEnumSet.complementOf(workDays): \n" +
                weekends
        );


        //-------------------------------------------

        // 12. addAll()

        //-------------------------------------------

        emptyDays.addAll(weekends);

        System.out.println(
                "\nAfter addAll(weekends): \n" +
                emptyDays
        );


        //-------------------------------------------

        // 13. containsAll()

        //-------------------------------------------

        System.out.println(
                "\nemptyDays.containsAll(weekends): " +
                emptyDays.containsAll(weekends)
        );


        //-------------------------------------------

        // 14. removeAll()

        //-------------------------------------------

        emptyDays.removeAll(weekends);

        System.out.println(
                "\nAfter removeAll(weekends): \n" +
                emptyDays
        );


        //-------------------------------------------

        // 15. retainAll()

        //-------------------------------------------

        EnumSet<Day> selectedDays =
                EnumSet.of(
                        Day.MONDAY,
                        Day.FRIDAY,
                        Day.SATURDAY
                );

        emptyDays.retainAll(selectedDays);

        System.out.println(
                "\nAfter retainAll(selectedDays): \n" +
                emptyDays
        );


        //-------------------------------------------

        // 16. iterator()

        //-------------------------------------------

        System.out.print(
                "\nIterator: \n"
        );

        Iterator<Day> it =
                weekdays.iterator();

        while (it.hasNext()) {
            System.out.print(
                    it.next() + " "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 17. Enhanced for loop

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop: \n"
        );

        for (Day day : weekdays) {
            System.out.print(day + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 18. forEach()

        //-------------------------------------------

        System.out.print(
                "\nforEach(): \n"
        );

        weekdays.forEach(
                day -> System.out.print(day + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 19. toArray()

        //-------------------------------------------

        Object[] array =
                weekdays.toArray();

        System.out.print(
                "\ntoArray(): \n"
        );

        for (Object value : array) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 20. removeIf()

        //-------------------------------------------

        weekdays.removeIf(
                day -> day == Day.MONDAY
        );

        System.out.println(
                "\nAfter removeIf(MONDAY): \n" +
                weekdays
        );


        //-------------------------------------------

        // 21. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        EnumSet<Day> cloned =
                (EnumSet<Day>) weekdays.clone();

        System.out.println(
                "\nclone(): \n" +
                cloned
        );


        //-------------------------------------------

        // 22. equals()

        //-------------------------------------------

        System.out.println(
                "\nweekdays.equals(cloned): " +
                weekdays.equals(cloned)
        );


        //-------------------------------------------

        // 23. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nweekdays.hashCode(): " +
                weekdays.hashCode()
        );


        //-------------------------------------------

        // 24. clear()

        //-------------------------------------------

        weekdays.clear();

        System.out.println(
                "\nAfter clear(): " +
                weekdays
        );


        //-------------------------------------------

        // 25. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nweekdays.isEmpty(): " +
                weekdays.isEmpty() + "\n"
        );
    }
}


/*
//---------------------------------------------------

Java Collections
        ↓
Set family
        ↓
HashSet
LinkedHashSet
TreeSet
EnumSet   ← next

//---------------------------------------------------
The important EnumSet-specific functions are:

allOf()
noneOf()
of()
range()
complementOf()

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/



