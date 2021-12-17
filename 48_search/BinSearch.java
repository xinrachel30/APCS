/**
KLEEMEX -- Lindsay Phung, May Qiu, Xinqing Lin
APCS
HW48 -- Halving the Halves
2021-12-16
time spent: 1 hr

DISCO:
- Comparables cannot be compared with the boolean operators (<, >). You must
use the .compareTo() method.
- hi and lo are the index numbers, and not the actual values.

QCC:
- Why do you need to set tPos in binSearchRec?
- Even if homework is not posted on the website, announcements during class time
take precedence.

**/

public class BinSearch
{

  /**
     int binSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target Comparable
     pre:  input array is sorted in ascending order
     post: returns index of target, or returns -1 if target not found
  **/
  public static int binSearch ( Comparable[] a, Comparable target )
  {
    //uncomment exactly 1 of the 2 stmts below:

    return binSearchIter( a, target, 0, a.length-1 );
    //return binSearchRec( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( Comparable[] a,
                                  Comparable target,
                                  int lo, int hi )
  {

    int tPos = -1; //init return var to flag value -1

    int m = (lo + hi) / 2; //init mid pos var

    if (lo > hi) {
      return tPos;
    }

    if ( a[m].compareTo(target) == 0 ) {
      tPos = m; //return m;
    }
    if (a[m].compareTo(target) > 0) {
      tPos = binSearchRec(a, target, 0, m-1); //binSearchRec(a, target, lo, m - 1);
    }
    if (a[m].compareTo(target) < 0) {
      tPos = binSearchRec(a, target, m+1, hi); //binSearchRec(a, target, m + 1, hi);
    }

    return tPos;
  }//end binSearchRec


  public static int binSearchIter( Comparable[] a,
                                   Comparable target,
                                   int lo, int hi )
  {

    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    while (lo <= hi) {  // run until lo & hi cross //lo != hi

      m = (lo + hi) / 2;  //update mid pos var

      if(a[m].compareTo(target) == 0) { // target found
        return m;
      }
      if(a[m].compareTo(target) > 0) { // value at mid index higher than target
        hi = m - 1;
      }
      if(a[m].compareTo(target) < 0) { // value at mid index lower than target
        lo = m + 1;
      }
    }
    return tPos;
  }//end binSearchIter



  //tell whether an array is sorted in ascending order
  private static boolean isSorted( Comparable[] arr )
  {

    boolean retBoo = true; //init to true, assume array is sorted

    //Q: Why would a FOREACH loop not suffice here?
    //A: Because, in order to compare one value to the value after it, we need
    //the value's index. It'd be tricky to get indexes to work with FOREACH loops.

    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i].compareTo(arr[i+1]) > 0 ) ) {
        return false;
      }
    }
    return retBoo; //if entire array was traversed, it must be sorted
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void printArray( Comparable[] arr ) {
    String output = "[ ";

    for( Comparable c : arr )
	    output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }



  //main method for testing
  //minimal -- augment as necessary
  public static void main ( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    System.out.println("\nNow testing binSearch on Comparable array...");

    //Declare and initialize array of Comparables
    Comparable[] iArr = { 2, 4, 6, 8, 6, 42 };
    printArray( iArr );
    System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

    Comparable[] iArr2 = { 2, 4, 6, 8, 13, 42 };
    printArray( iArr2 );
    System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );

    Comparable[] iArr3 = new Integer[10000];
    for( int i = 0; i < iArr3.length; i++ ) {
    iArr3[i] = i * 2;
    }

    printArray( iArr3 );
    System.out.println( "iArr3 sorted? -- " + isSorted(iArr3) );

    //search for 6 in array
    System.out.println( "Searching for 2... " + binSearch(iArr2,2) );
    System.out.println( "Searching for 4... " + binSearch(iArr2,4) );
    System.out.println( "Searching for 6... " + binSearch(iArr2,6) );
    System.out.println( "Searching for 8... " + binSearch(iArr2,8) );
    System.out.println( "Searching for 13... " + binSearch(iArr2,13) );
    System.out.println( "Searching for 42... " + binSearch(iArr2,42) );


    //search for 43 in array
    System.out.println( binSearch(iArr2,43) );

    System.out.println( "now testing binSearch on iArr3..." );
    System.out.println( binSearch(iArr3,4) );
    System.out.println( binSearch(iArr3,8) );
    System.out.println( binSearch(iArr3,5) );

    //search for 43 in array
    System.out.println( binSearch(iArr3,43) );
    /*----------------------------------------------------
    ====================================================*/


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class BinSearch2
