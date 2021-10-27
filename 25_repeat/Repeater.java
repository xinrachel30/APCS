/*
Perry Huang, Faiyaz Rafee, Xinqing Lin
APCS
HW25 -- Do I repeat myself?/Recursive and While looping for fence posts/summary here
2021-10-26
time spent: 0.8 hrs
DISCO:
You can have more then one base case
QCC:
How would you make this work if it had negative fences?
*/

public class Repeater {

  public static String fenceW(int numPosts) {
    int fences = 1;
    String result = "";
    while (fences <= numPosts) {
      if (numPosts == 0) {
        return "";
      }

      else if (fences == 1) {
        result = "|";
        fences++;
      }
      else {
        result += "--|";
        fences++;
      }
    }
      return result;
  }

public static String fenceR(int numPosts) {
    if (numPosts == 0) {
      return "";
    }
    else if (numPosts == 1) {
      return "|";
    }
    else {
      return fenceR(numPosts - 1) + "--|";
    }
  }

public static void main(String[] args) {
    System.out.println(fenceR(3));			// output: "|--|--|"
    System.out.println(fenceR(2));			// output: "|--|"
    System.out.println(fenceW(3));
    System.out.println(fenceW(2));
  }
}
