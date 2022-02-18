/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
*/

public class countAbc{

  public static int countAbc(String str) {
    if (str.length() < 3) {
      return 0;
    }
    if (str.substring(0, 3).equals("abc") ||
        str.substring(0, 3).equals("aba")) {
      return 1 + countAbc(str.substring(1));
    }
    return countAbc(str.substring(1));
  }

  public static void main(String[] args) {
    System.out.println(countAbc("abc"));
    System.out.println(countAbc("abcxxabc"));
    System.out.println(countAbc("abaxxaba"));

  }

}
