/*
Duolingo -- Courtney Huang, Brianna Tieu, and Xinqing Lin
APCS
HW73 -- All About the About Face
2022-03-09
time spent: 1.3 hrs
*/

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): We did quickSelect on every 2nd index in the array
 *
 * 2a. Worst pivot choice and associated run time:
 *
 * 2b. Best pivot choice and associated run time:
 *
 * 3. Approach to handling duplicate values in array:
 *
 **/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  //  public static void qsort( int[] d )               OUR ORIGINAL CODE
  // {
  //   QuickSelect selector = new QuickSelect();
  //   //Partition partt = new Partition();
  //   for (int i = 1; i < d.length; i += 2) {
  //     selector.quickSelect(d, 0, d.length - 1, i);
  //   }
  // }

   public static void qsort( int[] d )                 // CODE FROM LIBRARY
   {
     qSortHelpr(d, 0, d.length-1);
   }


   /***
    * void qSortHelpr(int[], int, int)
    * @param arr -- array of ints to be sorted in place
    * @param loPos -- lower bound for partition range
    * @param hiPos -- upper bound for partition range
    ***/


   public static void qSortHelpr( int[] arr, int loPos, int hiPos ) {   // CODE FROM LIBRARY
     if ( loPos < hiPos ) {
       int pvtPos = partition(arr, loPos, hiPos);
       System.out.println("this is one");
       qSortHelpr(arr, loPos, pvtPos-1);
       qSortHelpr(arr, pvtPos+1, hiPos);
     }
   }

   public static int partition( int arr[], int loPos, int hiPos ) // CODE FROM LIBRARY
  {
    int pvtPos = loPos;

    int pvtVal = arr[pvtPos];

    swap( pvtPos, hiPos, arr);

    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= pvtVal ) {
        swap( i, s, arr );
        s++;
      }
    }
    swap(s, hiPos, arr);

    return s;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //get-it-up-and-running, static test case:
    int [] arr1 = {1, 2, 5, 4, 3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);


    // // randomly-generated arrays of n distinct vals
    // int[] arrN = new int[10];
    // for( int i = 0; i < arrN.length; i++ )
    // arrN[i] = i;
    // System.out.println("\narrN init'd to: " );
    // printArr(arrN);
    // shuffle(arrN);
    // System.out.println("arrN post-shuffle: " );
    // printArr(arrN);
    // qsort( arrN );
    // System.out.println("arrN after sort: " );
    // printArr(arrN);
    //   /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    //
    //
    //
    // //get-it-up-and-running, static test case w/ dupes:
    // int [] arr2 = {7,1,5,12,3,7};
    // System.out.println("\narr2 init'd to: " );
    // printArr(arr2);
    // qsort( arr2 );
    // System.out.println("arr2 after qsort: " );
    // printArr(arr2);
    //
    // // arrays of randomly generated ints
    // int[] arrMatey = new int[20];
    // for( int i = 0; i < arrMatey.length; i++ )
    // arrMatey[i] = (int)( 48 * Math.random() );
    // System.out.println("\narrMatey init'd to: " );
    // printArr(arrMatey);
    // shuffle(arrMatey);
    // System.out.println("arrMatey post-shuffle: " );
    // printArr(arrMatey);
    // qsort( arrMatey );
    // System.out.println("arrMatey after sort: " );
    // printArr(arrMatey);
/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
