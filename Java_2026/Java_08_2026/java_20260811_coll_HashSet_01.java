import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class java_20260811_coll_HashSet_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        HashSet<Integer> set =
                new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nInitial HashSet: \n" + set);


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

        // 8. addAll()

        //-------------------------------------------

        HashSet<Integer> set2 =
                new HashSet<>(Arrays.asList(70, 80, 90));

        set.addAll(set2);

        System.out.println(
                "\nAfter addAll(set2): \n" + set
        );


        //-------------------------------------------

        // 9. containsAll()

        //-------------------------------------------

        System.out.println(
                "\nset.containsAll(set2): " +
                set.containsAll(set2)
        );


        //-------------------------------------------

        // 10. removeAll()

        //-------------------------------------------

        set.removeAll(set2);

        System.out.println(
                "\nAfter removeAll(set2): \n" + set
        );


        //-------------------------------------------

        // 11. retainAll()

        //-------------------------------------------

        HashSet<Integer> keep =
                new HashSet<>(Arrays.asList(10, 40, 60));

        set.retainAll(keep);

        System.out.println(
                "\nAfter retainAll(keep): \n" + set
        );


        //-------------------------------------------

        // 12. iterator()

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 13. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : set) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 14. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        set.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 15. removeIf()

        //-------------------------------------------

        set.removeIf(value -> value > 40);

        System.out.println(
                "\nAfter removeIf(value > 40): \n" + set
        );


        //-------------------------------------------

        // 16. toArray()

        //-------------------------------------------

        Object[] array = set.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 17. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                set.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 18. equals()

        //-------------------------------------------

        HashSet<Integer> set3 =
                new HashSet<>(set);

        System.out.println(
                "\nset.equals(set3): " +
                set.equals(set3)
        );


        //-------------------------------------------

        // 19. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nset.hashCode(): " +
                set.hashCode()
        );


        //-------------------------------------------

        // 20. clear()

        //-------------------------------------------

        set.clear();

        System.out.println(
                "\nAfter clear(): " + set
        );


        //-------------------------------------------

        // 21. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nset.isEmpty(): " +
                set.isEmpty() + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important ArrayList operations:

add()
remove()
contains()
size()
isEmpty()
addAll()
containsAll()
removeAll()
retainAll()
clear()
iterator()
forEach()
toArray()
removeIf()
equals()
hashCode()

//---------------------------------------------------
And this time we'll specifically observe the key properties of a Set:

HashSet
   ↓
No duplicate elements
   ↓
No guaranteed insertion order
   ↓
Hash-based lookup

//---------------------------------------------------
One important difference from ArrayList:

HashSet
  ↓
No index
  ↓
No get(index)
  ↓
No set(index, value)
  ↓
No duplicate elements
  ↓
No guaranteed iteration order


//---------------------------------------------------



//---------------------------------------------------



//---------------------------------------------------




*/



