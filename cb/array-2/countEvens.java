/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

public class countEvens {
  public static int countEvens(int[] nums) {
    int evenCount = 0;
    for (int value : nums) {
      if (value%2 == 0) {
        evenCount ++;
      }
    }
    return evenCount;
  }
  public static void main(String[] args) {
    System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
    System.out.println(countEvens(new int[] {2, 2, 0}));
    System.out.println(countEvens(new int[] {1, 3, 5}));
  }
}
