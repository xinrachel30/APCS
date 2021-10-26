/***
 Blue Sushi - Lawrence Joa, Xinqing Lin
 APCS
 HW24 -- Get It While You Can / this(), .equals(), and using while loops
 2021-10-25
 time spent: 1.0 hours
 DISCO:
 .equals() can be used to compare two objects.

 QCC:
 For the first while loop, it's possible to get x + 1 instead of x flips before the while loop terminates because there's two flips in the body of code.
 Why is there a this() and this(s) in the 2 overloaded Coin methods? What do they do?

 POST-v0 MODS:
 We used the reset method in the default constructor. We also used .equals() to simplify the code in our assignValue() and equals() methods.
 ***/

 public class Driver {

  public static void main( String[] args ) {
  	Coin yours = new Coin("quarter");
  	Coin wayne = new Coin("dollar", "heads");
    int x = 5;
    int y = 5;
	while (yours.headsCtr + wayne.headsCtr < x){
		yours.flip();
    wayne.flip();
		}
  System.out.println(yours.headsCtr);
  System.out.println(wayne.headsCtr);
	yours.reset("heads", 0.5);
  wayne.reset("heads", 0.5);

    int match = 0;
	while (match < y){
		yours.flip();
		wayne.flip();
    if ( yours.equals(wayne) ) {
      match++;
    }
	}
  System.out.println(match);
	yours.reset("heads", 0.5);
	wayne.reset("heads", 0.5);
	 int match2 = 0;
	while (match2 <= 65536 || match2%2005 != 0) {
		yours.flip();
		wayne.flip();
    if ( yours.equals(wayne) ) {
      match2++;
		}
  }
  System.out.println(match2);
  }//end main()

}//end class
