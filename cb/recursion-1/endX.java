/*
Ramen - May Qiu and Xinqing Lin
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr
*/

/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
*/

public class endX {

  public static String endX(String str) {
  if(str.length() < 2){
    return str;
  }
  if(str.substring(0,1).equals("x")){
    return endX(str.substring(1))+ "x";
  }
    return str.substring(0,1) + endX(str.substring(1));
}


  public static void main(String[] args) {
    System.out.println(endX("xxree"));
    System.out.println(endX("xxhixx"));
    System.out.println(endX("xhixhix"));

  }

}
