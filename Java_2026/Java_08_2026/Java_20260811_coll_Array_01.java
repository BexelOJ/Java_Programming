public class Java_20260811_coll_Array_01 {

    public static void main(String[] args) {

        // ------------------------------------------
        // 1. Declaration and initialization
        // ------------------------------------------

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("\nInitial array:");

        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();


        // ------------------------------------------
        // 2. Access using index
        // ------------------------------------------

        System.out.println("\narr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[4] : " + arr[4]);


        // ------------------------------------------
        // 3. Modify using index
        // ------------------------------------------

        arr[2] = 100;

        System.out.println("\nAfter arr[2] = 100:\n");
        
        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();


        // ------------------------------------------
        // 4. length
        // ------------------------------------------

        System.out.println("\narr.length : " + arr.length);


        // ------------------------------------------
        // 5. First element
        // ------------------------------------------

        System.out.println("First element : " + arr[0]);


        // ------------------------------------------
        // 6. Last element
        // ------------------------------------------

        System.out.println(
            "Last element : " + arr[arr.length - 1]
        );


        // ------------------------------------------
        // 7. Normal for loop
        // ------------------------------------------

        System.out.print("\nNormal for loop: \n");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();


        // ------------------------------------------
        // 8. Enhanced for loop
        // ------------------------------------------

        System.out.print("\nEnhanced for loop: \n");

        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();


        // ------------------------------------------
        // 9. Modify using normal for loop
        // ------------------------------------------

        for (int i = 0; i < arr.length; i++)
            arr[i] *= 2;

        System.out.print("\nAfter multiplying by 2:\n");

        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();


        // ------------------------------------------
        // 10. Arrays.toString()
        // ------------------------------------------

        System.out.println(
            "\nArrays.toString(): \n" +
            java.util.Arrays.toString(arr)
        );


        // ------------------------------------------
        // 11. Arrays.sort()
        // ------------------------------------------

        arr[0] = 50;
        arr[1] = 10;
        arr[2] = 40;
        arr[3] = 20;
        arr[4] = 30;

        java.util.Arrays.sort(arr);

        System.out.println(
            "\nAfter Arrays.sort(): \n" +
            java.util.Arrays.toString(arr)
        );


        // ------------------------------------------
        // 12. Arrays.binarySearch()
        // ------------------------------------------

        int index = java.util.Arrays.binarySearch(arr, 30);

        System.out.println(
            "\nbinarySearch(30): \n" + index
        );


        // ------------------------------------------
        // 13. Arrays.fill()
        // ------------------------------------------

        java.util.Arrays.fill(arr, 100);

        System.out.println(
            "\nAfter Arrays.fill(100): \n" +
            java.util.Arrays.toString(arr)
        );


        // ------------------------------------------
        // 14. Arrays.copyOf()
        // ------------------------------------------

        int[] arr2 = java.util.Arrays.copyOf(arr, arr.length);

        System.out.println(
            "\narr2 after copyOf(): \n" +
            java.util.Arrays.toString(arr2)
        );


        // ------------------------------------------
        // 15. Arrays.equals()
        // ------------------------------------------

        System.out.println(
            "\nArrays.equals(arr, arr2): \n" +
            java.util.Arrays.equals(arr, arr2)
        );


        // ------------------------------------------
        // 16. Create array using new
        // ------------------------------------------

        int[] arr3 = new int[5];

        System.out.println(
            "\narr3.length: " + arr3.length
        );


        // ------------------------------------------
        // 17. Default values
        // ------------------------------------------

        System.out.println(
            "\nDefault arr3: \n" +
            java.util.Arrays.toString(arr3)
        );


        // ------------------------------------------
        // 18. Clone
        // ------------------------------------------

        int[] arr4 = arr.clone();

        System.out.println(
            "\narr4 after clone(): \n" +
            java.util.Arrays.toString(arr4)
        );


        // ------------------------------------------
        // 19. Array comparison
        // ------------------------------------------

        System.out.println(
            "arr.equals(arr2): " +
            arr.equals(arr2)
        );

        System.out.println(
            "\nArrays.equals(arr, arr2): \n" +
            java.util.Arrays.equals(arr, arr2) + 
            "\n"
        );
    }
}



/*
//---------------------------------------------------



//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------


//---------------------------------------------------

*/


