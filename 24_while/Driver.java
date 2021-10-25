public class Driver {

  public static void main( String[] args ) {
  	Coin mine = new Coin();
  	Coin yours = new Coin("quarter");
  	Coin wayne = new Coin("dollar", "heads");
	while (headsCtr <= x){
		yours.flip();
		wayne.flip();
		}
		
		yours.reset("heads", 0.5);
		wayne.reset("heads", 0.5);
		
	while (flipCtr <= y){
		yours.flip();
		wayne.flip();
		}
		yours.reset("heads", 0.5);
		wayne.reset("heads", 0.5);
		
	while (flipCtr <= 65536 && flipCtr%2005 == 0) {
		yours.flip();
		wayne.flip();
		}
  }//end main()

}//end class
