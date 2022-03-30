/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    System.out.println("-- Adding to Stack --");

    System.out.println("isEmpty? : " + cakes.isEmpty());
    cakes.push("courtney");
    System.out.println(cakes.peekTop());
    cakes.push("brianna");
    System.out.println(cakes.peekTop());
    cakes.push("jeff");
    System.out.println(cakes.peekTop());
    cakes.push("mykolyk");
    System.out.println(cakes.peekTop());
    System.out.println("isEmpty? : " + cakes.isEmpty());

    System.out.println("\n-- Removing from Stack --");

    System.out.println("isEmpty? : " + cakes.isEmpty());
    System.out.println(cakes.pop());
    System.out.println(cakes.pop());
    System.out.println(cakes.pop());
    System.out.println(cakes.pop());
    System.out.println("isEmpty? : " + cakes.isEmpty());


    //...

  }//end main

}//end class
