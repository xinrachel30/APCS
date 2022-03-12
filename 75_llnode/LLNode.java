/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW75 -- Nodal Recall
2022-03-12
time spent: 0.6 hrs
*/

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String value;
  private LLNode next;

  // constructor
  public LLNode( String value, LLNode next )
  {
    this.value = value;
    this.next = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return value;
  }

  public LLNode getNext()
  {
    return next;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    value = newCargo;
    return value;
  }

  public LLNode setNext( LLNode newNext )
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
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    //A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    //

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: The value changes back to null

    //...so better: ?
    LLNode pop = new LLNode (first.getCargo(), first.getNext());
    while( pop != null ) {
    System.out.println( pop.getCargo() );
    pop = pop.getNext();
    //first = first.getNext();
    }

    System.out.println(first); //test



  }//end main

}//end class LLNode
