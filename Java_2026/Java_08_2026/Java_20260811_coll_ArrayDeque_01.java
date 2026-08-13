import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class Java_20260811_coll_ArrayDeque_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        ArrayDeque<Integer> deque =
                new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nInitial ArrayDeque: \n" + deque);


        //-------------------------------------------

        // 2. add(element)

        //-------------------------------------------

        deque.add(60);

        System.out.println("\nAfter add(60): \n" + deque);


        //-------------------------------------------

        // 3. addFirst()

        //-------------------------------------------

        deque.addFirst(5);

        System.out.println("\nAfter addFirst(5): \n" + deque);


        //-------------------------------------------

        // 4. addLast()

        //-------------------------------------------

        deque.addLast(70);

        System.out.println("\nAfter addLast(70): \n" + deque);


        //-------------------------------------------

        // 5. getFirst()

        //-------------------------------------------

        System.out.println(
                "\ndeque.getFirst(): " +
                deque.getFirst()
        );


        //-------------------------------------------

        // 6. getLast()

        //-------------------------------------------

        System.out.println(
                "\ndeque.getLast(): " +
                deque.getLast()
        );


        //-------------------------------------------

        // 7. element()

        //-------------------------------------------

        System.out.println(
                "\ndeque.element(): " +
                deque.element()
        );


        //-------------------------------------------

        // 8. remove()

        //-------------------------------------------

        System.out.println(
                "\ndeque.remove(): " +
                deque.remove()
        );

        System.out.println(
                "\nAfter remove(): \n" + deque
        );


        //-------------------------------------------

        // 9. removeFirst()

        //-------------------------------------------

        System.out.println(
                "\ndeque.removeFirst(): " +
                deque.removeFirst()
        );

        System.out.println(
                "\nAfter removeFirst(): \n" + deque
        );


        //-------------------------------------------

        // 10. removeLast()

        //-------------------------------------------

        System.out.println(
                "\ndeque.removeLast(): " +
                deque.removeLast()
        );

        System.out.println(
                "\nAfter removeLast(): \n" + deque
        );


        //-------------------------------------------

        // 11. offer()

        //-------------------------------------------

        deque.offer(100);

        System.out.println(
                "\nAfter offer(100): \n" + deque
        );


        //-------------------------------------------

        // 12. offerFirst()

        //-------------------------------------------

        deque.offerFirst(1);

        System.out.println(
                "\nAfter offerFirst(1): \n" + deque
        );


        //-------------------------------------------

        // 13. offerLast()

        //-------------------------------------------

        deque.offerLast(200);

        System.out.println(
                "\nAfter offerLast(200): \n" + deque
        );


        //-------------------------------------------

        // 14. peek()

        //-------------------------------------------

        System.out.println(
                "\ndeque.peek(): " +
                deque.peek()
        );


        //-------------------------------------------

        // 15. peekFirst()

        //-------------------------------------------

        System.out.println(
                "\ndeque.peekFirst(): " +
                deque.peekFirst()
        );


        //-------------------------------------------

        // 16. peekLast()

        //-------------------------------------------

        System.out.println(
                "\ndeque.peekLast(): " +
                deque.peekLast()
        );


        //-------------------------------------------

        // 17. poll()

        //-------------------------------------------

        System.out.println(
                "\ndeque.poll(): " +
                deque.poll()
        );

        System.out.println(
                "\nAfter poll(): \n" + deque
        );


        //-------------------------------------------

        // 18. pollFirst()

        //-------------------------------------------

        System.out.println(
                "\ndeque.pollFirst(): " +
                deque.pollFirst()
        );

        System.out.println(
                "\nAfter pollFirst(): \n" + deque
        );


        //-------------------------------------------

        // 19. pollLast()

        //-------------------------------------------

        System.out.println(
                "\ndeque.pollLast(): " +
                deque.pollLast()
        );

        System.out.println(
                "\nAfter pollLast(): \n" + deque
        );


        //-------------------------------------------

        // 20. push()

        //-------------------------------------------

        deque.push(10);

        System.out.println(
                "\nAfter push(10): \n" + deque
        );


        //-------------------------------------------

        // 21. pop()

        //-------------------------------------------

        System.out.println(
                "\ndeque.pop(): " +
                deque.pop()
        );

        System.out.println(
                "\nAfter pop(): \n" + deque
        );


        //-------------------------------------------

        // 22. contains()

        //-------------------------------------------

        System.out.println(
                "\ndeque.contains(30): " +
                deque.contains(30)
        );


        //-------------------------------------------

        // 23. size()

        //-------------------------------------------

        System.out.println(
                "\ndeque.size(): " +
                deque.size()
        );


        //-------------------------------------------

        // 24. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\ndeque.isEmpty(): " +
                deque.isEmpty()
        );


        //-------------------------------------------

        // 25. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = deque.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 26. Descending Iterator

        //-------------------------------------------

        System.out.print("\nDescending Iterator: \n");

        Iterator<Integer> dit =
                deque.descendingIterator();

        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 27. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : deque) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 28. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        deque.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 29. toArray()

        //-------------------------------------------

        Object[] array = deque.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 30. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                deque.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 31. clear()

        //-------------------------------------------

        deque.clear();

        System.out.println(
                "\nAfter clear(): " + deque
        );


        //-------------------------------------------

        // 32. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\ndeque.isEmpty(): " +
                deque.isEmpty() + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important ArrayDeque operations:

add()
addFirst()
addLast()
getFirst()
getLast()
remove()
removeFirst()
removeLast()
offer()
offerFirst()
offerLast()
peek()
peekFirst()
peekLast()
poll()
pollFirst()
pollLast()
push()
pop()
contains()
size()
isEmpty()
clear()
iterator()
descendingIterator()
forEach()
toArray()

//---------------------------------------------------
One useful observation from this program:

ArrayDeque
    |
    +-- Queue operations
    |     add()
    |     offer()
    |     remove()
    |     poll()
    |     peek()
    |
    +-- Deque operations
    |     addFirst()
    |     addLast()
    |     removeFirst()
    |     removeLast()
    |     peekFirst()
    |     peekLast()
    |
    +-- Stack operations
          push()
          pop()

So ArrayDeque is particularly useful because one class supports queue, deque, and stack behavior

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/






