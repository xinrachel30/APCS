/***
 * Lenovo: Lea Kwok, Xinqing Lin, Raven (Ruiwen) Tang
 * APCS
 * L00: Etterbay Odingcay Oughthray Ollaborationcay
 * 2021-11-09
 * time spent: 2.0hrs
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

/***
DISCO:
- accomplished by v1:
	- fulfills general rules (moves leading consonant to end of word, appends "ay" OR appends "way" if word begins with vowel)
	- hasAVowel works as expected
	- translator can handle words that begin with a capital consonant
	- translator can handle punctuation (to a limited extent)
- y is a vowel when appropriate. when it is the first letter of a word, it is a consonant, and when it is in the middle of a word, it is a vowel.
- in the firstVowel method, we need to check hasAVowel first, because if the inputted string does not have any vowels, allVowels(w) will return an empty string, and attempting to find a substring of this empty string would create an index out of range error.
- We can use whole files as input. From Piazza post 249, we learned about what the direction of the arrow does.
- Indenting is important. We were confused because there were many if/else statements nested inside each other, and editing the wrong one lead to errors.
- (From our Piazza comment on post 250) We're Team Lenovo of pd7. While we didn't run into the same issue, we had problems pushing to our work repo because of unmerged files. Something that should work when git issues happen is cloning your work repository onto your local machine again under a separate name. Then, you can use this new version for the future and refer back to the old local copy if you ever need something.
QCC:
- Properly indenting code can help make the code more readable and more easily traced.
- We set a time limit for ourselves to work on one issue, and then move onto the next after. It's helpful for keeping ourselves on track and aware of how much time we're spending on this.
- How can we improve the code for engToPig() so that it's cleaner and more efficient?
- We rearranged the to-do list priority so that we could incorporate Scanner functionability after our translator had more functions.
- Could we use helper methods in engToPig()?
HOW WE UTILIZED SCANNER DEMO (v3):
- We augmented the DemoScanner.java in our main method to use engToPig() on stream input.
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO:
- The while loop tries to echo back the input, but it outputs 2 for each input. It will output more than it inputs, and soon run out of elements to reference.
NEW IN v3:
- incorporate Scanner functionality
- deal with capital vowels (not considered vowels as of now) and words starting with capitals
- deal with punctuation at the end of a word
- deal with y (both capital and lowercase and when it should be treated as a vowel)
***/

import java.util.Scanner;

public class Pig {

  private static final String VOWELS = "aeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";


  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;

    /* equiv code, wo using indexOf()...
       boolean ans = false;
       for( int i = 0; i < w.length(); i++ ) {
       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
	//A: perhaps it could be done recursively? base case would be when length of w is equal to 1, and recursive case would involve calling hasA for a substring of w. not sure if this is more efficient though...
       }
       }
       return ans;
    */
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter.toLowerCase() ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {

    return allVowels(w).length();

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {
       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    return (countVowels(w) > 0);
  }


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
	//A: for there to be a first vowel, there must be vowels in the string. if w had no vowels, then allVowels(w) would return an empty string, and trying to find the substring(0,1) would create an index out of range error.
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPig( String w ) {

    String ans = "";
    String punc = w.substring(w.length()-1);

    if ( beginsWithVowel(w) && !((w.substring(0,1).toLowerCase()).equals("y")) ){
      if(isPunc(punc)){
         ans = w.substring(0,w.length()-1) + "way" + punc;
      }
      else {

        ans = w + "way";
      }
    }
    else {

      if(isPunc(punc)){
          if( beginsWithUpper(w)){
            int vPos = w.indexOf( firstVowel(w) );
            if((w.substring(0, 1).toLowerCase()).equals("y")){
                vPos = w.indexOf(firstVowel(w.substring(w.indexOf("Y")+1)));
            }
            ans = w.substring(vPos,vPos+1).toUpperCase() + (w.substring(vPos+1,w.length()-1) + w.substring(0, vPos) + "ay" + punc).toLowerCase();
      }
      else{

            int vPos = w.indexOf( firstVowel(w) );
            if((w.substring(0, 1).toLowerCase()).equals("y")){
                vPos = w.indexOf(firstVowel(w.substring(w.indexOf("y")+1)));
            }
            ans = w.substring(vPos,w.length()-1) + w.substring(0,vPos) + "ay" + punc;
        }
      }
      else {
          if( beginsWithUpper(w)){
            int vPos = w.indexOf( firstVowel(w) );
            if((w.substring(0, 1).toLowerCase()).equals("y")){
                vPos = w.indexOf(firstVowel(w.substring(w.indexOf("Y")+1)));
            }
            ans = w.substring(vPos,vPos+1).toUpperCase() + (w.substring(vPos+1) + w.substring(0, vPos) + "ay").toLowerCase();
            }
            else{
                int vPos = w.indexOf( firstVowel(w) );
                if((w.substring(0, 1).toLowerCase()).equals("y")){
                        vPos = w.indexOf(firstVowel(w.substring(w.indexOf("y")+1)));
                }
                ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
                }
        }
    }


    return ans;
  }
  /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
	return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
	return CAPS.indexOf(letter) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false
      =====================================*/
    public static boolean hasPunc( String w ) {
	for(int i = 0; i < w.length(); i++){
		if(isPunc(w.substring(i, i+1))){
			return true;
		}
	}
	return false;
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {

	return isUpperCase(w.substring(0,1) );
    }

  public static void main( String[] args ) {

    /* for( String word : args ) {
      System.out.println( "allVowels \t" + allVowels(word) );
      System.out.println( "firstVowels \t" + firstVowel(word) );
      System.out.println( "countVowels \t" + countVowels(word) );
      System.out.println( "engToPig \t" + engToPig(word) );
      System.out.println( "hasPunc \t" + hasPunc(word) );
      System.out.println( "beginsWithUpper \t" + beginsWithUpper(word));
      System.out.println( "---------------------" );
    } */
    //instantiate a Scanner with STDIN as its bytestream
    Scanner sc = new Scanner( System.in );
        while( sc.hasNext() ) {
            System.out.println( engToPig(sc.next()) );
            }

      /* System.out.println(isPunc(":"));
      System.out.println("should be true");
      System.out.println(isPunc("I"));
      System.out.println("should be false");
      System.out.println(isUpperCase("A"));
      System.out.println("should be true");
      System.out.println(isUpperCase("b"));
      System.out.println("should be false"); */
  }//end main()

}//end class Pig
