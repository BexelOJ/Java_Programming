import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Java_20260811_coll_LinkedList_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nInitial LinkedList: \n" + list);


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

        // 4. addFirst()

        //-------------------------------------------

        list.addFirst(5);

        System.out.println("\nAfter addFirst(5): \n" + list);


        //-------------------------------------------

        // 5. addLast()

        //-------------------------------------------

        list.addLast(70);

        System.out.println("\nAfter addLast(70): \n" + list);


        //-------------------------------------------

        // 6. get(index)

        //-------------------------------------------

        System.out.println("\nlist.get(2): " + list.get(2));


        //-------------------------------------------

        // 7. getFirst()

        //-------------------------------------------

        System.out.println("\nlist.getFirst(): " + list.getFirst());


        //-------------------------------------------

        // 8. getLast()

        //-------------------------------------------

        System.out.println("\nlist.getLast(): " + list.getLast());


        //-------------------------------------------

        // 9. set(index, element)

        //-------------------------------------------

        list.set(2, 200);

        System.out.println("\nAfter set(2, 200): \n" + list);


        //-------------------------------------------

        // 10. size()

        //-------------------------------------------

        System.out.println("\nlist.size(): " + list.size());


        //-------------------------------------------

        // 11. isEmpty()

        //-------------------------------------------

        System.out.println("\nlist.isEmpty(): " + list.isEmpty());


        //-------------------------------------------

        // 12. contains()

        //-------------------------------------------

        System.out.println(
                "\nlist.contains(30): " + list.contains(30)
        );


        //-------------------------------------------

        // 13. indexOf()

        //-------------------------------------------

        System.out.println(
                "\nlist.indexOf(30): " + list.indexOf(30)
        );


        //-------------------------------------------

        // 14. lastIndexOf()

        //-------------------------------------------

        list.add(30);

        System.out.println(
                "\nlist.lastIndexOf(30): " +
                list.lastIndexOf(30)
        );


        //-------------------------------------------

        // 15. remove(index)

        //-------------------------------------------

        list.remove(2);

        System.out.println("\nAfter remove(2): \n" + list);


        //-------------------------------------------

        // 16. remove(Object)

        //-------------------------------------------

        list.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(Integer.valueOf(30)): \n" + list
        );


        //-------------------------------------------

        // 17. removeFirst()

        //-------------------------------------------

        list.removeFirst();

        System.out.println("\nAfter removeFirst(): \n" + list);


        //-------------------------------------------

        // 18. removeLast()

        //-------------------------------------------

        list.removeLast();

        System.out.println("\nAfter removeLast(): \n" + list);


        //-------------------------------------------

        // 19. addAll()

        //-------------------------------------------

        LinkedList<Integer> list2 =
                new LinkedList<>(Arrays.asList(70, 80, 90));

        list.addAll(list2);

        System.out.println("\nAfter addAll(): \n" + list);


        //-------------------------------------------

        // 20. addAll(index, collection)

        //-------------------------------------------

        LinkedList<Integer> list3 =
                new LinkedList<>(Arrays.asList(100, 110));

        list.addAll(2, list3);

        System.out.println(
                "\nAfter addAll(2, list3): \n" + list
        );


        //-------------------------------------------

        // 21. containsAll()

        //-------------------------------------------

        System.out.println(
                "\nlist.containsAll(list3): " +
                list.containsAll(list3)
        );


        //-------------------------------------------

        // 22. removeAll()

        //-------------------------------------------

        list.removeAll(list3);

        System.out.println(
                "\nAfter removeAll(list3): \n" + list
        );


        //-------------------------------------------

        // 23. retainAll()

        //-------------------------------------------

        LinkedList<Integer> keep =
                new LinkedList<>(Arrays.asList(20, 40, 60));

        list.retainAll(keep);

        System.out.println(
                "\nAfter retainAll(keep): \n" + list
        );


        //-------------------------------------------

        // 24. clear()

        //-------------------------------------------

        list.clear();

        System.out.println(
                "\nAfter clear(): " + list
        );


        //-------------------------------------------

        // 25. Add elements again

        //-------------------------------------------

        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("\nNew list: \n" + list);


        //-------------------------------------------

        // 26. peek()

        //-------------------------------------------

        System.out.println("\nlist.peek(): " + list.peek());


        //-------------------------------------------

        // 27. peekFirst()

        //-------------------------------------------

        System.out.println(
                "\nlist.peekFirst(): " + list.peekFirst()
        );


        //-------------------------------------------

        // 28. peekLast()

        //-------------------------------------------

        System.out.println(
                "\nlist.peekLast(): " + list.peekLast()
        );


        //-------------------------------------------

        // 29. poll()

        //-------------------------------------------

        System.out.println(
                "\nlist.poll(): " + list.poll()
        );

        System.out.println("\nAfter poll(): \n" + list);


        //-------------------------------------------

        // 30. pollFirst()

        //-------------------------------------------

        System.out.println(
                "\nlist.pollFirst(): " + list.pollFirst()
        );

        System.out.println("\nAfter pollFirst(): \n" + list);


        //-------------------------------------------

        // 31. pollLast()

        //-------------------------------------------

        System.out.println(
                "\nlist.pollLast(): " + list.pollLast()
        );

        System.out.println("\nAfter pollLast(): \n" + list);


        //-------------------------------------------

        // 32. offer()

        //-------------------------------------------

        list.offer(100);

        System.out.println("\nAfter offer(100): \n" + list);


        //-------------------------------------------

        // 33. offerFirst()

        //-------------------------------------------

        list.offerFirst(5);

        System.out.println("\nAfter offerFirst(5): \n" + list);


        //-------------------------------------------

        // 34. offerLast()

        //-------------------------------------------

        list.offerLast(200);

        System.out.println("\nAfter offerLast(200): \n" + list);


        //-------------------------------------------

        // 35. push()

        //-------------------------------------------

        list.push(1);

        System.out.println("\nAfter push(1): \n" + list);


        //-------------------------------------------

        // 36. pop()

        //-------------------------------------------

        System.out.println("\nlist.pop(): " + list.pop());

        System.out.println("\nAfter pop(): \n" + list);


        //-------------------------------------------

        // 37. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 38. ListIterator - forward

        //-------------------------------------------

        System.out.print("\nListIterator forward: \n");

        ListIterator<Integer> lit = list.listIterator();

        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 39. ListIterator - backward

        //-------------------------------------------

        System.out.print("\nListIterator backward: \n");

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 40. Descending Iterator

        //-------------------------------------------

        System.out.print("\nDescending Iterator: \n");

        Iterator<Integer> dit = list.descendingIterator();

        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 41. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : list) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 42. Normal for loop

        //-------------------------------------------

        System.out.print("\nNormal for loop: \n");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 43. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        list.forEach(value -> System.out.print(value + " "));

        System.out.println();


        //-------------------------------------------

        // 44. sort()

        //-------------------------------------------

        list.sort(Integer::compareTo);

        System.out.println(
                "\nAfter list.sort(): \n" + list
        );


        //-------------------------------------------

        // 45. replaceAll()

        //-------------------------------------------

        list.replaceAll(value -> value * 2);

        System.out.println(
                "\nAfter replaceAll(value * 2): \n" + list
        );


        //-------------------------------------------

        // 46. removeIf()

        //-------------------------------------------

        list.removeIf(value -> value > 50);

        System.out.println(
                "\nAfter removeIf(value > 50): \n" + list
        );


        //-------------------------------------------

        // 47. subList()

        //-------------------------------------------

        LinkedList<Integer> numbers =
                new LinkedList<>(Arrays.asList(
                        10, 20, 30, 40, 50
                ));

        List<Integer> sub =
                numbers.subList(1, 4);

        System.out.println(
                "\nsubList(1, 4): \n" + sub
        );


        //-------------------------------------------

        // 48. toArray()

        //-------------------------------------------

        Object[] array = numbers.toArray();

        System.out.println(
                "\ntoArray(): \n" + Arrays.toString(array)
        );


        //-------------------------------------------

        // 49. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                numbers.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 50. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        LinkedList<Integer> cloned =
                (LinkedList<Integer>) numbers.clone();

        System.out.println(
                "\nclone(): \n" + cloned
        );


        //-------------------------------------------

        // 51. equals()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.equals(cloned): " +
                numbers.equals(cloned)
        );


        //-------------------------------------------

        // 52. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nnumbers.hashCode(): " +
                numbers.hashCode()
        );


        //-------------------------------------------

        // 53. clear()

        //-------------------------------------------

        numbers.clear();

        System.out.println(
                "\nAfter clear(): " + numbers + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important LinkedList operations:

add()
add(index, element)
addFirst()
addLast()
get()
getFirst()
getLast()
set()
remove()
removeFirst()
removeLast()
contains()
indexOf()
lastIndexOf()
size()
isEmpty()
addAll()
removeAll()
retainAll()
clear()
peek()
peekFirst()
peekLast()
poll()
pollFirst()
pollLast()
offer()
offerFirst()
offerLast()
push()
pop()
iterator()
descendingIterator()
listIterator()
forEach()
toArray()
subList()
sort()
removeIf()
replaceAll()
clone()
equals()
hashCode()
//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


*/


