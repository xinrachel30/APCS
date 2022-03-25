/***
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW81 -- Thank You, Next
2022-03-24
time spent: 0.3 hrs
 **/

/***
    DISCO
    * it.remove() removes the element it is currently on
    * "returns a List" means to create a new List. This is different from directly modifying the input List.

    QCC
    * Does iterator do a better job than a foreach loop? In what situations would iterator be better?

    SUMMARY THE FIRST: (foreach)
    * For foundA, a for each loop was used to iterate through each element in List L and returned true
      if it was the key (othewise returned false).
    * For oddsA, the for each loop iterated through each element and added it to list ret if it was odd.

    SUMMARY THE SECOND: (iterator)
    * For foundB, it iterates through and returns true if it finds the key. Otherwise, it returns false.
    * For oddsB, we created a ret ArrayList. We iterated through and added any odd numbers to the
      ret ArrayList. At the end, we returned it.
    * For removeEvens, we iterated through and removed anything directly from L by using it.remove() that was
      even.

**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (Integer element : L) {
      if (element == key) {
        return true;
      }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      if (it.next() == key) {
        return true;
      }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();

    for (Integer element : L) {
      if (element % 2 == 1) {
        ret.add(element);
      }
    }
    return ret;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()) {
      Integer val = (Integer)it.next();
      if (val % 2 == 1) {
        ret.add(val);
      }
    }
    return ret;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      if ((Integer)it.next() % 2 == 0) {
        it.remove();
      }
    }
  }


  public static void main( String [] args )
  {

    //var type: List   obj type: ArrayList
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    for(Integer element : L){
      System.out.println(element);
    }

    // b) explicitly using an iterator
    Iterator it = L.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }


    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
