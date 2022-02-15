/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count7(717) → 2
count7(7) → 1
count7(123) → 0
*/

public class count7{

	public static int count7(int n) {
        if (n < 10) {
            if (n == 7) {
                return 1;
            }
            return 0;
        }
        if (n%10 == 7) {
            return 1 + count7(n/10);
        }
        return 0 + count7(n/10);
    } 

	public static void main(String [] args) {
		System.out.println(count7(717));
		System.out.println(count7(7));
		System.out.println(count7(123));
	}

}
