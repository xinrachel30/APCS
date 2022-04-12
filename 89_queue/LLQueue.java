import java.util.LinkedList;
public class LLQueue<QUASAR> implements Queue<QUASAR> {
  private LinkedList<QUASAR> mouse;

  public LLQueue() {
    mouse = new LinkedList<QUASAR>();
  }

  public QUASAR dequeue() {
    return mouse.remove();
  }

  public void enqueue(QUASAR x) {
    mouse.addLast(x);
  }

  public boolean isEmpty() {
    return mouse.size() == 0;
  }

  public QUASAR peekFront() {
    return mouse.peekFirst();
  }

  public static void main(String[] args) {
      LLQueue test = new LLQueue();
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
}
