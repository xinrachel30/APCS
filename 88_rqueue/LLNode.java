public class LLNode<QUASAR>
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
