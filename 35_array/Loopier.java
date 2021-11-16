/*
Kleemex -- Lindsay Phung, May Qiu, and Xinqing Lin
APCS
HW35 -- improved HW34
2021-11-15
time spent: 0.5 hr

DISCO:
-

QCC:
- We used the Java visualizer to understand Team Blue Steaks's code. We took inspiration from their code to fix our linSearchR method.
*/

public class Loopier {

  public static void populateArray (int[] x) {
    for (int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random()*10);
    }
  }

  public static String versionString ( int[] array ) {
    String ans = "[";
    for (int i = 0; i < array.length; i++) {
      ans = ans + array[i] + ", ";
    }
    ans = ans.substring(0, ans.length() - 2) + "]";
    return ans;
  }

  public static int linSearch (int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int linSearchR (int[] a, int target) {
    if (freq(a, target) == 0) {
      return -1;
    }
    else {
      if (a[0] == target) {
        return 0;
      }
      else {
        int[] temp = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
          temp[i - 1] = a[i];
        }
        return 1 + linSearchR(temp, target);
      }
    }
  }

  public static int freq (int[] a, int target) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        count += 1;
      }
    }
    return count;
  }

  public static int freqRec (int[] a, int target) {
    int ans = 0;
    if (a.length == 1) {
      if (a[0] == target) {
        return 1;
      }
      return 0;
    }
    else {
      int [] b = new int [a.length-1];
      for (int i = 0; i < a.length-1 ; i++) {
        b[i] = a[i];
      }
      if (a[a.length-1] == target) {
        return 1+freqRec(b, target);
      }
      else {
        return freqRec(b,target);
      }
    }
  }

  public static void main(String[] args) {
    int[] test = new int[5];
    populateArray(test);
    System.out.println(versionString(test));
    System.out.println(linSearch(test, 4));
    System.out.println(linSearchR(test, 4));
    System.out.println(freq(test, 4));
    System.out.println(freqRec(test, 4));
  }
}
