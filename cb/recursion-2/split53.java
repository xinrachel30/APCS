/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
*/

public class split53{

  public static boolean split53(int[] nums) {
    return (help(0, nums, 0, 0));
  }

  public static boolean help(int start, int[] nums, int threeSum, int fiveSum) {
    if (start >= nums.length) {
      return threeSum == fiveSum;
    }

    if (nums[start] % 5 == 0) {
      if (help(start + 1, nums, threeSum, fiveSum + nums[start])) {
        return true;
      }
    }
    else if (nums[start] % 3 == 0) {
      if (help(start + 1, nums, threeSum + nums[start], fiveSum)) {
        return true;
      }
    }
    else {
      if (help(start + 1, nums, threeSum + nums[start], fiveSum)) {
        return true;
      }
      if (help(start + 1, nums, threeSum, fiveSum + nums[start])) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(split53( new int[] {1, 1} ));
    System.out.println(split53( new int[] {1, 1, 1} ));
    System.out.println(split53( new int[] {2, 4, 2} ));

  }

}
