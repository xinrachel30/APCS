/*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

public class countCode {

  public static int countCode(String str){
    int count = 0;
    for (int i = 0; i + 4 <= str.length(); i++) {
      if (str.substring(i, i+2).equals("co") && str.substring(i+3,i+4).equals("e")) {
        count ++;
      }
    }
    return count;
  }

  public static void main(String args[]){
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
  }

}
