/*
kleex -- Lindsay Phung and Xinqing Lin
APCS
HW54 -- One File to Bring Them All... / class file with BubbleSort, SelectionSort, and InsertionSort such that each has an ArrayList parameter and a void return type
2022-01-11
*/

import java.util.ArrayList;

public class MySorts {


/*
Algo: Every pass, the program compares each element with the one to its right and
swaps the two if necessary. The program does n - 1 passes.
*/
  public static void bubbleSort( ArrayList<Comparable> data )
  {
    // int pass_counter = 0;
    // int swap_counter = 0;
    // int compare_counter = 0;
    for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
      // pass_counter ++;
      //System.out.println( "commencing pass #" + passCtr + "..." );
      //iterate thru first to next-to-last element, comparing to next
      for( int i = 0; i < data.size()-1; i++ ) {
        // compare_counter ++;
        //if element at i > element at i+1, swap
        if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
          data.set( i, data.set(i+1,data.get(i)) );
          // swap_counter ++;
        }
        //System.out.println(data); //diag: show current state of list
      }
    }
    // return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;
  }

/*
Algo: Every pass, the program finds the index of the element with the greatest value
in the unsorted region and swaps it with the element at the leftmost position in the
sorted region. It conducts n - 1 passes.
*/
  public static void selectionSort( ArrayList<Comparable> data )
  {
  //note: this version places greatest value at rightmost end,

  //maxPos will point to position of SELECTION (greatest value)
  int maxPos;
  // int pass_counter = 0;
  // int swap_counter = 0;
  // int compare_counter = 0;

  for( int pass = data.size()-1; pass > 0; pass-- ) {
    // pass_counter ++;
    //System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
    maxPos = 0;
    for( int i = 1; i <= pass; i++ ) {
      // compare_counter ++;
      //System.out.println( "maxPos: " + maxPos );//diag
      //System.out.println( data );//diag
      if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
        maxPos = i;
    }
    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
    // swap_counter++;
    //System.out.println( "after swap: " +  data );//diag
    }
    // return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;
  }//end selectionSort

/*
Algo: Every pass, the program "walks" the partition, the first element in the unsorted region,
to its appropriate place in the sorted region by repeatedly comparing it to each value to its left.
It conducts n - 1 passes.
*/
  public static void insertionSort( ArrayList<Comparable> data )
  {
    // int pass_counter = 0;
    // int swap_counter = 0;
    // int compare_counter = 0;

    for( int partition = 1; partition < data.size(); partition++ ) {
      // pass_counter ++;
      //partition marks first item in unsorted region
      //diag:
      //System.out.println( "\npartition: " + partition + "\tdataset:");
      //System.out.println( data );
      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {
        // compare_counter ++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
          //diag:
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
          data.set( i, data.set( i-1, data.get(i) ) );
          // swap_counter++;
        }
        else
        break;
      }
    }
    // return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;
  }//end insertionSortV

}

