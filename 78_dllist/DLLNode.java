/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW78 -- Double Up
2022-03-16
time spent: hrs
*/

/***
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class DLLNode
{
  //instance vars
  private DLLNode previous;
  private String value;
  private DLLNode next;

  // constructor
  public DLLNode( DLLNode previous, String value, DLLNode next )
  {
    this.previous = previous;
    this.value = value;
    this.next = next;
  }


  //--------------v  ACCESSORS  v--------------
  public DLLNode getPrevious()
  {
    return previous;
  }

  public String getCargo()
  {
    return value;
  }

  public DLLNode getNext()
  {
    return next;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public DLLNode setPrevious( DLLNode newPrevious )
  {
    previous = newPrevious;
    return previous;
  }

  public String setCargo( String newCargo )
  {
    value = newCargo;
    return value;
  }

  public DLLNode setNext( DLLNode newNext )
  {
    next = newNext;
    return next;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return value; // + " " + next; ? Should the toString print out just the current node or the entire linked array?
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    DLLNode first = new DLLNode( null, "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode( first, "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode(first.getNext().getNext(), "cow", null ) );

    //A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    //

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: The value changes back to null

    //...so better: ?
    DLLNode pop = new DLLNode (null, first.getCargo(), first.getNext());
    while( pop != null ) {
    System.out.println( pop.getCargo() );
    pop = pop.getNext();
    //first = first.getNext();
    }

    System.out.println(first); //test



  }//end main

}//end class DLLNode
