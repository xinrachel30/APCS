// kleex -- Lindsay Phung and Xinqing Lin
// APCS pd7
// HW53 -- Poker Face / implementing insertion sort
// 2022-01-05
// time spent: 0.6 hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * 1. Partition list into sorted and unsorted regions
 * 2. "Walk" an element from unsorted region up to where it belongs in sorted region
 * 3. Increase size of sorted partition by 1
 * 4. Repeat 2,3 until sorted
 * The first element in the list occupies the sorted region. We then consider the partition (first element in the unsorted region).
 * If the partition is greater than the element to its immediate left in the sorted region, then it swaps positions with that element.
 * This continues in the sorted region until the number to the immediate left of the partition is less than the partition.
 * Once the partition is settled in its respective position, then the partition becomes part of the sorted region. We then move on to consider the next element in the unsorted region.
 * This repeats until the last element in the list is in its respective position and every element is sorted.
 *
 * DISCO
 * - We need a way of tracking the location of partition as it traverses the sorted region to find its appropriate location.
 *   We did this by making a new variable: partitionIndex.
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: data.size() - 1 passes are required to sort n elements.
 * q1: What do you know after pass p?
 * a1: After pass p, the first p elements have been sorted accordingly. They occupy the 'sorted region'.
 * q2: How will you know when sorted?
 * a2: When sorted, the ArrayList should be in ascending order.
 * q3: What constitues a pass?
 * a3: The program moves the first element in the unsorted region to its appropriate location in the sorted region.
 * q4: What must you track?
 * a4: The location of partition as it traverses through the sorted region.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for( int i = 0; i < data.size(); i++ ) {
      //partition marks first item in unsorted region
      Comparable partition = data.get(i);
      int partitionIndex = i;
      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i2 = i - 1; i2 > -1; i2-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i2).compareTo(partition) > 0 ) {
          Comparable temp = data.get(i2);
          data.set(i2, partition);
          data.set(partitionIndex, temp);
          System.out.println( "swap indices "+i2+" & "+partitionIndex+"..." ); //diag
          partitionIndex--;

        }
        else
          break;
      }
    }
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort


  public static void main( String [] args )
  {

      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/

      System.out.println( "*** Testing non-void version... *** " );
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = insertionSort( glen );
      System.out.println( "\nsorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = insertionSort( coco );
      System.out.println( "\nsorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class InsertionSort
