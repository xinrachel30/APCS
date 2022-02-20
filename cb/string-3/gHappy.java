/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
*/

public class gHappy{

  public static boolean gHappy(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'g') {
        if ((i != 0 && str.charAt(i - 1) == 'g') || (i != str.length() -1 && str.charAt(i + 1) == ('g'))) {

        }
        else {
          return false;
      }
    }
  }
  return true;
}

  public static void main(String[] args) {
    System.out.println(gHappy("xxggxx"));
    System.out.println(gHappy("xxgxx"));
    System.out.println(gHappy("xxggyygxx"));

  }

}
