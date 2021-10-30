/*
Given a string, return a string where for every char in the original, there are two chars.
*/

public class doubleChar {

  public static String doubleChar(String str) {
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      ans += str.substring(i, i+1) + str.substring(i, i+1);
    }
    return ans;
  }

  public static void main(String args[]) {
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
  }
}
