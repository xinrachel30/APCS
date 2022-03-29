/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW84 -- Stack: What Is It Good For?
2022-03-28
time spent: 0.7 hr
*/

/*
DISCO
-

QCC
- We can't directly do if (current.equals(")") && !stack.pop().equals("(")) because
  it will end up adding the closing paren to the stack. Is there another way to
  simplify our code?
- For allMatched, it can't directly return true after the for loop because
  there could still be opening parens at the end of the String
*/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {      //puts all the letters in the stack
      stack.push(s.substring(i, i+1));
    }
    String ret = "";
    for (int i = 0; i < s.length(); i++) {      //takes the letters out and puts them in String ret
      ret += stack.pop();
    }
    return ret;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String current = s.substring(i, i+1);
      if (current.equals(")")) {                //for each type: if there's a closing paren,
        if (!stack.pop().equals("(")) {         //check if there's an accompanying opening paren in stack
          return false;                         //if not, return false
        }
      }
      else if (current.equals("]")) {
        if (!stack.pop().equals("[")) {
          return false;
        }
      }
      else if (current.equals("}")) {
        if (!stack.pop().equals("{")) {
          return false;
        }
      }
      else {
        stack.push(current);                    //if it's an opening paren, add to stack
      }
    }
    return stack.isEmpty();                     //checks if there are any opening parens left
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed")); //desserts
    System.out.println(flip("desserts")); //stressed
    System.out.println(flip("snoops")); //spoons

    System.out.println("--");

    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
