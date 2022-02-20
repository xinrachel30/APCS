/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
*/

public class equalIsNot{

  public static boolean equalIsNot(String str) {
    int sumIs = 0;
    int sumNot = 0;
    while (str.indexOf("is") > -1) {
      str = str.substring(0, str.indexOf("is")) + str.substring(str.indexOf("is") + 2);
      sumIs ++;
    }
    while (str.indexOf("not") > -1) {
      str = str.substring(0, str.indexOf("not")) + str.substring(str.indexOf("not") + 3);
      sumNot ++;
    }

    return sumIs == sumNot;

  }

  public static void main(String[] args) {
    System.out.println(equalIsNot("This is not"));
    System.out.println(equalIsNot("This is notnot"));
    System.out.println(equalIsNot("noisxxnotyynotxisi"));
  }

}
