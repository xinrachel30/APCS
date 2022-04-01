/***
 * interface Stack
 * Specifies actions a stack must be able to perform.
 * Allows for generic typing.
 **/

public interface Stack<COURTNEY>
{
    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty();

    //Return top element of stack without popping it.
    public COURTNEY peekTop();

    //Pop and return top element of stack.
    public COURTNEY pop();

    //Push an element onto top of this stack.
    public void push( COURTNEY x );

}//end interface
