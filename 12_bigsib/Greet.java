/* 
MAX Swag (Xinqing Lin (Horse), Anjini Katari (Watson), and Michael Kamela (no duck yet))
APCS
HW12 -- Using instance variables
2021-10-05
*/

/*
DISCO:
- You can create a (instance) variable outside of a method that can be used by all methods. 
- In order to be able to use an instance variable, you have to make the methods nonstatic by deleting the static after each public. Otherwise, you get the error message: "error: non-static variable hellomsg cannot be referenced from a static context"

QCC:
- What is the difference between static and nonstatic?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
