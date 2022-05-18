/*
  RachelHateCult: May Qiu, Jeffery Tang, Xinqing Lin
  APCS
  HW103 -- Erica's Friends, Hugo, and The One in the Middle
  2022-05-18
  time spent: .6 hrs

  DISCO
  * You need to import java.util.NoSuchElementException before you can throw a NoSuchElementException error

  QCC


  ALGO
  1) Balance the trees: Add elements from the larger heap to the smaller heap until
     the difference is no greater than 1.
  2) If both heaps are empty (their roots are null), throw a
     NoSuchElementException error.
  3) Return the median. If the sizes are equal, return the mean of the roots. If not,
     return the root of the bigger heap.

*/

//import java.util.NoSuchElementException;

public class RunMed {

  private ALHeapMin bigVals;
  private ALHeapMax lilVals;

  public RunMed() {
    bigVals = new ALHeapMin();
    lilVals = new ALHeapMax();
  }

  public double getMedian() {
    while (bigVals.size() > lilVals.size() + 1) {
      lilVals.add(bigVals.removeMin());
    }

    while (lilVals.size() > bigVals.size() + 1) {
      bigVals.add(lilVals.removeMax());
    }

    if (lilVals.peekMax() == null && bigVals.peekMin() == null) {
      throw NoSuchElementException();
    }

    if (lilVals.size() == bigVals.size()) {
      return ((double)lilVals.peekMax() + bigVals.peekMin()) / 2;
    }
    else if (lilVals.size() < bigVals.size()) {
      return bigVals.peekMin();
    }
    else {
      return lilVals.peekMax();
    }

  }

  public void add(Integer newVal) {
    if (lilVals.peekMax() == null || newVal < lilVals.peekMax()) {
      lilVals.add(newVal);
    }
    else {
      bigVals.add(newVal);
    }
  }

  public static void main(String[] args) {

    RunMed poof = new RunMed();
    poof.add(3);
    poof.add(1);
    poof.add(2);
    poof.add(4);
    poof.add(6);
    poof.add(5); 

    System.out.println(poof.getMedian()); //should be 3.5

    RunMed woof = new RunMed();
    woof.add(251);
    woof.add(153);
    woof.add(509);
    woof.add(302);
    woof.add(129);

    System.out.println(woof.getMedian()); //should be 251

    RunMed toof = new RunMed();
    toof.add(2);

    System.out.println(toof.getMedian()); //should be 2

    RunMed hoof = new RunMed();

    System.out.println(hoof.getMedian()); //should throw NoSuchElementException error

  }

}
