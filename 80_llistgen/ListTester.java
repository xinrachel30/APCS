/***
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    //instantiate... var type List, obj type LList
    List wu = new LList();

    System.out.println(wu);
    wu.add("RZA");

    System.out.println(wu);
    wu.add("GZA");

    System.out.println(wu);
    wu.add("ODB");

    System.out.println(wu);
    wu.add("Inspectah Deck");

    System.out.println(wu);
    wu.add("Raekwon the Chef");

    System.out.println(wu);
    wu.add("U-God");

    System.out.println(wu);
    wu.add("Ghostface");

    System.out.println(wu);
    wu.add("Method Man");

    System.out.println(wu);

    for( int i=0; i<7; i++ ) {
      int n = (int)( wu.size() * Math.random() );
      String imposter = "@";
      System.out.println("adding imposter at index " + n + "...");
      wu.add( n, imposter );
      System.out.println("Updated list: " + wu);
    }

    while( wu.size() > 0 ) {
      int n = (int)( wu.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      wu.remove(n);
      System.out.println("Updated list: " + wu);
    }

    System.out.println("--------------------------------------------------------");

    LList<Integer> squirrel = new LList();
    squirrel.add(16);
    squirrel.add(19);
    squirrel.add(82);
    squirrel.add(7);
    squirrel.add(54);
    squirrel.add(93);
    squirrel.add(38);
    squirrel.add(23);

    System.out.println(wu);

    for (int i = 0; i < 7; i++) {
      int n = (int) ( squirrel.size() * Math.random() );
      int imposter = 0;
      System.out.println("adding imposter at index " + n + "...");
      squirrel.add( n, imposter );
      System.out.println("Updated list: " + squirrel);
    }

    while ( squirrel.size() > 0 ) {
      int n = (int) ( squirrel.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      squirrel.remove(n);
      System.out.println("Updated list: " + squirrel);
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
