/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
*/

public class maxBlock {

  public static int maxBlock(String str) {
    int max = 0;
    int temp = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i-1)) {
        temp++;
      }
      else {
        temp = 1;
      }
      if (temp > max) {
        max = temp;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(maxBlock("hoopla"));
    System.out.println(maxBlock("abbCCCddBBBxx"));
    System.out.println(maxBlock(""));
    System.out.println(maxBlock("xyzz"));

  }

}
