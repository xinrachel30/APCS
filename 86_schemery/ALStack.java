import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{

  ArrayList jeffery = new ArrayList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return jeffery.size() <= 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return (PANCAKE)jeffery.get(jeffery.size() - 1);
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    PANCAKE ret = (PANCAKE)jeffery.get(jeffery.size() - 1);
    jeffery.remove(peekTop());
    return ret;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    jeffery.add(x);
  }
}
