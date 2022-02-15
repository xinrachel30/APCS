/*
Ramen - May Qiu and Xinqing Lin
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr
*/

/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)
*/

public class groupSum6{

  public static boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) {
      if (target == 0) {
        return true;
      }
      return false;
    }

    if (groupSum6(start + 1, nums, target - nums[start])) {
      return true;
    }
    if (nums[start] != 6) {
      if (groupSum6(start + 1, nums, target)) {
        return true;
      }
    }
    return false;

  }


  public static void main(String[] args) {
    int[] test = {5,6,2};
    System.out.println(groupSum6(0, test, 8));
    System.out.println(groupSum6(0, test, 9));
    System.out.println(groupSum6(0, test, 7));

  }

}
