/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW76 -- We Got a Little Ol' Convoy
2022-03-14
time spent: 1 hr
*/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode( null, null );
    _size = 0; // 0 because the first LLNode's cargo is null
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode test = _head; // creates a copy of the LLNode
    if (test.getCargo() == null) { // checks to see if the cargo is null and if it is it will set that value to newVal
      test.setCargo( newVal );
    }
    else {
      for (int i = 0; i < size() - 1; i++) { // iterates through test to get to the end of the LLNode
        test = test.getNext();
      }
      test.setNext( new LLNode ( newVal, null ) );
    }
    _size++;
    return true;
  }



  public String get( int index )
  {
    if ( index < 0 || index >= size() ) // if index is outside of current list
      throw new IndexOutOfBoundsException();
    else {
      LLNode test = _head;
      for ( int i = 0; i < index; i++ ) { //iterates through test until before the index
        test = test.getNext(); // test.getNext() is now at the index (because of the i < index)
      }
      return test.getCargo();
    }
  }


  public String set( int index, String newVal )
  {
    String oldVal = "";
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException(); // if index is outside of current list
    else {
      LLNode test = _head;
      for( int i = 0; i < index; i++ ) {
        test = test.getNext();
      }
      oldVal += test.getCargo();
      test.setCargo( newVal );
      return oldVal;
    }
  }


  // //return number of nodes in list
  public int size()
  {
    return _size;
  //   LLNode test = _head;
  //   int x = 0;
  //   while ( _head.getCargo() != null ) {
  //     x += 1;
  //     if (test.getNext() != null) {
  //       test = test.getNext();
  //     }
  //     else {
  //       break;
  //     }
  //   }
  // return x;
  }

  // //--------------^  List interface methods  ^--------------



  // // override inherited toString
  public String toString()
  {
    String s = "";
    LLNode test = _head;
    for ( int i = 0; i < size(); i++ ) {
      s += test.getCargo() + ", ";
      test = test.getNext();
    }
    return s;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println( "2nd item is: " + james.get(1) );
    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
