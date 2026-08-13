import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Java_20260811_coll_PriorityQueue_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        PriorityQueue<Integer> queue =
                new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(50);
        queue.add(20);
        queue.add(40);

        System.out.println("\nInitial PriorityQueue: \n" + queue);


        //-------------------------------------------

        // 2. add(element)

        //-------------------------------------------

        queue.add(5);

        System.out.println("\nAfter add(5): \n" + queue);


        //-------------------------------------------

        // 3. offer(element)

        //-------------------------------------------

        queue.offer(60);

        System.out.println("\nAfter offer(60): \n" + queue);


        //-------------------------------------------

        // 4. peek()

        //-------------------------------------------

        System.out.println(
                "\nqueue.peek(): " +
                queue.peek()
        );


        //-------------------------------------------

        // 5. element()

        //-------------------------------------------

        System.out.println(
                "\nqueue.element(): " +
                queue.element()
        );


        //-------------------------------------------

        // 6. poll()

        //-------------------------------------------

        System.out.println(
                "\nqueue.poll(): " +
                queue.poll()
        );

        System.out.println(
                "\nAfter poll(): \n" + queue
        );


        //-------------------------------------------

        // 7. remove()

        //-------------------------------------------

        System.out.println(
                "\nqueue.remove(): " +
                queue.remove()
        );

        System.out.println(
                "\nAfter remove(): \n" + queue
        );


        //-------------------------------------------

        // 8. remove(Object)

        //-------------------------------------------

        queue.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(30): \n" + queue
        );


        //-------------------------------------------

        // 9. contains()

        //-------------------------------------------

        System.out.println(
                "\nqueue.contains(40): " +
                queue.contains(40)
        );


        //-------------------------------------------

        // 10. size()

        //-------------------------------------------

        System.out.println(
                "\nqueue.size(): " +
                queue.size()
        );


        //-------------------------------------------

        // 11. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nqueue.isEmpty(): " +
                queue.isEmpty()
        );


        //-------------------------------------------

        // 12. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 13. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 14. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        queue.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 15. toArray()

        //-------------------------------------------

        Object[] array = queue.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 16. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                queue.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 17. comparator()

        //-------------------------------------------

        System.out.println(
                "\nqueue.comparator(): " +
                queue.comparator()
        );


        //-------------------------------------------

        // 18. clear()

        //-------------------------------------------

        queue.clear();

        System.out.println(
                "\nAfter clear(): " + queue
        );


        //-------------------------------------------

        // 19. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nqueue.isEmpty(): " +
                queue.isEmpty()
        );


        //-------------------------------------------

        // 20. Custom Comparator - Max Heap

        //-------------------------------------------

        PriorityQueue<Integer> maxQueue =
                new PriorityQueue<>(Comparator.reverseOrder());

        maxQueue.add(30);
        maxQueue.add(10);
        maxQueue.add(50);
        maxQueue.add(20);
        maxQueue.add(40);

        System.out.println(
                "\nMax PriorityQueue: \n" + maxQueue
        );


        //-------------------------------------------

        // 21. poll() from Max PriorityQueue

        //-------------------------------------------

        System.out.print(
                "\nMax PriorityQueue poll order: \n"
        );

        while (!maxQueue.isEmpty()) {
            System.out.print(maxQueue.poll() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 22. Min PriorityQueue poll order

        //-------------------------------------------

        PriorityQueue<Integer> minQueue =
                new PriorityQueue<>();

        minQueue.add(30);
        minQueue.add(10);
        minQueue.add(50);
        minQueue.add(20);
        minQueue.add(40);

        System.out.print(
                "\nMin PriorityQueue poll order: \n"
        );

        while (!minQueue.isEmpty()) {
            System.out.print(minQueue.poll() + " ");
        }

        System.out.println("\n");
    }
}



/*
//---------------------------------------------------
We have covered important PriorityQueue operations:

add()
offer()
peek()
element()
poll()
remove()
contains()
size()
isEmpty()
iterator()
forEach()
toArray()
clear()

//---------------------------------------------------



//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


*/



