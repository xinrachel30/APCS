/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
*/

public class canBalance{

    public static boolean canBalance(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int front = 0;
        int back = sum;
        for (int i = 0; i < nums.length; i++) {
            back -= nums[i];
            front += nums[i];
            if (front == back) {
                return true;
            } 
        }
        return false;
    }

	public static void main(String[] args) {
    	System.out.println(canBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[] {2, 1, 1, 2, 1}));
    	System.out.println(canBalance(new int[] {10, 10}));

  	}

}