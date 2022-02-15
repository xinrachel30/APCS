/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public class powerX{

	public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String temp = str.substring(1);
        if ((str.substring(0,1)).equals("x")) {
            return 1 + countX(temp);
        }
        return countX(temp);
    } 

	public static void main(String [] args) {
		System.out.println(countX("xxhixx"));
		System.out.println(countX("xhixhix"));
		System.out.println(countX("hi"));
	}

}
