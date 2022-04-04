/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW88 -- BPC Kiddies Do Not Wait in Line Either
2022-04-04
time spent: 0.6 hr

DISCO
-

QCC
- We didn't do an "actual" shuffle since we did not change the order of all the nodes.
  Our original idea would've taken many for loops and manuvering. Instead, we
  selected a random node and moved it to the front in sample()

*/

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


  public void enqueue( SWASHBUCKLE enQVal )
  {
    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)


  // pulls random element out of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    sample();
    SWASHBUCKLE ret = _front.getCargo();
    _front = _front.getNext();
    _size--;
    return ret;
  }//O(1) (because dequeue() uses sample(), which is O(n) worse case scenario)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   1. Pick a random number / index
   *   2. Iterate through the queue and save the selected LLNode at that index in another variable
   *   3. Remove the selected LLNode from queue
   *   4. Make the selected LLNode the first node in the queue
   **/
  public void sample()
  {
    int rando = (int)(Math.random() * _size);             //pick random number
    LLNode<SWASHBUCKLE> tmp = _front;

    if (rando == 0) {

    }
    else {
      for (int i = 0; i < rando - 1; i++) {
        tmp = tmp.getNext();
      }
      LLNode<SWASHBUCKLE> selected = tmp.getNext();         //keep the selected LLNode at random number
      tmp.setNext(tmp.getNext().getNext());                 //remove selected from queue

      selected.setNext(_front);                             //make selected the first node in queue
      _front = selected;
    }

  }//O(n)


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
      foo += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    return foo;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

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

    // System.out.println("\nnow dequeuing fr empty queue...\n" +
    //                    "(expect NPE)\n");
    // System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
