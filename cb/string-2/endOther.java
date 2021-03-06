/*
Given two strings, return true if either of the strings appears at the very end of the other
string, ignoring upper/lower case differences (in other words, the computation should not
be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
*/

public class endOther {

  public static boolean endOther(String a, String b){
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() > b.length()) {
      if (a.substring(a.length()-b.length()).equals(b)) {
        return true;
      }
    }
    if (b.length() > a.length()) {
      if (b.substring(b.length() - a.length()).equals(a)) {
        return true;
      }
    }
    if (a.equals(b)) {
      return true;
    }
    return false;
  }

  public static void main(String args[]){
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
  }

}
