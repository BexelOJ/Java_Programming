import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class java_20260811_coll_TreeMap_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        TreeMap<String, Integer> map =
                new TreeMap<>();

        map.put("C", 300);
        map.put("A", 100);
        map.put("E", 500);
        map.put("B", 200);
        map.put("D", 400);

        System.out.println("\nInitial TreeMap: \n" + map);


        //-------------------------------------------

        // 2. put(key, value)

        //-------------------------------------------

        map.put("F", 600);

        System.out.println(
                "\nAfter put(\"F\", 600): \n" + map
        );


        //-------------------------------------------

        // 3. put() with existing key

        //-------------------------------------------

        map.put("C", 999);

        System.out.println(
                "\nAfter put(\"C\", 999): \n" + map
        );


        //-------------------------------------------

        // 4. putIfAbsent()

        //-------------------------------------------

        map.putIfAbsent("G", 700);

        System.out.println(
                "\nAfter putIfAbsent(\"G\", 700): \n" + map
        );


        //-------------------------------------------

        // 5. get(key)

        //-------------------------------------------

        System.out.println(
                "\nmap.get(\"C\"): " +
                map.get("C")
        );


        //-------------------------------------------

        // 6. getOrDefault()

        //-------------------------------------------

        System.out.println(
                "\nmap.getOrDefault(\"Z\", 0): " +
                map.getOrDefault("Z", 0)
        );


        //-------------------------------------------

        // 7. containsKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.containsKey(\"B\"): " +
                map.containsKey("B")
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

        map.remove("F");

        System.out.println(
                "\nAfter remove(\"F\"): \n" + map
        );


        //-------------------------------------------

        // 10. remove(key, value)

        //-------------------------------------------

        boolean removed =
                map.remove("E", 500);

        System.out.println(
                "\nAfter remove(\"E\", 500): \n" + map
        );

        System.out.println(
                "Result of remove(): " +
                removed
        );


        //-------------------------------------------

        // 11. replace(key, value)

        //-------------------------------------------

        map.replace("D", 444);

        System.out.println(
                "\nAfter replace(\"D\", 444): \n" + map
        );


        //-------------------------------------------

        // 12. replace(key, oldValue, newValue)

        //-------------------------------------------

        boolean replaced =
                map.replace("B", 200, 222);

        System.out.println(
                "\nAfter replace(\"B\", 200, 222): \n" + map
        );

        System.out.println(
                "Result of replace(): " +
                replaced
        );


        //-------------------------------------------

        // 13. putAll()

        //-------------------------------------------

        TreeMap<String, Integer> map2 =
                new TreeMap<>();

        map2.put("H", 800);
        map2.put("I", 900);

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

        // 16. firstKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.firstKey(): " +
                map.firstKey()
        );


        //-------------------------------------------

        // 17. lastKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.lastKey(): " +
                map.lastKey()
        );


        //-------------------------------------------

        // 18. lowerKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.lowerKey(\"D\"): " +
                map.lowerKey("D")
        );


        //-------------------------------------------

        // 19. floorKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.floorKey(\"D\"): " +
                map.floorKey("D")
        );


        //-------------------------------------------

        // 20. ceilingKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.ceilingKey(\"D\"): " +
                map.ceilingKey("D")
        );


        //-------------------------------------------

        // 21. higherKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.higherKey(\"D\"): " +
                map.higherKey("D")
        );


        //-------------------------------------------

        // 22. firstEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.firstEntry(): " +
                map.firstEntry()
        );


        //-------------------------------------------

        // 23. lastEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.lastEntry(): " +
                map.lastEntry()
        );


        //-------------------------------------------

        // 24. lowerEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.lowerEntry(\"D\"): " +
                map.lowerEntry("D")
        );


        //-------------------------------------------

        // 25. floorEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.floorEntry(\"D\"): " +
                map.floorEntry("D")
        );


        //-------------------------------------------

        // 26. ceilingEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.ceilingEntry(\"D\"): " +
                map.ceilingEntry("D")
        );


        //-------------------------------------------

        // 27. higherEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.higherEntry(\"D\"): " +
                map.higherEntry("D")
        );


        //-------------------------------------------

        // 28. pollFirstEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.pollFirstEntry(): " +
                map.pollFirstEntry()
        );

        System.out.println(
                "\nAfter pollFirstEntry(): \n" + map
        );


        //-------------------------------------------

        // 29. pollLastEntry()

        //-------------------------------------------

        System.out.println(
                "\nmap.pollLastEntry(): " +
                map.pollLastEntry()
        );

        System.out.println(
                "\nAfter pollLastEntry(): \n" + map
        );


        //-------------------------------------------

        // 30. headMap()

        //-------------------------------------------

        System.out.println(
                "\nmap.headMap(\"D\"): \n" +
                map.headMap("D")
        );


        //-------------------------------------------

        // 31. tailMap()

        //-------------------------------------------

        System.out.println(
                "\nmap.tailMap(\"D\"): \n" +
                map.tailMap("D")
        );


        //-------------------------------------------

        // 32. subMap()

        //-------------------------------------------

        System.out.println(
                "\nmap.subMap(\"B\", \"G\"): \n" +
                map.subMap("B", "G")
        );


        //-------------------------------------------

        // 33. descendingMap()

        //-------------------------------------------

        System.out.println(
                "\nmap.descendingMap(): \n" +
                map.descendingMap()
        );


        //-------------------------------------------

        // 34. navigableKeySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.navigableKeySet(): \n" +
                map.navigableKeySet()
        );


        //-------------------------------------------

        // 35. descendingKeySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.descendingKeySet(): \n" +
                map.descendingKeySet()
        );


        //-------------------------------------------

        // 36. comparator()

        //-------------------------------------------

        System.out.println(
                "\nmap.comparator(): " +
                map.comparator()
        );


        //-------------------------------------------

        // 37. keySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.keySet(): \n" +
                map.keySet()
        );


        //-------------------------------------------

        // 38. values()

        //-------------------------------------------

        System.out.println(
                "\nmap.values(): \n" +
                map.values()
        );


        //-------------------------------------------

        // 39. entrySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.entrySet(): \n" +
                map.entrySet()
        );


        //-------------------------------------------

        // 40. Iterator over keySet()

        //-------------------------------------------

        System.out.print(
                "\nIterator over keySet(): \n"
        );

        Iterator<String> keyIterator =
                map.keySet().iterator();

        while (keyIterator.hasNext()) {

            String key = keyIterator.next();

            System.out.print(
                    key + " = " + map.get(key) + "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 41. Iterator over entrySet()

        //-------------------------------------------

        System.out.print(
                "\nIterator over entrySet(): \n"
        );

        Iterator<Map.Entry<String, Integer>> entryIterator =
                map.entrySet().iterator();

        while (entryIterator.hasNext()) {

            Map.Entry<String, Integer> entry =
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

        // 42. Enhanced for loop

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop: \n"
        );

        for (Map.Entry<String, Integer> entry :
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

        // 43. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        map.forEach((key, value) ->
                System.out.print(
                        key + " = " + value + "  "
                )
        );

        System.out.println();


        //-------------------------------------------

        // 44. compute()

        //-------------------------------------------

        map.compute(
                "B",
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter compute(\"B\", value + 100): \n" +
                map
        );


        //-------------------------------------------

        // 45. computeIfAbsent()

        //-------------------------------------------

        map.computeIfAbsent(
                "J",
                key -> 1000
        );

        System.out.println(
                "\nAfter computeIfAbsent(\"J\"): \n" +
                map
        );


        //-------------------------------------------

        // 46. computeIfPresent()

        //-------------------------------------------

        map.computeIfPresent(
                "B",
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter computeIfPresent(\"B\"): \n" +
                map
        );


        //-------------------------------------------

        // 47. merge()

        //-------------------------------------------

        map.merge(
                "A",
                50,
                Integer::sum
        );

        System.out.println(
                "\nAfter merge(\"A\", 50): \n" +
                map
        );


        //-------------------------------------------

        // 48. replaceAll()

        //-------------------------------------------

        map.replaceAll(
                (key, value) -> value + 1
        );

        System.out.println(
                "\nAfter replaceAll(value + 1): \n" +
                map
        );


        //-------------------------------------------

        // 49. equals()

        //-------------------------------------------

        TreeMap<String, Integer> map3 =
                new TreeMap<>(map);

        System.out.println(
                "\nmap.equals(map3): " +
                map.equals(map3)
        );


        //-------------------------------------------

        // 50. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nmap.hashCode(): " +
                map.hashCode()
        );


        //-------------------------------------------

        // 51. clear()

        //-------------------------------------------

        map.clear();

        System.out.println(
                "\nAfter clear(): " + map
        );


        //-------------------------------------------

        // 52. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nmap.isEmpty(): " +
                map.isEmpty() + "\n"
        );
    }
}


/*
//---------------------------------------------------
We have covered important TreeMap operations:

firstKey()
lastKey()
lowerKey()
floorKey()
ceilingKey()
higherKey()
pollFirstEntry()
pollLastEntry()
headMap()
tailMap()
subMap()
descendingMap()
navigableKeySet()
descendingKeySet()

//---------------------------------------------------
The key behavior to observe is:

TreeMap
   ↓
Key-value pairs
   ↓
Sorted by key
   ↓
A → B → C → D → E

//---------------------------------------------------
So the three main Map implementations are now:

HashMap
    → no guaranteed order

LinkedHashMap
    → insertion order

TreeMap
    → sorted by key

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/


