/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
*/

public class splitArray{

  public static boolean splitArray(int[] nums) {
    return (help(0, nums, 0, 0));
  }

  public static boolean help(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) {
      return sum1 == sum2;
    }

    if (help(start + 1, nums, sum1 + nums[start], sum2)) {
      return true;
    }
    if (help(start + 1, nums, sum1, sum2 + nums[start])) {
      return true;
    }

    return false;

  }

  public static void main(String[] args) {
    int[] test1 = {2, 2};
    int[] test2 = {2, 3};
    int[] test3 = {5, 2, 3};

    System.out.println(splitArray(test1));
    System.out.println(splitArray(test2));
    System.out.println(splitArray(test3));

  }

}
