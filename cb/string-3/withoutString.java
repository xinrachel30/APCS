/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x"
*/

public class withoutString {

  public static String withoutString(String base, String remove) {
    String loBase = base.toLowerCase();
    String loRemove = remove.toLowerCase();


    while (loBase.indexOf(loRemove) > -1) {
      int sIndex = loBase.indexOf(loRemove);
      base = base.substring(0, sIndex) + base.substring(sIndex + remove.length());
      loBase = loBase.substring(0, sIndex) + loBase.substring(sIndex + remove.length());

    }
    return base;
  }

  public static void main(String[] args) {
    System.out.println(withoutString("Hello there", "llo"));
    System.out.println(withoutString("Hello there", "e"));
    System.out.println(withoutString("Hello there", "x"));

  }

}
