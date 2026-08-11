import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class java_20260811_coll_Stack_01 {

    public static void main(String[] args) {

        //-------------------------------------------

        // 1. Declaration and initialization

        //-------------------------------------------

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nInitial Stack: \n" + stack);


        //-------------------------------------------

        // 2. push()

        //-------------------------------------------

        stack.push(60);

        System.out.println("\nAfter push(60): \n" + stack);


        //-------------------------------------------

        // 3. peek()

        //-------------------------------------------

        System.out.println(
                "\nstack.peek(): " +
                stack.peek()
        );


        //-------------------------------------------

        // 4. pop()

        //-------------------------------------------

        System.out.println(
                "\nstack.pop(): " +
                stack.pop()
        );

        System.out.println(
                "\nAfter pop(): \n" + stack
        );


        //-------------------------------------------

        // 5. empty()

        //-------------------------------------------

        System.out.println(
                "\nstack.empty(): " +
                stack.empty()
        );


        //-------------------------------------------

        // 6. size()

        //-------------------------------------------

        System.out.println(
                "\nstack.size(): " +
                stack.size()
        );


        //-------------------------------------------

        // 7. search()

        //-------------------------------------------

        System.out.println(
                "\nstack.search(30): " +
                stack.search(30)
        );


        //-------------------------------------------

        // 8. add(element)

        //-------------------------------------------

        stack.add(70);

        System.out.println(
                "\nAfter add(70): \n" + stack
        );


        //-------------------------------------------

        // 9. add(index, element)

        //-------------------------------------------

        stack.add(2, 100);

        System.out.println(
                "\nAfter add(2, 100): \n" + stack
        );


        //-------------------------------------------

        // 10. addElement()

        //-------------------------------------------

        stack.addElement(80);

        System.out.println(
                "\nAfter addElement(80): \n" + stack
        );


        //-------------------------------------------

        // 11. get(index)

        //-------------------------------------------

        System.out.println(
                "\nstack.get(2): " +
                stack.get(2)
        );


        //-------------------------------------------

        // 12. set(index, element)

        //-------------------------------------------

        stack.set(2, 200);

        System.out.println(
                "\nAfter set(2, 200): \n" + stack
        );


        //-------------------------------------------

        // 13. contains()

        //-------------------------------------------

        System.out.println(
                "\nstack.contains(30): " +
                stack.contains(30)
        );


        //-------------------------------------------

        // 14. indexOf()

        //-------------------------------------------

        System.out.println(
                "\nstack.indexOf(30): " +
                stack.indexOf(30)
        );


        //-------------------------------------------

        // 15. lastIndexOf()

        //-------------------------------------------

        stack.add(30);

        System.out.println(
                "\nstack.lastIndexOf(30): " +
                stack.lastIndexOf(30)
        );


        //-------------------------------------------

        // 16. remove(index)

        //-------------------------------------------

        stack.remove(2);

        System.out.println(
                "\nAfter remove(2): \n" + stack
        );


        //-------------------------------------------

        // 17. remove(Object)

        //-------------------------------------------

        stack.remove(Integer.valueOf(30));

        System.out.println(
                "\nAfter remove(Integer.valueOf(30)): \n" +
                stack
        );


        //-------------------------------------------

        // 18. removeElement()

        //-------------------------------------------

        stack.removeElement(Integer.valueOf(40));

        System.out.println(
                "\nAfter removeElement(40): \n" +
                stack
        );


        //-------------------------------------------

        // 19. removeElementAt()

        //-------------------------------------------

        stack.removeElementAt(1);

        System.out.println(
                "\nAfter removeElementAt(1): \n" +
                stack
        );


        //-------------------------------------------

        // 20. firstElement()

        //-------------------------------------------

        System.out.println(
                "\nstack.firstElement(): " +
                stack.firstElement()
        );


        //-------------------------------------------

        // 21. lastElement()

        //-------------------------------------------

        System.out.println(
                "\nstack.lastElement(): " +
                stack.lastElement()
        );


        //-------------------------------------------

        // 22. elementAt()

        //-------------------------------------------

        System.out.println(
                "\nstack.elementAt(1): " +
                stack.elementAt(1)
        );


        //-------------------------------------------

        // 23. Iterator

        //-------------------------------------------

        System.out.print("\nIterator: \n");

        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 24. ListIterator - forward

        //-------------------------------------------

        System.out.print("\nListIterator forward: \n");

        ListIterator<Integer> lit =
                stack.listIterator();

        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 25. ListIterator - backward

        //-------------------------------------------

        System.out.print("\nListIterator backward: \n");

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 26. Enhanced for loop

        //-------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : stack) {
            System.out.print(value + " ");
        }

        System.out.println();


        //-------------------------------------------

        // 27. forEach()

        //-------------------------------------------

        System.out.print("\nforEach(): \n");

        stack.forEach(value ->
                System.out.print(value + " ")
        );

        System.out.println();


        //-------------------------------------------

        // 28. toArray()

        //-------------------------------------------

        Object[] array = stack.toArray();

        System.out.println(
                "\ntoArray(): \n" +
                Arrays.toString(array)
        );


        //-------------------------------------------

        // 29. toArray(T[])

        //-------------------------------------------

        Integer[] integerArray =
                stack.toArray(new Integer[0]);

        System.out.println(
                "\ntoArray(new Integer[0]): \n" +
                Arrays.toString(integerArray)
        );


        //-------------------------------------------

        // 30. clone()

        //-------------------------------------------

        @SuppressWarnings("unchecked")
        Stack<Integer> cloned =
                (Stack<Integer>) stack.clone();

        System.out.println(
                "\nclone(): \n" + cloned
        );


        //-------------------------------------------

        // 31. equals()

        //-------------------------------------------

        System.out.println(
                "\nstack.equals(cloned): " +
                stack.equals(cloned)
        );


        //-------------------------------------------

        // 32. hashCode()

        //-------------------------------------------

        System.out.println(
                "\nstack.hashCode(): " +
                stack.hashCode()
        );


        //-------------------------------------------

        // 33. clear()

        //-------------------------------------------

        stack.clear();

        System.out.println(
                "\nAfter clear(): " + stack
        );


        //-------------------------------------------

        // 34. empty() after clear

        //-------------------------------------------

        System.out.println(
                "\nstack.empty(): " +
                stack.empty() + "\n"
        );
    }
}


/*
//---------------------------------------------------
We have covered important Stack operations:

push()
pop()
peek()
empty()
size()
search()
add()
addElement()
get()
set()
remove()
contains()
indexOf()
lastIndexOf()
iterator()
listIterator()
forEach()
toArray()
clear()
clone()
equals()
hashCode()

//---------------------------------------------------
One important thing to remember from this exercise:

Stack
  |
  +-- push()  → add at top
  +-- pop()   → remove from top
  +-- peek()  → view top
  +-- search()→ search from top

//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------



*/



