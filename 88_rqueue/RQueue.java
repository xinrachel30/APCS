/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( T enQVal )
  {
    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<PIKACHU>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<PIKACHU>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue()
  {
    PIKACHU retVal = _front.getCargo();
     _front = _front.getNext();

     if ( _front == null ) //just moved past last node
       _end = null;      //update _end to reflect emptiness

     _size--;

     return retVal;
  }//O(1)


  public T peekFront()
  {
    return _front.getValue();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample ()
  {

  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String foo = "";
    LLNode<SWASHBUCKLE> tmp = _front;
    while ( tmp != null ) {
      foo += tmp.getValue() + " ";
      tmp = tmp.getNext();
    }
    return foo;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
