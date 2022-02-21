/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
*/

public class mirrorEnds {

  public static String mirrorEnds(String string) {
    int q = string.length() - 1;
    int i = 0;
    String mirror = "";
    for ( ; i < string.length() ; i++) {
      if (string.charAt(i) == string.charAt(q)) {
        mirror += string.charAt(i);
      }
      else {
        return mirror;
      }
      q--;
    }

    return mirror;

  }


  public static void main(String[] args) {
    System.out.println(mirrorEnds("abXYZba"));
    System.out.println(mirrorEnds("abca"));
    System.out.println(mirrorEnds("aba"));

  }

}
