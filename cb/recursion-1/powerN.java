/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/

public class powerN{

	public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n-1);
    } 

	public static void main(String [] args) {
		System.out.println(powerN(3, 1));
		System.out.println(powerN(3, 2));
		System.out.println(powerN(3, 3));
	}

}
