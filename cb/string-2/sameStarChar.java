public class sameStarChar {
    public static boolean sameStarChar(String str) {
    for (int i = 1; i < str.length() - 1; i++){
        if (str.substring(i, i+1).equals("*")) {
            if (!(str.substring(i-1, i).equals(str.substring(i+1,i+2)))) {
                return false;
            }
        }
    }
    return true;
    }

    public static void main(String[] args){
      System.out.println(sameStarChar("*xa*az"));
    }
}