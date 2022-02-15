/*
Ramen - May Qiu and Xinqing Lin
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr
*/

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)
*/

public class groupNoAdj{

  public static boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) {
      if (target == 0) {
        return true;
      }
      return false;
    }

    if (groupNoAdj(start + 2, nums, target - nums[start])) {
      return true;
    }
    if (groupNoAdj(start + 1, nums, target)) {
      return true;
    }
    return false;
  }


  public static void main(String[] args) {
    int[] test = {2, 5, 10, 4};
    System.out.println(groupNoAdj(0, test, 12));
    System.out.println(groupNoAdj(0, test, 14));
    System.out.println(groupNoAdj(0, test, 7));

  }

}
