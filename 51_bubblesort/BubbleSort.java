// KLEEMEX -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS pd7
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent: 1.166 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Starting at index data.size() - 1, we compare each value with the one preceding it and put the pair in ascending order.
 * We iterate through until we reach the front of the ArrayList. This is one pass.
 * We repeat this process for data.size() - 1 passes.
 *
 * DISCO:
 * - In a situation where a for loop is inembeded in another for loop, they can't use the same variable in their initializations.
 * - Ctrl+F not "array list" but "ArrayList"
 *
 * QCC:
 * q0: If a pass requires no swaps, what do you know?
 * a0: The values at index i and at index i-1 are already sorted in ascending order.
 * q1: After pass p, what do you know?
 * a1: The first p values of the array are ordered.
 * q2: How many passes are necessary to completely sort?
 * a2: data.size() - 1 passes are necessary.
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
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
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for (int p = 0; p < data.size(); p++) {
      Comparable temp = 0;
      for(int i = (data.size()-1); i > 0; i--) {
        if(data.get(i).compareTo(data.get(i-1)) < 0) {
          temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
        }
      }
    }
  }

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> data = input;
    bubbleSortV(data);
    return data;
  }

  public static void main( String [] args )
  {
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco);
      /*===============for VOID methods=============
      ============================================*/

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen2 );
      ArrayList glen2Sorted = bubbleSort( glen2 );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glen2Sorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen2 );
      ArrayList coco2 = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco2 );
      ArrayList cocoSorted = bubbleSort( coco2 );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco2 );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
