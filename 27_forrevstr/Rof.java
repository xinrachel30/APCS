/**
Team Green Ice Cream (Ivina Wang, Xinqing Lin, Michael Kamela)
APCS
HW27 -- FOR the Love of Strings / Using s.substring() and s.length() from the AP Subset
2021-10-28
time spent: 0.75 hours

DISCO:
- s.substring(a, b) takes the a-b letters from a string; ex. substring(0,1) of "stressed" takes s
- s.length() takes the number of characters in a string (as an int)
- there is a difference between a += b and a = b + a when you use it with Strings?

QCC:
- how do you code reverseR?
    //how do you make it better

*/
public class Rof{

    public static String fenceF(int posts){
        String fence = " ";
        for (int i=0; i<=posts; i++){
            if (i == 1){
            fence = "|";
            }
            else {
            fence += "--|";
            }
        }
        return fence;
    }

    public static String reverseF(String s){
        String rev = "";
    for (int i=0; i<s.length(); i++){
      rev = s.substring(i, i+1) + rev;
    }
        return rev;
    }


public static String reverseR(String s){
     String ree = "";
     if (s.length() == 1) {
         ree = s.substring(0,1);
         return ree;
     }
     else {
         ree = s.substring(s.length()-1,s.length());
         System.out.print(ree);
         return (reverseR(s.substring(0,s.length()-1)));
     }
    }


    public static void main(String[] args){
        System.out.println(fenceF(1));
        System.out.println(fenceF(3));
        System.out.println(reverseF("desserts"));
        System.out.println(reverseR("desserts"));
        System.out.println(reverseF("abcde"));
        System.out.println(reverseR("abcde"));
    }
}
