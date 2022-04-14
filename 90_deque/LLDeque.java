/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW90 -- Swabbing the Deque
2022-04-12
time spent: 0.5 hr
*/

import java.util.LinkedList;
public class LLDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> mouse;

  public LLDeque() {
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

  public boolean contains(QUASAR x){
    return mouse.contains(x);
  }
}
