/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
*/

public class squareUp {
	
	public static int[] squareUp(int n) {
        if (n == 0) {
            return new int[] {};
        }
        int[] miniarr = new int[n];
        int miniArrIndex = 0;
        for (int i = n; i > 0; i--) {
            miniarr[miniArrIndex] = 0;
            miniArrIndex++;
        }

        int[] bigarr = new int[n * n];
        int index = 0;
        int literal = 1;
        for (int i = n; i > 0; i--) {
            miniarr[i - 1] = literal;
            literal++;
            for (int i2 = 0; i2 < miniarr.length; i2++) {
                bigarr[index] = miniarr[i2];
               index++;
            }
        }
        return bigarr;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
    	printArray(squareUp(3));
        printArray(squareUp(2));
        printArray(squareUp(4));

  	}

}