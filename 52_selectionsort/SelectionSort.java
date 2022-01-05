// kleex -- Lindsay Phung and Xinqing Lin
// APCS pd7
// HW52 -- Selection, Natch / implementing selection sort
// 2022-01-04
// time spent:  hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 *
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0:
 * q1: What do you know after pass p?
 * a1:
 * q2: How do you know if sorted?
 * a2:
 * q3: What does a pass boil down to?
 * a3:
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
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
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int pass = 0;

    for( int i = data.size()-1; i > 0; i-- ) {
      pass = i;
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;

      for( int j = 0; j < i + 1; j++ ) {
        if (data.get(j).compareTo(data.get(maxPos)) > 0) {
          maxPos = j;
        }
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      }

      Comparable temp = data.get(i);
      data.set(i, data.get(maxPos));
      data.set(maxPos, temp);
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/

      System.out.println("=========================================================");

      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen2 );
      ArrayList glen2Sorted = selectionSort( glen2 );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glen2Sorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen2 );

      ArrayList coco2 = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco2 );
      ArrayList coco2Sorted = selectionSort( coco2 );
      System.out.println( "sorted version of ArrayList coco:\n"
      + coco2Sorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco2 );
      System.out.println( coco2 );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
