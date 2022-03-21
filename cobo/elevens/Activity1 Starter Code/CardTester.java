/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	  Card jeff = new Card("Q", "diamond", 12);
		Card may = new Card("3", "diamond", 3);
		Card rachel = new Card("K", "spades", 13);

		Card may2 = new Card("3", "diamond", 3);

		System.out.println(may.matches(may2));
		System.out.println(jeff.matches(may));

		System.out.println(may);
	}
}
