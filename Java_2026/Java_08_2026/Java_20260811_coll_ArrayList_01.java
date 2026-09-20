import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Java_20260811_coll_ArrayList_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nInitial ArrayList: \n" + list);


        //-------------------------------------------

        // 2. add(element)

        //-------------------------------------------

        list.add(60);

        System.out.println("\nAfter add(60): \n" + list);


        //-------------------------------------------

        // 3. add(index, element)

        //-------------------------------------------

        list.add(2, 100);

        System.out.println("\nAfter add(2, 100): \n" + list);


        //-------------------------------------------

        // 4. get(index)

        //-------------------------------------------

        System.out.println("\nlist.get(2): " + list.get(2));


        //-------------------------------------------

        // 5. set(index, element)

        //-------------------------------------------

        list.set(2, 200);

        System.out.println("\nAfter set(2, 200): \n" + list);


        //-------------------------------------------

        // 6. size()

        //-------------------------------------------

        System.out.println("\nlist.size(): " + list.size());


        //-------------------------------------------

        // 7. isEmpty()

        //-------------------------------------------

        System.out.println("\nlist.isEmpty(): " + list.isEmpty());


        //-------------------------------------------

        // 8. contains(element)

        //-------------------------------------------

        System.out.println(
                "\nlist.contains(30): " + list.contains(30)
        );


        //-------------------------------------------

        // 9. indexOf(element)

        //-------------------------------------------

        System.out.println(
                "\nlist.indexOf(30): " + list.indexOf(30)
        );


        //-------------------------------------------

        // 10. lastIndexOf(element)

        //-------------------------------------------

        list.add(30);

        System.out.println(
                "\nlist.lastIndexOf(30): " +
                list.lastIndexOf(30)
        );


        //-------------------------------------------

        // 11. remove(index)

        //-------------------------------------------

        list.remove(2);

        System.out.println("\nAfter remove(2): \n" + list);


        //-------------------------------------------

        // 12. remove(Object)

        //-------------------------------------------

        list.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(Integer.valueOf(30)): \n" + list
        );


        //-------------------------------------------

        // 13. addAll()

        //-------------------------------------------

        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(70, 80, 90));

        list.addAll(list2);

        System.out.println("\nAfter addAll(): \n" + list);


        //-------------------------------------------

        // 14. addAll(index, collection)

        //-------------------------------------------

        ArrayList<Integer> list3 =
                new ArrayList<>(Arrays.asList(100, 110));

        list.addAll(2, list3);

        System.out.println(
                "\nAfter addAll(2, list3): \n" + list
        );


        //-------------------------------------------

        // 15. containsAll()

        //-------------------------------------------

        System.out.println(
                "\nlist.containsAll(list3): " +
                list.containsAll(list3)
        );


        //-------------------------------------------

        // 16. removeAll()

        //-------------------------------------------

        list.removeAll(list3);

        System.out.println(
                "\nAfter removeAll(list3): \n" + list
        );


        //-------------------------------------------

        // 17. retainAll()

        //-------------------------------------------

        ArrayList<Integer> keep =
                new ArrayList<>(Arrays.asList(20, 40, 60));

        list.retainAll(keep);

        System.out.println(
                "\nAfter retainAll(keep): \n" + list
        );


        //-------------------------------------------

        // 18. clear()

        //-------------------------------------------

        list.clear();

        System.out.println(
                "\nAfter clear(): " + list
        );


        //-------------------------------------------

        // 19. add() again

        //-------------------------------------------

        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("\nNew list: \n" + list);


        //-------------------------------------------

        // 20. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 21. ListIterator - forward

        //-------------------------------------------

        System.out.print("\nListIterator forward: \n");

        ListIterator<Integer> lit = list.listIterator();

        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 22. ListIterator - backward

        //-------------------------------------------

        System.out.print("\nListIterator backward: \n");

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 23. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : list) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 24. Normal for loop

        //-------------------------------------------

        System.out.print("\nNormal for loop: \n");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 25. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        list.forEach(value -> System.out.print(value + " "));

        System.out.println();


        //-------------------------------------------

        // 26. sort()

        //-------------------------------------------

        list.sort(Integer::compareTo);

        System.out.println(
                "\nAfter list.sort(): \n" + list
        );


        //-------------------------------------------

        // 27. Collections.sort()

        //-------------------------------------------

        Collections.sort(list);

        System.out.println(
                "\nAfter Collections.sort(): \n" + list
        );


        //-------------------------------------------

        // 28. reverse()

        //-------------------------------------------

        Collections.reverse(list);

        System.out.println(
                "\nAfter Collections.reverse(): \n" + list
        );


        //-------------------------------------------

        // 29. replaceAll()

        //-------------------------------------------

        list.replaceAll(value -> value * 2);

        System.out.println(
                "\nAfter replaceAll(value * 2): \n" + list
        );


        //-------------------------------------------

        // 30. removeIf()

        //-------------------------------------------

        list.removeIf(value -> value > 50);

        System.out.println(
                "\nAfter removeIf(value > 50): \n" + list
        );


        //-------------------------------------------

        // 31. subList()

        //-------------------------------------------

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(
                        10, 20, 30, 40, 50
                ));

        List<Integer> sub =
                numbers.subList(1, 4);

        System.out.println(
                "\nsubList(1, 4): \n" + sub
        );


        //-------------------------------------------

        // 32. toArray()

        //-------------------------------------------

        Object[] array = numbers.toArray();

        System.out.println(
                "\ntoArray(): \n" + Arrays.toString(array)
        );


        //-------------------------------------------

        // 33. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                numbers.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 34. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        ArrayList<Integer> cloned =
                (ArrayList<Integer>) numbers.clone();

        System.out.println(
                "\nclone(): \n" + cloned
        );


        //-------------------------------------------

        // 35. equals()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.equals(cloned): " +
                numbers.equals(cloned)
        );


        //-------------------------------------------

        // 36. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.hashCode(): " +
                numbers.hashCode()
        );


        //-------------------------------------------

        // 37. ensureCapacity()

        //-------------------------------------------

        numbers.ensureCapacity(100);

        System.out.println(
                "\nensureCapacity(100) executed"
        );


        //-------------------------------------------

        // 38. trimToSize()

        //-------------------------------------------

        numbers.trimToSize();

        System.out.println(
                "\ntrimToSize() executed"
        );


        //-------------------------------------------

        // 39. clear()

        //-------------------------------------------

        numbers.clear();

        System.out.println(
                "\nAfter clear(): " + numbers + "\n"
        );
    }
}



/*
//---------------------------------------------------


//---------------------------------------------------
Output:

Initial ArrayList:
[10, 20, 30, 40, 50]

After add(60):
[10, 20, 30, 40, 50, 60]

After add(2, 100):
[10, 20, 100, 30, 40, 50, 60]

list.get(2): 100

After set(2, 200):
[10, 20, 200, 30, 40, 50, 60]

list.size(): 7

list.isEmpty(): false

list.contains(30): true

list.indexOf(30): 3

list.lastIndexOf(30): 7

After remove(2):
[10, 20, 30, 40, 50, 60, 30]

After remove(Integer.valueOf(30)):
[10, 20, 40, 50, 60, 30]

After addAll():
[10, 20, 40, 50, 60, 30, 70, 80, 90]

After addAll(2, list3):
[10, 20, 100, 110, 40, 50, 60, 30, 70, 80, 90]

list.containsAll(list3): true

After removeAll(list3):
[10, 20, 40, 50, 60, 30, 70, 80, 90]

After retainAll(keep):
[20, 40, 60]

After clear(): []

New list:
[50, 20, 40, 10, 30]

Iterator:
50 20 40 10 30

ListIterator forward:
50 20 40 10 30

ListIterator backward:
30 10 40 20 50

Enhanced for loop:
50 20 40 10 30

Normal for loop:
50 20 40 10 30

forEach():
50 20 40 10 30

After list.sort():
[10, 20, 30, 40, 50]

After Collections.sort():
[10, 20, 30, 40, 50]

After Collections.reverse():
[50, 40, 30, 20, 10]

After replaceAll(value * 2):
[100, 80, 60, 40, 20]

After removeIf(value > 50):
[40, 20]

subList(1, 4):
[20, 30, 40]

toArray():
[10, 20, 30, 40, 50]

toArray(new Integer[0]):
[10, 20, 30, 40, 50]

clone():
[10, 20, 30, 40, 50]

numbers.equals(cloned): true

numbers.hashCode(): 38490301

ensureCapacity(100) executed

trimToSize() executed

After clear(): []


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/


