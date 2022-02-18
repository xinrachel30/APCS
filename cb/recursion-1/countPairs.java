/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
*/

public class countPairs{

  public static int countPairs(String str) {
    if (str.length() < 3) {
      return 0;
    }
    if (str.substring(0,1).equals(str.substring(2,3))) {
      return 1 + countPairs(str.substring(1));
    }
    return countPairs(str.substring(1));
  }

  public static void main(String[] args) {
    System.out.println(countPairs("axa"));
    System.out.println(countPairs("axax"));
    System.out.println(countPairs("axbx"));

  }

}
