/*

Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
*/

public class seriesUp {
	
	public static int[] seriesUp(int n) {
        int[] arr = new int[ n * (n+1) / 2 ];
        int section = 0;
        for (int i = 0; i < arr.length; i++) {
            section++;
            arr[i] = 1;
            for (int z = 2; z <= section; z++) {
               i++;
                arr[i] = z;
            }
        }
        return arr;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
    	printArray(seriesUp(3));
        printArray(seriesUp(4));
    	printArray(seriesUp(2));

  	}

}