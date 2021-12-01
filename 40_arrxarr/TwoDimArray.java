/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS pd7
// HW40 -- Demand A Raise / 2D arrays
// 2021-11-30
// time spent: 0.5 hrs
//
// DISCO
// - We can use helper functions to simplify sum2.
//
// QCC
// - For loops are helpful for when you need to reference the index.
// - What are the benefits to using helper functions? Perhaps they make the code more readable?

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
        System.out.print("[");
        for (int i2 = 0; i2 < a[i].length - 1; i2++) {
            System.out.print(a[i][i2] + ",");
        }
        System.out.print(a[i][a[i].length - 1]);
        System.out.print("]");
        System.out.println();
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] arr : a) {
        System.out.print("[");
        for (int value : arr) {
            System.out.print(value + ",");
        }
        System.out.print("]");
        System.out.println();
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int summer = 0;
    for (int[] arr : a) {
      for (int value : arr) {
        summer += value;
      }
    }
    return summer;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int summer = 0;
    for (int i = 0; i < m.length; i++) {
      summer += sumRow(i, m);
    }
    return summer;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int summer = 0;
    for (int i = 0; i < a[r].length; i++) {
      summer += a[r][i];
    }
    return summer;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for (int value : m[r]) {
      summer += value;
    }
    return summer;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
      // your own custom test cases welcomed and encouraged
      int [][] m4 = { {-3, -10, 5}, {4, -9, 5} };
      int [][] m5 = { {0, 0}, {0, 0, 0}, {0, 0, 0, 0} };
      System.out.print("custom test cases...\n");
      System.out.print("testing sum1...\n");
      System.out.println("sum m4 : " + sum1(m4));
      System.out.println("sum m5 : " + sum1(m5));
      System.out.print("testing sum2...\n");
      System.out.println("sum m4 : " + sum2(m4));
      System.out.println("sum m5 : " + sum2(m5));
  }

}//end class TwoDimArray