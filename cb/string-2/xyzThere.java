/*
Return true if the given string contains an appearance of "xyz" where the xyz is not
directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/

public class xyzThere {

  public static boolean xyzThere(String str) {
    for (int i = 0; i + 3 <= str.length(); i++) {
      if (str.substring(i, i+3).equals("xyz")) {
        if (i > 0 && !str.substring(i-1,i).equals(".")) {
          return true;
        }
        else if (i == 0) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String args[]) {
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("abcxyz"));
  }
}
