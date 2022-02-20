/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
*/

public class groupSumClump {

  public static boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) {
      if (target == 0) {
        return true;
      }
      return false;
    }

    int repeats = 0;
    for (int i = start; i < nums.length; i++) {
      if (nums[i] == nums[start]) {
        repeats ++;
      }
    }
    int subtracted = repeats * nums[start];

    if (groupSumClump(start + repeats, nums, target - subtracted)) {
      return true;
    }
    if (groupSumClump(start + repeats, nums, target)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] test1 = {2, 4, 8};
    int[] test2 = {1, 2, 4, 8, 1};
    int[] test3 = {2, 4, 4, 8};
    System.out.println(groupSumClump(0, test1, 10) );
    System.out.println(groupSumClump(0, test2, 14) );
    System.out.println(groupSumClump(0, test3, 14) );

  }

}
