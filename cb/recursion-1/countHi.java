/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/

public class countHi{

	public static int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        if (str.substring(0,2).equals("hi")) {
            return 1 + countHi(str.substring(1));
        }
        return countHi(str.substring(1));
    } 

	public static void main(String [] args) {
		System.out.println(countHi("xxhixx"));
		System.out.println(countHi("xhixhix"));
		System.out.println(countHi("hi"));
	}

}
