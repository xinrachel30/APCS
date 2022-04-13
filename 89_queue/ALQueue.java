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

  public String toString() {
    String ret = "[";
    for (int i = 0; i < cat.size(); i++) {
      ret += cat.get(i) + ",";
    }
    ret += "]";
    return ret;
  }

  public static void main(String[] args) {
      ALQueue test = new ALQueue();
      test.enqueue( "first" );
      test.enqueue( "second" );
      test.enqueue( "third" );
      test.enqueue( "fourth" );
      test.enqueue( "fifth" );
      test.enqueue( "sixth" );

      System.out.println(test.toString());

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
