/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
*/

public class sameEnds {

  public static String sameEnds(String string) {
    String front = string.substring(0, string.length() / 2);
    String back = string.substring(string.length() - (string.length() / 2));

    while (!front.equals(back)) {
      front = front.substring(0, front.length() - 1);
      back = back.substring(1);
    }
    return front;
  }

  public static void main(String[] args) {
    System.out.println(sameEnds("abXYab"));
    System.out.println(sameEnds("xx"));
    System.out.println(sameEnds("xxx"));

  }

}
