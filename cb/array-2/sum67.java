/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
*/

public class sum67 {

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean after6 = false;
        for (int i = 0; i < nums.length; i++) {
            if (after6 == false) {
                if (nums[i] != 6) {
                    sum += nums[i];
                }
                else {
                    after6 = true;
                }
            }
            else {
                if (nums[i] == 7) {
                    after6 = false;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum67(new int [] {1, 2, 2}));
        System.out.println(sum67(new int [] {1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sum67(new int [] {1, 1, 6, 7, 2}));
    }

}