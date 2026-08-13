import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Java_20260811_coll_TreeSet_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        TreeSet<Integer> set =
                new TreeSet<>(
                        Arrays.asList(30, 10, 50, 20, 40)
                );

        System.out.println("\nInitial TreeSet: \n" + set);


        //-------------------------------------------

        // 2. add(element)

        //-------------------------------------------

        set.add(60);

        System.out.println("\nAfter add(60): \n" + set);


        //-------------------------------------------

        // 3. add(duplicate element)

        //-------------------------------------------

        boolean added = set.add(30);

        System.out.println(
                "\nAfter add(30): \n" + set
        );

        System.out.println(
                "Result of add(30): " + added
        );


        //-------------------------------------------

        // 4. remove(Object)

        //-------------------------------------------

        boolean removed =
                set.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(30): \n" + set
        );

        System.out.println(
                "Result of remove(30): " + removed
        );


        //-------------------------------------------

        // 5. contains()

        //-------------------------------------------

        System.out.println(
                "\nset.contains(40): " +
                set.contains(40)
        );


        //-------------------------------------------

        // 6. size()

        //-------------------------------------------

        System.out.println(
                "\nset.size(): " +
                set.size()
        );


        //-------------------------------------------

        // 7. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nset.isEmpty(): " +
                set.isEmpty()
        );


        //-------------------------------------------

        // 8. first()

        //-------------------------------------------

        System.out.println(
                "\nset.first(): " +
                set.first()
        );


        //-------------------------------------------

        // 9. last()

        //-------------------------------------------

        System.out.println(
                "\nset.last(): " +
                set.last()
        );


        //-------------------------------------------

        // 10. lower()

        //-------------------------------------------

        System.out.println(
                "\nset.lower(40): " +
                set.lower(40)
        );


        //-------------------------------------------

        // 11. floor()

        //-------------------------------------------

        System.out.println(
                "\nset.floor(40): " +
                set.floor(40)
        );


        //-------------------------------------------

        // 12. ceiling()

        //-------------------------------------------

        System.out.println(
                "\nset.ceiling(40): " +
                set.ceiling(40)
        );


        //-------------------------------------------

        // 13. higher()

        //-------------------------------------------

        System.out.println(
                "\nset.higher(40): " +
                set.higher(40)
        );


        //-------------------------------------------

        // 14. pollFirst()

        //-------------------------------------------

        System.out.println(
                "\nset.pollFirst(): " +
                set.pollFirst()
        );

        System.out.println(
                "\nAfter pollFirst(): \n" + set
        );


        //-------------------------------------------

        // 15. pollLast()

        //-------------------------------------------

        System.out.println(
                "\nset.pollLast(): " +
                set.pollLast()
        );

        System.out.println(
                "\nAfter pollLast(): \n" + set
        );


        //-------------------------------------------

        // 16. addAll()

        //-------------------------------------------

        TreeSet<Integer> set2 =
                new TreeSet<>(
                        Arrays.asList(70, 80, 90)
                );

        set.addAll(set2);

        System.out.println(
                "\nAfter addAll(set2): \n" + set
        );


        //-------------------------------------------

        // 17. containsAll()

        //-------------------------------------------

        System.out.println(
                "\nset.containsAll(set2): " +
                set.containsAll(set2)
        );


        //-------------------------------------------

        // 18. removeAll()

        //-------------------------------------------

        set.removeAll(set2);

        System.out.println(
                "\nAfter removeAll(set2): \n" + set
        );


        //-------------------------------------------

        // 19. retainAll()

        //-------------------------------------------

        TreeSet<Integer> keep =
                new TreeSet<>(
                        Arrays.asList(20, 40, 50)
                );

        set.retainAll(keep);

        System.out.println(
                "\nAfter retainAll(keep): \n" + set
        );


        //-------------------------------------------

        // 20. headSet()

        //-------------------------------------------

        TreeSet<Integer> numbers =
                new TreeSet<>(
                        Arrays.asList(10, 20, 30, 40, 50)
                );

        System.out.println(
                "\nnumbers.headSet(30): \n" +
                numbers.headSet(30)
        );


        //-------------------------------------------

        // 21. tailSet()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.tailSet(30): \n" +
                numbers.tailSet(30)
        );


        //-------------------------------------------

        // 22. subSet()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.subSet(20, 50): \n" +
                numbers.subSet(20, 50)
        );


        //-------------------------------------------

        // 23. descendingSet()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.descendingSet(): \n" +
                numbers.descendingSet()
        );


        //-------------------------------------------

        // 24. comparator()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.comparator(): " +
                numbers.comparator()
        );


        //-------------------------------------------

        // 25. iterator()

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 26. descendingIterator()

        //-------------------------------------------

        System.out.print("\nDescending Iterator: \n");

        Iterator<Integer> dit =
                numbers.descendingIterator();

        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 27. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : numbers) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 28. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        numbers.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 29. removeIf()

        //-------------------------------------------

        numbers.removeIf(value -> value > 30);

        System.out.println(
                "\nAfter removeIf(value > 30): \n" +
                numbers
        );


        //-------------------------------------------

        // 30. toArray()

        //-------------------------------------------

        Object[] array = numbers.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 31. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                numbers.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 32. equals()

        //-------------------------------------------

        TreeSet<Integer> set3 =
                new TreeSet<>(numbers);

        System.out.println(
                "\nnumbers.equals(set3): " +
                numbers.equals(set3)
        );


        //-------------------------------------------

        // 33. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.hashCode(): " +
                numbers.hashCode()
        );


        //-------------------------------------------

        // 34. clear()

        //-------------------------------------------

        numbers.clear();

        System.out.println(
                "\nAfter clear(): " + numbers
        );


        //-------------------------------------------

        // 35. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nnumbers.isEmpty(): " +
                numbers.isEmpty() + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important TreeSet operations:

add()
remove()
contains()
size()
isEmpty()
first()
last()
lower()
floor()
ceiling()
higher()
pollFirst()
pollLast()
headSet()
tailSet()
subSet()
descendingSet()
comparator()
addAll()
containsAll()
removeAll()
retainAll()
iterator()
descendingIterator()
forEach()
toArray()
removeIf()
clear()

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/



