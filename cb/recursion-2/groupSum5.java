/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
*/

public class groupSum5 {

  public static boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) {
      if (target == 0) {
        return true;
      }
      return false;
    }

    if (nums[start] % 5 == 0 && nums[start] != 1) {
      if (groupSum5(start + 1, nums, target - nums[start])) {
        return true;
      }
    }
    else if (start != 0 && (nums[start - 1] % 5 == 0) && nums[start] == 1) { // checks if preceding value exists, if it is a multiple of 5, and if current val is 1
      if (groupSum5(start + 1, nums, target)) {
        return true;
      }
    }
    else {
      if (groupSum5(start + 1, nums, target - nums[start])) { //business as per usual (in one big if-elseif-else statement to prevent multiples of 5 accidentally being included)
        return true;
      }
      if (groupSum5(start + 1, nums, target)) {
        return true;
      }
    }

    return false;

  }

  public static void main(String[] args) {
    int[] test = {2, 5, 10, 4};
    System.out.println(groupSum5(0, test, 19));
    System.out.println(groupSum5(0, test, 17));
    System.out.println(groupSum5(0, test, 12));

  }

}
