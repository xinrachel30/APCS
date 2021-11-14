/*
Kleemex -- Lindsay Phung, May Qiu, and Xinqing Lin
APCS
HW34 -- A Pirate's Life for Me / populating, stringing, and returning the index of the first occurence of a target & frequency of target in an array of ints
2021-11-13
time spent: 1.5 hrs

DISCO:
- You can reference a specific value in an array using arrayName[index]
- When 'println' an array, system outputs [I@41a4555e]. Based on the Think Java reading, the I stands for integer and the following represents the "address of the array in memory"
- Recursion is said to appeal to some due to its 'concise' way of calling a method in its body whileas the iteritive utilizes loops

QCC:
- linSearchR finds the index of the last instance of target, not the first
- freqRec currently unfinished
- Whileas it is easier to imagine the recursive route, actually putting it in code proves to be much more challenging
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

  /*public static int linSearchR (int[] a, int target) {
    if (a.length == 1) {
      if (a[0] == target) {
        return 0;
      }
    }
    else {
      for(int i = a.length; i > 0; i--) {
        if (a[i] == target) {
          return i;
        }
      }
    }
    return -1;
  }*/

  public static int linSearchR (int[] a, int target) {
    if (a.length == 1) {
        if (a[0] == target) {
            return 0;
        }
        return -1;
    }
    else {
      if (a[a.length - 1] == target) {
          return a.length - 1;
      }
      int[] newA = new int[a.length - 1];
      for (int i = 0; i < a.length - 1; i++) {
          newA[i] = a[i];
      }
      return linSearchR(newA, target);
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
      for (int i = 0; i < a.length; i++) {
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
    int[] test2 = {2, 4, 8, 4, 2};
    populateArray(test);
    System.out.println(versionString(test));
    System.out.println(linSearch(test, 4));
    System.out.println(linSearchR(test2, 4));
    System.out.println(freq(test, 4));
    System.out.println(freqRec(test, 4));
  }
}
