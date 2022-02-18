/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
*/

public class changePi{

  public static String changePi(String str) {
    if (str.length() < 2) {
      return str;
    }
    if (str.substring(0, 2).equals("pi")) {
      return "3.14" + changePi(str.substring(2));
    }

    return changePi(str.substring(0,1)) + changePi(str.substring(1));

  }

  public static void main(String[] args) {
    System.out.println(changePi("xpix"));
    System.out.println(changePi("pipi"));
    System.out.println(changePi("pip"));

  }

}
