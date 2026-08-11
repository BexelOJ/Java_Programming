import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class java_20260811_coll_Queue_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        Queue<Integer> queue =
                new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nInitial Queue: \n" + queue);


        //-------------------------------------------

        // 2. add(element)

        //-------------------------------------------

        queue.add(60);

        System.out.println("\nAfter add(60): \n" + queue);


        //-------------------------------------------

        // 3. offer(element)

        //-------------------------------------------

        queue.offer(70);

        System.out.println("\nAfter offer(70): \n" + queue);


        //-------------------------------------------

        // 4. element()

        //-------------------------------------------

        System.out.println(
                "\nqueue.element(): " +
                queue.element()
        );


        //-------------------------------------------

        // 5. peek()

        //-------------------------------------------

        System.out.println(
                "\nqueue.peek(): " +
                queue.peek()
        );


        //-------------------------------------------

        // 6. remove()

        //-------------------------------------------

        System.out.println(
                "\nqueue.remove(): " +
                queue.remove()
        );

        System.out.println(
                "\nAfter remove(): \n" + queue
        );


        //-------------------------------------------

        // 7. poll()

        //-------------------------------------------

        System.out.println(
                "\nqueue.poll(): " +
                queue.poll()
        );

        System.out.println(
                "\nAfter poll(): \n" + queue
        );


        //-------------------------------------------

        // 8. contains()

        //-------------------------------------------

        System.out.println(
                "\nqueue.contains(30): " +
                queue.contains(30)
        );


        //-------------------------------------------

        // 9. size()

        //-------------------------------------------

        System.out.println(
                "\nqueue.size(): " +
                queue.size()
        );


        //-------------------------------------------

        // 10. isEmpty()

        //-------------------------------------------

        System.out.println(
                "\nqueue.isEmpty(): " +
                queue.isEmpty()
        );


        //-------------------------------------------

        // 11. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 12. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 13. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        queue.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 14. toArray()

        //-------------------------------------------

        Object[] array = queue.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 15. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                queue.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 16. remove(Object)

        //-------------------------------------------

        queue.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(Integer.valueOf(30)): \n" +
                queue
        );


        //-------------------------------------------

        // 17. clear()

        //-------------------------------------------

        queue.clear();

        System.out.println(
                "\nAfter clear(): " + queue
        );


        //-------------------------------------------

        // 18. isEmpty() after clear

        //-------------------------------------------

        System.out.println(
                "\nqueue.isEmpty(): " +
                queue.isEmpty() + "\n"
        );
    }
}



/*
//---------------------------------------------------
We have covered important Queue operations:

add()
offer()
remove()
poll()
element()
peek()
size()
isEmpty()
contains()
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


