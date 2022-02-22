/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
*/

public class linearIn{
	
	public static boolean linearIn(int[] outer, int[] inner) {
        int i2 = 0;
        for (int i = 0; i < outer.length && i2 < inner.length; i++) {
            if (outer[i] == inner[i2]) {
                i2++;
            }
        }
        if (i2 < inner.length) {
            return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
    		System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));
            System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));
    		System.out.println(linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}));

  	}

}