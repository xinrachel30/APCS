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

    cakes.push("courtney");
    cakes.push("brianna");
    cakes.push("jeffery");
    cakes.push("mykolyk");
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();

    System.out.println(cakes.isEmpty());

    cakes.pop();
    cakes.pop();

    System.out.println(cakes.isEmpty());

    //...

  }//end main

}//end class
