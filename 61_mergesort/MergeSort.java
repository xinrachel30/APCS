//CoffeeBeans: Melody Lew and Xinqing Lin
//apcs pd06
//HW61 -- Instructions so Simple...
//2022-02-09w
//time spent: 2.0 hrs

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  merge()
  0. Make a new array
  1. Compare the first elements of each input array
  2. Add the smallest of the elements to the new array
  3. Cross out the element removed from the original array
  4. Repeat 1-3 until one of the arrays are empty
  5. Add the remaining elements of the non-empty array to the array made in Step 0

  sort()
  0. If the array length is greater than 1, split the array into two halves
  1. Keep splitting until the array length is 1. This means that the array is sorted
  2. Merge the sorted arrays

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] sorted = new int[a.length+b.length];
    int ai = 0; //index of a
    int bi = 0; //index of b
    int i = 0; //index of sorted
    while(ai < a.length && bi < b.length){
      if (a[ai] > b[bi]){
        sorted[i] = b[bi];
        bi += 1;
      }
      else if (a[ai] < b[bi]){
        sorted[i] = a[ai];
        ai += 1;
      }
      else{
        sorted[i] = a[ai]; //only add one of the same values because the other same value will be added the next iteration
        ai += 1;
      } i++;
    }
    while (ai < a.length){
      sorted[i] = a[ai];
      i ++;
      ai++;
    }
    while (bi < b.length){
      sorted[i] = b[bi];
      i ++;
      bi++;
    } return sorted;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    // //base case
    // if (arr.length == 1){
    //   return arr;
    // }
    if (arr.length>1){
      int[] fristHalf = new int[arr.length / 2];
      int[] scndHalf = new int[(arr.length + 1) / 2];
      for (int i = 0; i < fristHalf.length; i++){
        fristHalf[i] = arr[i];
      }
      for (int i = fristHalf.length; i < arr.length; i++){
        scndHalf[i-fristHalf.length] = arr[i];
      }
      return merge(sort(fristHalf), sort(scndHalf));
    }
    else {
      return arr;
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
//   //---------------------------------------------------
//
//
  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) ); //ARRAY 6 IS NOT SORTED SO OUR CODE "BREAKS"

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
