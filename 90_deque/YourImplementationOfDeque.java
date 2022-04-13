/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW90 -- Swabbing the Deque
2022-04-12
time spent: 0.5 hr
*/

import java.util.LinkedList;
public class YourImplementationOfDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> mouse;

  public YourImplementationOfDeque() {
    mouse = new LinkedList<QUASAR>();
  }

  public void addLast(QUASAR x){
    mouse.addLast(x);
  }


  public void addFirst(QUASAR x){
    mouse.addFirst(x);
  }

  public QUASAR removeLast(){
    return mouse.removeLast();
  }

  public QUASAR removeFirst(){
    return mouse.removeFirst();
  }

  public QUASAR peekFirst(){
    return mouse.peekFirst();
  }

  public QUASAR peekLast(){
    return mouse.peekLast();
  }

  public QUASAR getLast() {
    return mouse.getLast();
  }

  public QUASAR getFirst() {
    return mouse.getFirst();
  }

  public QUASAR pollLast() {
    return mouse.pollLast();
  }

  public QUASAR pollFirst() {
    return mouse.pollLast();
  }

  public int size(){
    return mouse.size();
  }

  public static void main(String[] args) {
      YourImplementationOfDeque test = new YourImplementationOfDeque();
      test.addLast( "first" );
      test.addLast( "second" );
      test.addLast( "third" );
      test.addLast( "fourth" );
      test.addLast( "fifth" );
      test.addLast( "sixth" );

      System.out.println("Peek first: " + test.peekFirst());
      System.out.println("Peek last: " + test.peekLast());

      System.out.println("Removing last: " + test.removeLast());
      System.out.println("Removing first: " + test.removeFirst());

      System.out.println("Peek first: " + test.peekFirst());
      System.out.println("Peek last: " + test.peekLast());

      test.addFirst("surprise");
      System.out.println("Peek first: " + test.peekFirst());

      System.out.println("Polling first: " + test.pollFirst());
      System.out.println("Polling last: " + test.pollLast());

      System.out.println("Get first: " + test.getFirst());
      System.out.println("Get last: " + test.getLast());

      System.out.println("Size: " + test.size());
    }
}
