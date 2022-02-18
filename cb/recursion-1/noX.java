/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.
*/

public class noX{

  public static String noX(String str) {
    if (str.length() <= 1) {
      if (str.equals("x")) {
        return "";
      }
      return str;
    }

    return noX(str.substring(0,1)) + noX(str.substring(1));
  }


  public static void main(String[] args) {
    System.out.println(noX("xaxb"));
    System.out.println(noX("abc"));
    System.out.println(noX("xx"));

  }

}
