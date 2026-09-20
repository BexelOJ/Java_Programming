import java.util.Arrays;

public class java_20260912_array_01{
	 public static void main(String[] args){
		  int a = 10;
		  System.out.println("valus of a : " + a);

		  int[] arr_i = {10, 20, 30, 40, 50};
		  char[] arr_c = {'A','B','C','D','E'};
		  String[] name = {"India","is","Country"};

		  System.out.println(arr_i[0]);
 		  System.out.println(arr_c[1]);
		  System.out.println(name[2]);
	 
		  System.out.println(args[0]);


		  for(int i = 0; i < arr_i.length; i++){
				System.out.print(arr_i[i] + " ");
		  }
		  System.out.println();


		  for(int value : arr_i){
				System.out.print(value + " ");
		  }
 		  System.out.println();


	     System.out.println("\nArrays.toString(): \n" + java.util.Arrays.toString(arr_i));

		  System.out.println(Arrays.binarySearch(arr_i, 30));

		  Arrays.fill(arr_i, 100);

        System.out.println(
            "\nAfter Arrays.fill(100): \n" +
            Arrays.toString(arr_i)
        );

        int[] arr2 = java.util.Arrays.copyOf(arr_i, arr_i.length);
		  System.out.println(Arrays.toString(arr2));

		  System.out.println(Arrays.equals(arr_i, arr2));

		  char b = '\u0041';
		  System.out.println(a);


	 }
}





