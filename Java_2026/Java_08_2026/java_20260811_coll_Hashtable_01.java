import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class java_20260811_coll_Hashtable_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        Hashtable<String, Integer> table =
                new Hashtable<>();

        table.put("A", 100);
        table.put("B", 200);
        table.put("C", 300);
        table.put("D", 400);
        table.put("E", 500);

        System.out.println("\nInitial Hashtable: \n" + table);


        //-------------------------------------------

        // 2. put(key, value)

        //-------------------------------------------

        table.put("F", 600);

        System.out.println(
                "\nAfter put(\"F\", 600): \n" + table
        );


        //-------------------------------------------

        // 3. put() with existing key

        //-------------------------------------------

        table.put("C", 999);

        System.out.println(
                "\nAfter put(\"C\", 999): \n" + table
        );


        //-------------------------------------------

        // 4. putIfAbsent()

        //-------------------------------------------

        table.putIfAbsent("G", 700);

        System.out.println(
                "\nAfter putIfAbsent(\"G\", 700): \n" + table
        );


        //-------------------------------------------

        // 5. putIfAbsent() with existing key

        //-------------------------------------------

        table.putIfAbsent("C", 888);

        System.out.println(
                "\nAfter putIfAbsent(\"C\", 888): \n" + table
        );


        //-------------------------------------------

        // 6. get(key)

        //-------------------------------------------

        System.out.println(
                "\ntable.get(\"C\"): " +
                table.get("C")
        );


        //-------------------------------------------

        // 7. getOrDefault()

        //-------------------------------------------

        System.out.println(
                "\ntable.getOrDefault(\"Z\", 0): " +
                table.getOrDefault("Z", 0)
        );


        //-------------------------------------------

        // 8. containsKey()

        //-------------------------------------------

        System.out.println(
                "\ntable.containsKey(\"B\"): " +
                table.containsKey("B")
        );


        //-------------------------------------------

        // 9. containsValue()

        //-------------------------------------------

        System.out.println(
                "\ntable.containsValue(400): " +
                table.containsValue(400)
        );


        //-------------------------------------------

        // 10. remove(key)

        //-------------------------------------------

        table.remove("F");

        System.out.println(
                "\nAfter remove(\"F\"): \n" + table
        );


        //-------------------------------------------

        // 11. remove(key, value)

        //-------------------------------------------

        boolean removed =
                table.remove("E", 500);

        System.out.println(
                "\nAfter remove(\"E\", 500): \n" + table
        );

        System.out.println(
                "Result of remove(): " +
                removed
        );


        //-------------------------------------------

        // 12. replace(key, value)

        //-------------------------------------------

        table.replace("D", 444);

        System.out.println(
                "\nAfter replace(\"D\", 444): \n" + table
        );


        //-------------------------------------------

        // 13. replace(key, oldValue, newValue)

        //-------------------------------------------

        boolean replaced =
                table.replace("B", 200, 222);

        System.out.println(
                "\nAfter replace(\"B\", 200, 222): \n" + table
        );

        System.out.println(
                "Result of replace(): " +
                replaced
        );


        //-------------------------------------------

        // 14. putAll()

        //-------------------------------------------

        Hashtable<String, Integer> table2 =
                new Hashtable<>();

        table2.put("H", 800);
        table2.put("I", 900);

        table.putAll(table2);

        System.out.println(
                "\nAfter putAll(table2): \n" + table
        );


        //-------------------------------------------

        // 15. size()

        //-------------------------------------------

        System.out.println(
                "\ntable.size(): " +
                table.size()
        );


        //-------------------------------------------

        // 16. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\ntable.isEmpty(): " +
                table.isEmpty()
        );


        //-------------------------------------------

        // 17. keySet()

        //-------------------------------------------

        System.out.println(
                "\ntable.keySet(): \n" +
                table.keySet()
        );


        //-------------------------------------------

        // 18. values()

        //-------------------------------------------

        System.out.println(
                "\ntable.values(): \n" +
                table.values()
        );


        //-------------------------------------------

        // 19. entrySet()

        //-------------------------------------------

        System.out.println(
                "\ntable.entrySet(): \n" +
                table.entrySet()
        );


        //-------------------------------------------

        // 20. Iterator over keySet()

        //-------------------------------------------

        System.out.print(
                "\nIterator over keySet(): \n"
        );

        Iterator<String> keyIterator =
                table.keySet().iterator();

        while (keyIterator.hasNext()) {

            String key = keyIterator.next();

            System.out.print(
                    key + " = " + table.get(key) + "  "
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
                table.entrySet().iterator();

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

        // 22. Enhanced for loop

        //-------------------------------------------

        System.out.print(
                "\nEnhanced for loop: \n"
        );

        for (Map.Entry<String, Integer> entry :
                table.entrySet()) {

            System.out.print(
                    entry.getKey() +
                    " = " +
                    entry.getValue() +
                    "  "
            );
        }

        System.out.println();


        //-------------------------------------------

        // 23. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        table.forEach((key, value) ->
                System.out.print(
                        key + " = " + value + "  "
                )
        );

        System.out.println();


        //-------------------------------------------

        // 24. compute()

        //-------------------------------------------

        table.compute(
                "A",
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter compute(\"A\", value + 100): \n" +
                table
        );


        //-------------------------------------------

        // 25. computeIfAbsent()

        //-------------------------------------------

        table.computeIfAbsent(
                "J",
                key -> 1000
        );

        System.out.println(
                "\nAfter computeIfAbsent(\"J\"): \n" +
                table
        );


        //-------------------------------------------

        // 26. computeIfPresent()

        //-------------------------------------------

        table.computeIfPresent(
                "B",
                (key, value) -> value + 100
        );

        System.out.println(
                "\nAfter computeIfPresent(\"B\"): \n" +
                table
        );


        //-------------------------------------------

        // 27. merge()

        //-------------------------------------------

        table.merge(
                "A",
                50,
                Integer::sum
        );

        System.out.println(
                "\nAfter merge(\"A\", 50): \n" +
                table
        );


        //-------------------------------------------

        // 28. replaceAll()

        //-------------------------------------------

        table.replaceAll(
                (key, value) -> value + 1
        );

        System.out.println(
                "\nAfter replaceAll(value + 1): \n" +
                table
        );


        //-------------------------------------------

        // 29. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        Hashtable<String, Integer> cloned =
                (Hashtable<String, Integer>) table.clone();

        System.out.println(
                "\nclone(): \n" +
                cloned
        );


        //-------------------------------------------

        // 30. equals()

        //-------------------------------------------

        System.out.println(
                "\ntable.equals(cloned): " +
                table.equals(cloned)
        );


        //-------------------------------------------

        // 31. hashCode()

        //-------------------------------------------

        System.out.println(
                "\ntable.hashCode(): " +
                table.hashCode()
        );


        //-------------------------------------------

        // 32. clear()

        //-------------------------------------------

        table.clear();

        System.out.println(
                "\nAfter clear(): " + table
        );


        //-------------------------------------------

        // 33. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\ntable.isEmpty(): " +
                table.isEmpty() + "\n"
        );


        //-------------------------------------------

        // 34. Null key/value test

        //-------------------------------------------

        System.out.println(
                "Hashtable does not allow null keys " +
                "or null values.\n"
        );

        // table.put(null, 100);   // NullPointerException
        // table.put("X", null);   // NullPointerException
    }
}


/*
//---------------------------------------------------
We have covered important Hashtable operations:


//---------------------------------------------------
HashMap
    → no guaranteed order
    → allows one null key and multiple null values

LinkedHashMap
    → insertion order

TreeMap
    → sorted by key

Hashtable
    → legacy synchronized Map
    → does NOT allow null keys or null values

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/


