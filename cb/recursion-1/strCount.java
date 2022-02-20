/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
*/

public class strCount{

  public static int strCount(String str, String sub) {
    if (str.length() < sub.length()) {
      return 0;
    }
    if (str.substring(0, sub.length() ).equals(sub)) {
      return 1 + strCount(str.substring( sub.length() ), sub);
    }
    return strCount(str.substring(1), sub);
  }

  public static void main(String[] args) {
    System.out.println(strCount("catcowcat", "cat"));
    System.out.println(strCount("catcowcat", "cow"));
    System.out.println(strCount("catcowcat", "dog"));

  }

}
