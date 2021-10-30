/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/

public class catDog {

  public static boolean catDog(String str) {
    int catCount = 0;
    int dogCount = 0;
    for (int i = 0; i + 3 <= str.length(); i++){
      if (str.substring(i, i+3).equals("cat")) {
        catCount++;
      }
      if (str.substring(i, i+3).equals("dog")) {
        dogCount++;
      }
    }
    return catCount == dogCount;
  }

  public static void main(String args[]) {
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
  }
}
