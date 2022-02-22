/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
*/

public class maxSpan{

  public static int maxSpan(int[] nums) {
      int max = 0;
      int difference;

      for (int front = 0; front < nums.length; front++) {
          int target = nums[front];
          for (int back = nums.length - 1; back >= front; back--) {
              if (nums[back] == target) {
                  difference = back - front + 1; 
                  if (difference > max) {
                    max = difference;
                  }
                  break;
              }
          }
      }
      return max;
  }

  public static void main(String[] args) {
    System.out.println(maxSpan(new int[] {1, 2, 1, 1, 3}));
    System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
    System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));

  }

}
