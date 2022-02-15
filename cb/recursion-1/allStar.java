/*
Ramen - May Qiu and Xinqing Lin
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr
*/

/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
*/

public class allStar {

  public static String allStar(String str) {
    if(str.length() <= 1){
      return str;
    }
    return allStar(str.substring(0,str.length()/2)) + "*" + allStar(str.substring(str.length()/2));
  }

  public static void main(String[] args) {
    System.out.println(allStar("hello"));
    System.out.println(allStar("abc"));
    System.out.println(allStar("ab"));


}

}
