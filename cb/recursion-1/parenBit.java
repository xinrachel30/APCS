/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
*/

public class parenBit {

  public static String parenBit(String str) {
    if (str.length() < 1) {
      return "";
    }
    if (!str.substring(0,1).equals("(")) {
      return parenBit(str.substring(1));
    }
    if (!str.substring(str.length() - 1, str.length()).equals(")")) {
      return parenBit(str.substring(0,str.length()-1));
    }
    return str;
}


  }

  public static void main(String[] args) {
    System.out.println(parenBit("xyz(abc)123"));
    System.out.println(parenBit("x(hello)"));
    System.out.println(parenBit("(xy)1"));

  }

}
