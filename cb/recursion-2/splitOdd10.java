/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
*/

public class splitOdd10 {

  public static boolean splitOdd10(int[] nums) {
    return (help(0, nums, 0, 0));
  }

  public static boolean help(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) {
      return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1) ;
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
    System.out.println(splitOdd10(new int[] {5, 5, 5}));
    System.out.println(splitOdd10(new int[] {5, 5, 6}));
    System.out.println(splitOdd10(new int[] {5, 5, 6, 1}));

  }

}
