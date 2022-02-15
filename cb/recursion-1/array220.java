/*
Ramen - May Qiu and Xinqing Lin
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr
*/

/* Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0. */

  public class array220 {
  public static boolean array220(int[] nums, int index) {
  if(index == nums.length){
    return false;
  }
  for(int i = index; i < nums.length; i++){
    if(nums[i] == (nums[index] * 10)){
      return true;
    }
  }
      return array220(nums, index + 1);
    }
    public static void main(String[] args) {
      int[] a = {1,2,20};
      int[] b = {3,30};
      int[] cries = {3};
      System.out.println(array220(a, 0) + "\nReturn:true");
      System.out.println(array220(b, 0) + "\nReturn:true");
      System.out.println(array220(cries, 0) + "\nReturn:false");
    }
}
