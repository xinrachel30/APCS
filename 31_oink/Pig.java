/***
 * The Cats: Perry Huang, Xinqing Lin, Faiyaz Rafee
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay/Not a Pig Latin Translator/
 * Detecting vowels, printing them, counting them, etc
 * 2021-11-03
 * time spent: 0.8 hrs
 * DISCO
 * We can use methods inside methods
 * QCC
 * Can we optimize our code more?
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/
public class Pig {

  //Q: How does this initialization make your life easier?
  //A: It gives us vowels so we can use that to detect vowels
  //and end the pig latin when one vowel is detected.

  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
      if (w != "" && letter.length() == 1) {
          for (int i = 1; i < w.length() + 1; i++) {
              if (w.substring(i - 1, i).equals(letter)) {
                  return true;
              }
          }
      }
      return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) {
      if (letter.length() == 1){
          return hasA(VOWELS, letter);
            }
    return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int count = 0;
    if (w != "") {
        for (int i = 1; i < w.length() + 1; i++) {
            if (isAVowel(w.substring(i - 1, i))) {
                count++;
            }
        }
    }
    return count;
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
      return (countVowels(w) > 0);
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    int count = 0;
    String result = "";
    if (w != "") {
        for (int i = 1; i < w.length() + 1; i++) {
            if (isAVowel(w.substring(i - 1, i))) {
                result = result + w.substring(i - 1, i);
            }
        }
    }
    return result;
  }


  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "a"));  //true
    System.out.println(hasA("cat", "p"));  //false
    System.out.println(hasA("cat", "aa")); //false
    System.out.println(hasA("caat", "aa"));//false
    System.out.println(hasA("caat", "a")); //true
    System.out.println(isAVowel("e"));
    System.out.println(isAVowel("a"));
    System.out.println(isAVowel("a"));
    System.out.println(countVowels("abababa"));
    System.out.println(countVowels("vessel"));
    System.out.println(allVowels("rhythm"));
    System.out.println(allVowels("parasite"));
}//end main()

}
