/* 
HorseSoup (Xinqing Lin (Horse) and Paul Serbanescu (Soup))
APCS
HW13 -- Where do BigSibs Come From? / Using Constructors
2021-10-06
*/

/*
DISCO:
- Using a constructor eliminates the need for setHelloMsg.
- The constructor must have the class name after the protection type.

QCC:
- None
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
