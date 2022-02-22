/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
*/

public class fix45 {

    public static int[] fix45 (int[] nums) {
        int[] indexes = new int[nums.length];
        int i2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && !(i != 0 && nums[i-1] == 4)) {
                    indexes[i2] = i;
                    i2++;
            }
        }
        i2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i+1] != 5) {
                // swap index i+1 with indexes[i2]
                nums[indexes[i2]] = nums[i+1];
                nums[i+1] = 5;
                i2++;
            }
        }
        return nums;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(fix45(new int[] {5, 4, 9, 4, 9, 5}));
        printArray(fix45(new int[] {1, 4, 5, 1}));
        printArray(fix45(new int[] {1, 4, 5, 1, 1, 4, 5}));
        printArray(fix45(new int[] {5, 4, 5, 4, 1}));

    }

}