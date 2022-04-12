import java.util.ArrayList;
public class ALQueue<QUASAR> implements Queue<QUASAR> {
  private ArrayList<QUASAR> cat;

  public ALQueue() {
    cat = new ArrayList<QUASAR>();
  }

  public QUASAR dequeue() {
    return cat.remove(0);
  }

  public void enqueue(QUASAR x) {
    cat.add(x);
  }

  public boolean isEmpty() {
    return cat.size() == 0;
  }

  public QUASAR peekFront() {
    return cat.get(0);
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
