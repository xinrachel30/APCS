/*
  RachelHateCult: May Qiu, Jeffery Tang, Xinqing Lin
  APCS
  HW102 -- Heap On Heapin' On
  2022-05-17
  time spent: .5 hrs

  DISCO
  - We should look through the entire skeleton before we starting coding a swap
    which there is already a helper method for.

  QCC
  - Tracing is helpful

*/

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();
  }//O(1)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   *  Add the addVal as a leaf.
   *  If the addVal is lesser than its parent, then swap the addVal with the parent
   *    until it is in the right position
   */
  public void add( Integer addVal )
  {
    int number = _heap.size();
    _heap.add(addVal);
    while ((number - 1) / 2 >= 0){
      if (_heap.get((number - 1) / 2) > addVal){ // if parent > addVal
        swap((number - 1) / 2, number);          // swap parent and addVal
        number = (number - 1) / 2;
      }
      else {
        return;
      }
    }

  }//O(log(the height of the tree))


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   *  Store the root in an answer variable.
   *  Replace the root with the last leaf
   *  Walk the leaf down using minChildPos() until it follows the variant.
   */
  public Integer removeMin()
  {
    int answer = _heap.get(0);
    _heap.set(0, _heap.get(_heap.size() - 1));
    _heap.remove(_heap.size() - 1);
    int tracker = 0;
    while (minChildPos(tracker) != -1) {
      int smt = minChildPos(tracker);
      swap(tracker, smt);
      tracker = smt;
    }
    return answer;
  }//O(height of the tree)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if (pos < 0 || pos * 2 + 1 >= _heap.size()) { //not in ArrayList or no children
      return -1;
    }
    int left = pos * 2 + 1;
    if (pos * 2 + 2 >= _heap.size()) { //only one child (left)
      return left;
    }
    int right = pos * 2 + 2;
    if (_heap.get(left) > _heap.get(right)) { //all other cases
      return right;
    }
    else {
      return left;
    }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {

      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
