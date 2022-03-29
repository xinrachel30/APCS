/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW83 -- Stacks on Stacks
2022-03-28
time spent: 0.3 hr
*/

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO: To increase the capacity of the array, we made a copy of the array.
    QCC:  Is there another way to increase the capcity of the array?
 **/

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
      String [] copy = new String[_stackSize+1];
      for (int i = 0; i < _stack.length ; i++){
        copy[i] = _stack[i];
      }
      _stack = copy;
      _stack[_stackSize] = s;
      _stackSize ++;
    }
    else{
    _stack[_stackSize] = s;
    _stackSize ++;
  }
}// O(n) worse case scenario


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
      String none = "NULL";
      return none;
    }
    String ret = _stack[_stackSize-1];
    _stack[_stackSize-1] = "";
    _stackSize --;
    return ret;

  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize <= 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
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
