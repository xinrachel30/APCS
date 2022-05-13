/*
RachelHateCult: Xinqing Lin, Jeffery Tang, May Qiu
APCS Pd 6
HW 99 -- Some Are More Equal Than Others, Codified
2022-05-13
time spent: .5 hrs
*/

import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue {
  private ArrayList<Integer> line;
  public ArrayPriorityQueue(){
    line = new ArrayList<Integer>();
  }

  public void add(int x){
    if (line.size() == 0){
      line.add(x);
      return;
    }
    for (int i = 0; i < line.size(); i++){
      if(x >= line.get(i)){
        line.add(i, x);
        return;
      }
    }
    if (x < line.get(line.size() - 1)){
      line.add(x);
    }
  }

  public boolean isEmpty(){
    return line.size() == 0;
  }

  public int peekMin(){
    return line.get(line.size() - 1);
  }

  public int removeMin(){
    return line.remove(line.size() - 1);
  }

  public static void main(String[] args) {       // temp testing

    ArrayPriorityQueue rollerblading = new ArrayPriorityQueue();

    //peasants
    rollerblading.add(1);
    rollerblading.add(1);
    rollerblading.add(1);
    rollerblading.add(1);

    //vip
    rollerblading.add(0);

    //mas peasants
    rollerblading.add(1);
    rollerblading.add(1);

    //dequeing
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
    System.out.println(rollerblading.removeMin());
  }

}
