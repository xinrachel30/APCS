/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
*/

public class sum28{
  public static boolean sum28(int[] nums) {
    int twos=0;
    for (int i=0;i<nums.length; i++){
      if(nums[i]==2){
        twos++;
      }
    }
      if (twos==4){
        return true;}
        else {return false;}
    }
public static void main(String [] args){
  System.out.println(sum28(new int []{2,3,2,2,4,2}));
  System.out.println(sum28(new int []{2,3,2,2,4,2,2}));
  System.out.println(sum28(new int []{1,2,3,4}));
}
}