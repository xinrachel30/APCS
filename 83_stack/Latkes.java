/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO

    QCC

 **/
import java.util.NoSuchElementException;

public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    if (isFull()) {
      throw new IndexOutOfBoundsException();

    }
    _stack[_stackSize] = s;
    _stackSize ++;
  }// O(1)


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    String ret = _stack[_stackSize];
    _stack[_stackSize] = "";
    _stackSize --;
    return ret;

  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(1)

    /* your
       SIMPLE
       SMART
       magicks
       here
    */

  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
