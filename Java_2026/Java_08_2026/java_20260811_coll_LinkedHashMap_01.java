import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class java_20260811_coll_LinkedHashMap_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        LinkedHashMap<String, Integer> map =
                new LinkedHashMap<>();

        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("E", 500);

        System.out.println("\nInitial LinkedHashMap: \n" + map);


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

        // 5. putIfAbsent() with existing key

        //-------------------------------------------

        map.putIfAbsent("C", 888);

        System.out.println(
                "\nAfter putIfAbsent(\"C\", 888): \n" + map
        );


        //-------------------------------------------

        // 6. get(key)

        //-------------------------------------------

        System.out.println(
                "\nmap.get(\"C\"): " +
                map.get("C")
        );


        //-------------------------------------------

        // 7. getOrDefault()

        //-------------------------------------------

        System.out.println(
                "\nmap.getOrDefault(\"Z\", 0): " +
                map.getOrDefault("Z", 0)
        );


        //-------------------------------------------

        // 8. containsKey()

        //-------------------------------------------

        System.out.println(
                "\nmap.containsKey(\"B\"): " +
                map.containsKey("B")
        );


        //-------------------------------------------

        // 9. containsValue()

        //-------------------------------------------

        System.out.println(
                "\nmap.containsValue(400): " +
                map.containsValue(400)
        );


        //-------------------------------------------

        // 10. remove(key)

        //-------------------------------------------

        map.remove("F");

        System.out.println(
                "\nAfter remove(\"F\"): \n" + map
        );


        //-------------------------------------------

        // 11. remove(key, value)

        //-------------------------------------------

        boolean removed =
                map.remove("E", 500);

        System.out.println(
                "\nAfter remove(\"E\", 500): \n" + map
        );

        System.out.println(
                "Result of remove(\"E\", 500): " +
                removed
        );


        //-------------------------------------------

        // 12. replace(key, value)

        //-------------------------------------------

        map.replace("D", 444);

        System.out.println(
                "\nAfter replace(\"D\", 444): \n" + map
        );


        //-------------------------------------------

        // 13. replace(key, oldValue, newValue)

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

        // 14. putAll()

        //-------------------------------------------

        LinkedHashMap<String, Integer> map2 =
                new LinkedHashMap<>();

        map2.put("H", 800);
        map2.put("I", 900);

        map.putAll(map2);

        System.out.println(
                "\nAfter putAll(map2): \n" + map
        );


        //-------------------------------------------

        // 15. size()

        //-------------------------------------------

        System.out.println(
                "\nmap.size(): " +
                map.size()
        );


        //-------------------------------------------

        // 16. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nmap.isEmpty(): " +
                map.isEmpty()
        );


        //-------------------------------------------

        // 17. keySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.keySet(): \n" +
                map.keySet()
        );


        //-------------------------------------------

        // 18. values()

        //-------------------------------------------

        System.out.println(
                "\nmap.values(): \n" +
                map.values()
        );


        //-------------------------------------------

        // 19. entrySet()

        //-------------------------------------------

        System.out.println(
                "\nmap.entrySet(): \n" +
                map.entrySet()
        );


        //-------------------------------------------

        // 20. Iterator over keySet()

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

        // 21. Iterator over entrySet()

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

        // 22. Enhanced for loop over keySet()

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop over keySet(): \n"
        );

        for (String key : map.keySet()) {

            System.out.print(
                    key + " = " + map.get(key) + "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 23. Enhanced for loop over entrySet()

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop over entrySet(): \n"
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

        // 24. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        map.forEach((key, value) ->
                System.out.print(
                        key + " = " + value + "  "
                )
        );

        System.out.println();


        //-------------------------------------------

        // 25. compute()

        //-------------------------------------------

        map.compute(
                "A",
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter compute(\"A\", value + 100): \n" +
                map
        );


        //-------------------------------------------

        // 26. computeIfAbsent()

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

        // 27. computeIfPresent()

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

        // 28. merge()

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

        // 29. replaceAll()

        //-------------------------------------------

        map.replaceAll(
                (key, value) -> value + 1
        );

        System.out.println(
                "\nAfter replaceAll(value + 1): \n" +
                map
        );


        //-------------------------------------------

        // 30. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        LinkedHashMap<String, Integer> cloned =
                (LinkedHashMap<String, Integer>) map.clone();

        System.out.println(
                "\nclone(): \n" +
                cloned
        );


        //-------------------------------------------

        // 31. equals()

        //-------------------------------------------

        System.out.println(
                "\nmap.equals(cloned): " +
                map.equals(cloned)
        );


        //-------------------------------------------

        // 32. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nmap.hashCode(): " +
                map.hashCode()
        );


        //-------------------------------------------

        // 33. clear()

        //-------------------------------------------

        map.clear();

        System.out.println(
                "\nAfter clear(): " + map
        );


        //-------------------------------------------

        // 34. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nmap.isEmpty(): " +
                map.isEmpty() + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important LinkedHashMap operations:


//---------------------------------------------------
HashMap
    → key-value pairs
    → no guaranteed iteration order

LinkedHashMap
    → key-value pairs
    → preserves insertion order


*/



