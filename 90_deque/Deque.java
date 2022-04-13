/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW90 -- Swabbing the Deque
2022-04-12
time spent: 0.5 hr
*/

public interface Deque<QUASAR> {
  //adds an element to collection onto the back of this deque.
  public void addLast(QUASAR x);

  //adds an element to collection onto the front of this deque.
  public void addFirst(QUASAR x);

  //removes last element from collection and returns removed element.
  public QUASAR removeLast();

  //removes first element from collection and returns removed element.
  public QUASAR removeFirst();

  //returns last element from collection, returns null if deque is empty.
  public QUASAR peekLast();

  //returns first element from collection, returns null if deque is empty.
  public QUASAR peekFirst();

  //returns last element from collection.
  public QUASAR getLast();

  //returns first element from collection.
  public QUASAR getFirst();

  //returns and removes last element from collection, returns null if deque is empty.
  public QUASAR pollLast();

  //returns and removes first element from collection, returns null if deque is empty.
  public QUASAR pollFirst();

  //returns size of the collection.
  public int size();
}
