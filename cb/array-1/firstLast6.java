/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/

public class firstLast6 {
	public static boolean firstLast6(int[] nums) {
    		if ((nums[0] == 6) || (nums[nums.length-1] == 6)) {
     			return true;
   		} 
    		return false;
  	}	
  		
  	public static void main(String[] args) {
  		int[] test = {1, 2, 6};
  		int[] test2 = {6, 1, 2, 3};
  		int[] test3 = {13, 6, 1, 2, 3};
    		System.out.println(firstLast6(test));
    		System.out.println(firstLast6(test2));
    		System.out.println(firstLast6(test3));
  	}
}
