import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class Java_20260811_coll_EnumMap_01 {

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

        // 1. Declaration and initialization

        //-------------------------------------------

        EnumMap<Day, Integer> map =
                new EnumMap<>(Day.class);

        map.put(Day.MONDAY, 100);
        map.put(Day.TUESDAY, 200);
        map.put(Day.WEDNESDAY, 300);
        map.put(Day.THURSDAY, 400);
        map.put(Day.FRIDAY, 500);

        System.out.println("\nInitial EnumMap: \n" + map);


        //-------------------------------------------

        // 2. put(key, value)

        //-------------------------------------------

        map.put(Day.SATURDAY, 600);

        System.out.println(
                "\nAfter put(SATURDAY, 600): \n" + map
        );


        //-------------------------------------------

        // 3. put() with existing key

        //-------------------------------------------

        map.put(Day.MONDAY, 999);

        System.out.println(
                "\nAfter put(MONDAY, 999): \n" + map
        );


        //-------------------------------------------

        // 4. putIfAbsent()

        //-------------------------------------------

        map.putIfAbsent(Day.SUNDAY, 700);

        System.out.println(
                "\nAfter putIfAbsent(SUNDAY, 700): \n" + map
        );


        //-------------------------------------------

        // 5. get(key)

        //-------------------------------------------

        System.out.println(
                "\nmap.get(Day.MONDAY): " +
                map.get(Day.MONDAY)
        );


        //-------------------------------------------

        // 6. getOrDefault()

        //-------------------------------------------

        System.out.println(
                "\nmap.getOrDefault(Day.SUNDAY, 0): " +
                map.getOrDefault(Day.SUNDAY, 0)
        );


        //-------------------------------------------

        // 7. containsKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.containsKey(Day.TUESDAY): " +
                map.containsKey(Day.TUESDAY)
        );


        //-------------------------------------------

        // 8. containsValue()

        //-------------------------------------------

        System.out.println(
                "\nmap.containsValue(400): " +
                map.containsValue(400)
        );


        //-------------------------------------------

        // 9. remove(key)

        //-------------------------------------------

        map.remove(Day.SATURDAY);

        System.out.println(
                "\nAfter remove(SATURDAY): \n" + map
        );


        //-------------------------------------------

        // 10. remove(key, value)

        //-------------------------------------------

        boolean removed =
                map.remove(Day.FRIDAY, 500);

        System.out.println(
                "\nAfter remove(FRIDAY, 500): \n" + map
        );

        System.out.println(
                "Result of remove(): " +
                removed
        );


        //-------------------------------------------

        // 11. replace(key, value)

        //-------------------------------------------

        map.replace(Day.THURSDAY, 444);

        System.out.println(
                "\nAfter replace(THURSDAY, 444): \n" + map
        );


        //-------------------------------------------

        // 12. replace(key, oldValue, newValue)

        //-------------------------------------------

        boolean replaced =
                map.replace(
                        Day.TUESDAY,
                        200,
                        222
                );

        System.out.println(
                "\nAfter replace(TUESDAY, 200, 222): \n" + map
        );

        System.out.println(
                "Result of replace(): " +
                replaced
        );


        //-------------------------------------------

        // 13. putAll()

        //-------------------------------------------

        EnumMap<Day, Integer> map2 =
                new EnumMap<>(Day.class);

        map2.put(Day.FRIDAY, 800);
        map2.put(Day.SATURDAY, 900);

        map.putAll(map2);

        System.out.println(
                "\nAfter putAll(map2): \n" + map
        );


        //-------------------------------------------

        // 14. size()

        //-------------------------------------------

        System.out.println(
                "\nmap.size(): " +
                map.size()
        );


        //-------------------------------------------

        // 15. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nmap.isEmpty(): " +
                map.isEmpty()
        );


        //-------------------------------------------

        // 16. keySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.keySet(): \n" +
                map.keySet()
        );


        //-------------------------------------------

        // 17. values()

        //-------------------------------------------

        System.out.println(
                "\nmap.values(): \n" +
                map.values()
        );


        //-------------------------------------------

        // 18. entrySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.entrySet(): \n" +
                map.entrySet()
        );


        //-------------------------------------------

        // 19. Iterator over keySet()

        //-------------------------------------------

        System.out.print(
                "\nIterator over keySet(): \n"
        );

        Iterator<Day> keyIterator =
                map.keySet().iterator();

        while (keyIterator.hasNext()) {

            Day key = keyIterator.next();

            System.out.print(
                    key + " = " + map.get(key) + "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 20. Iterator over entrySet()

        //-------------------------------------------

        System.out.print(
                "\nIterator over entrySet(): \n"
        );

        Iterator<Map.Entry<Day, Integer>> entryIterator =
                map.entrySet().iterator();

        while (entryIterator.hasNext()) {

            Map.Entry<Day, Integer> entry =
                    entryIterator.next();

            System.out.print(
                    entry.getKey() +
                    " = " +
                    entry.getValue() +
                    "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 21. Enhanced for loop

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop: \n"
        );

        for (Map.Entry<Day, Integer> entry :
                map.entrySet()) {

            System.out.print(
                    entry.getKey() +
                    " = " +
                    entry.getValue() +
                    "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 22. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        map.forEach((key, value) ->
                System.out.print(
                        key + " = " + value + "  "
                )
        );

        System.out.println();


        //-------------------------------------------

        // 23. compute()

        //-------------------------------------------

        map.compute(
                Day.MONDAY,
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter compute(MONDAY, value + 100): \n" +
                map
        );


        //-------------------------------------------

        // 24. computeIfAbsent()

        //-------------------------------------------

        map.computeIfAbsent(
                Day.SATURDAY,
                key -> 1000
        );

        System.out.println(
                "\nAfter computeIfAbsent(SATURDAY): \n" +
                map
        );


        //-------------------------------------------

        // 25. computeIfPresent()

        //-------------------------------------------

        map.computeIfPresent(
                Day.TUESDAY,
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter computeIfPresent(TUESDAY): \n" +
                map
        );


        //-------------------------------------------

        // 26. merge()

        //-------------------------------------------

        map.merge(
                Day.MONDAY,
                50,
                Integer::sum
        );

        System.out.println(
                "\nAfter merge(MONDAY, 50): \n" +
                map
        );


        //-------------------------------------------

        // 27. replaceAll()

        //-------------------------------------------

        map.replaceAll(
                (key, value) -> value + 1
        );

        System.out.println(
                "\nAfter replaceAll(value + 1): \n" +
                map
        );


        //-------------------------------------------

        // 28. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        EnumMap<Day, Integer> cloned =
                (EnumMap<Day, Integer>) map.clone();

        System.out.println(
                "\nclone(): \n" +
                cloned
        );


        //-------------------------------------------

        // 29. equals()

        //-------------------------------------------

        System.out.println(
                "\nmap.equals(cloned): " +
                map.equals(cloned)
        );


        //-------------------------------------------

        // 30. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nmap.hashCode(): " +
                map.hashCode()
        );


        //-------------------------------------------

        // 31. clear()

        //-------------------------------------------

        map.clear();

        System.out.println(
                "\nAfter clear(): " + map
        );


        //-------------------------------------------

        // 32. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nmap.isEmpty(): " +
                map.isEmpty() + "\n"
        );
    }
}


/*
//---------------------------------------------------
Java Collections
        ↓
Map family
        ↓
HashMap
LinkedHashMap
TreeMap
Hashtable
EnumMap   ← next

//---------------------------------------------------
EnumMap is the Map counterpart to EnumSet: it is specifically designed for enum keys.

EnumMap<Day, Integer>

MONDAY    → 100
TUESDAY   → 200
WEDNESDAY → 300

//---------------------------------------------------
Output:


Initial EnumMap:
{MONDAY=100, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, FRIDAY=500}

After put(SATURDAY, 600):
{MONDAY=100, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, FRIDAY=500, SATURDAY=600}

After put(MONDAY, 999):
{MONDAY=999, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, FRIDAY=500, SATURDAY=600}

After putIfAbsent(SUNDAY, 700):
{MONDAY=999, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, FRIDAY=500, SATURDAY=600, SUNDAY=700}

map.get(Day.MONDAY): 999

map.getOrDefault(Day.SUNDAY, 0): 700

map.containsKey(Day.TUESDAY): true

map.containsValue(400): true

After remove(SATURDAY):
{MONDAY=999, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, FRIDAY=500, SUNDAY=700}

After remove(FRIDAY, 500):
{MONDAY=999, TUESDAY=200, WEDNESDAY=300, THURSDAY=400, SUNDAY=700}
Result of remove(): true

After replace(THURSDAY, 444):
{MONDAY=999, TUESDAY=200, WEDNESDAY=300, THURSDAY=444, SUNDAY=700}

After replace(TUESDAY, 200, 222):
{MONDAY=999, TUESDAY=222, WEDNESDAY=300, THURSDAY=444, SUNDAY=700}
Result of replace(): true

After putAll(map2):
{MONDAY=999, TUESDAY=222, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700}

map.size(): 7

map.isEmpty(): false

map.keySet():
[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

map.values():
[999, 222, 300, 444, 800, 900, 700]

map.entrySet():
[MONDAY=999, TUESDAY=222, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700]

Iterator over keySet():
MONDAY = 999  TUESDAY = 222  WEDNESDAY = 300  THURSDAY = 444  FRIDAY = 800  SATURDAY = 900  SUNDAY = 700

Iterator over entrySet():
MONDAY = 999  TUESDAY = 222  WEDNESDAY = 300  THURSDAY = 444  FRIDAY = 800  SATURDAY = 900  SUNDAY = 700

Enhanced for loop:
MONDAY = 999  TUESDAY = 222  WEDNESDAY = 300  THURSDAY = 444  FRIDAY = 800  SATURDAY = 900  SUNDAY = 700

forEach():
MONDAY = 999  TUESDAY = 222  WEDNESDAY = 300  THURSDAY = 444  FRIDAY = 800  SATURDAY = 900  SUNDAY = 700

After compute(MONDAY, value + 100):
{MONDAY=1099, TUESDAY=222, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700}

After computeIfAbsent(SATURDAY):
{MONDAY=1099, TUESDAY=222, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700}

After computeIfPresent(TUESDAY):
{MONDAY=1099, TUESDAY=322, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700}

After merge(MONDAY, 50):
{MONDAY=1149, TUESDAY=322, WEDNESDAY=300, THURSDAY=444, FRIDAY=800, SATURDAY=900, SUNDAY=700}

After replaceAll(value + 1):
{MONDAY=1150, TUESDAY=323, WEDNESDAY=301, THURSDAY=445, FRIDAY=801, SATURDAY=901, SUNDAY=701}

clone():
{MONDAY=1150, TUESDAY=323, WEDNESDAY=301, THURSDAY=445, FRIDAY=801, SATURDAY=901, SUNDAY=701}

map.equals(cloned): true

map.hashCode(): 1851089658

After clear(): {}

map.isEmpty(): true

//---------------------------------------------------


//---------------------------------------------------



*/


