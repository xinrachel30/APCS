/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
*/

public class countTriple{

  public static int countTriple(String str) {
    int triples = 0;
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1)) {
        triples++;
      }
    }
    return triples;
  }

  public static void main(String[] args) {
    System.out.println(countTriple("abcXXXabc"));
    System.out.println(countTriple("xxxabyyyycd"));
    System.out.println(countTriple("a"));
  }

}
