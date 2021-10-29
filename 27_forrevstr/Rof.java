/**
Team Green Ice Cream (Ivina Wang, Xinqing Lin, Michael Kamela)
APCS
HW27 -- FOR the Love of Strings / Using s.substring() and s.length() from the AP Subset
2021-10-28
time spent: 0.75 hours

DISCO:
- s.substring(a, b) returns a string with the characters of indexes a to b (inclusive) from a string; ex. substring(0,1) of "stressed" returns s
- s.length() returns the number of characters in a string (as an int)
- There is a difference between a += b and a = b + a when a and b are both Strings

QCC:
- How do you code reverseR?

*/

public class Rof{

	public static String fenceF(int posts){
		String fence = " ";
		for (int i=0; i<=posts; i++){
			if (i == 1){
			fence = "|";
			}
			else {
			fence += "--|";
			}
		}
		return fence;
	}

	public static String reverseF(String s){
		String rev = "";
    for (int i=0; i<s.length(); i++){
      rev = s.substring(i, i+1) + rev;
    }
		return rev;
	}

	public static String reverseR(String s){
    String ree = "";
    if (s.length() == 1) {
      ree = s.substring(0,1)
      return ree;
    }
    else {
      return ree;
    }
  }



	public static void main(String[] args){
		System.out.println(fenceF(1));
		System.out.println(fenceF(3));
		System.out.println(reverseF("desserts"));
		System.out.println(reverseR("desserts"));
	}
}
