/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW87 -- The English Do Not Wait In Line for Soup
2022-04-02
time spent: 1.3 hr

DISCO
-

QCC
- What is QUASAR? Is it supposed to be the nodes, or the value of the nodes?
  - We chose to make it the value of the nodes because nodes are something
    specific, not generic
- Were we allowed to use >2 files? The HW website only mentions NodeQueue and Queue
*/

public class NodeQueue<QUASAR> implements Queue<QUASAR>{

  public int _size;
  public LLNode _tail;

  public NodeQueue() {
    _tail = new LLNode(null, null);
    _size = 0;
  }

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    LLNode temp = _tail;
    QUASAR ret;
    if (_size == 1) {
      ret = (QUASAR)_tail.getCargo();
      _tail = new LLNode(null, null);
    }
    else if (_size == 2) {
      ret = (QUASAR)_tail.getNext().getCargo();
      _tail.setNext(null);
    }
    else {
      for (int i = 0; i < _size - 2; i++) {
        temp = temp.getNext();
      }
      ret = (QUASAR)temp.getNext().getCargo();
      temp.setNext(null);
    }
    _size--;
    return ret;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
    LLNode temp = new LLNode(x, null);
    if (_size == 0) {
      _tail = temp;
    }
    else {
      temp.setNext(_tail);
      _tail = temp;
    }
    _size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _size <= 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    LLNode temp = _tail;
    if (_size == 1) {

    }
    else if (_size == 2) {
      temp = temp.getNext();
    }
    else {
      for (int i = 0; i < _size - 2; i++) {
        temp = temp.getNext();
      }
    }
    return (QUASAR)temp.getNext().getCargo();
  }

  public static void main(String[] args) {
    NodeQueue test = new NodeQueue();
    test.enqueue( "first" );
    test.enqueue( "second" );
    test.enqueue( "third" );
    test.enqueue( "fourth" );
    test.enqueue( "fifth" );
    test.enqueue( "sixth" );

    System.out.println("\nDequeuing ... ");
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println("only peeking: " + test.peekFront());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
  }

  public static class LLNode<QUASAR>                        //innerclass LLNode
  {
    //instance vars
    private QUASAR value;
    private LLNode next;

    // constructor
    public LLNode( QUASAR value, LLNode next )
    {
      this.value = value;
      this.next = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo()
    {
      return value;
    }

    public LLNode getNext()
    {
      return next;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
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
      return "" + value;
    }


  }//end class LLNode

}
