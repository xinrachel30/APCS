import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

  LinkedList Courtney = new LinkedList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return Courtney.size() <= 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return (PANCAKE)Courtney.get(Courtney.size() - 1);
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    PANCAKE ret = (PANCAKE)Courtney.get(Courtney.size() - 1);
    Courtney.remove(peekTop());
    return ret;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    Courtney.add(x);
  }

}
