/*
Return the number of times that the string "hi" appears anywhere in the given string.
*/

public class countHi {

  public static int countHi(String str) {
    int count = 0;
    for (int i = 0; i + 2 <= str.length(); i++) {
      if (str.substring(i, i+2).equals("hi")) {
        count ++;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihi"));
  }
}
