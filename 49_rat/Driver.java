/*s
Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
APCS Pd 7
HW49 -- Rational Standards Compliance
2021-12-22
time spent: 1 hr

DISCO:
- We can use instanceof to see if an object is an instance of a class
- We can use throw to send an exception error
- We can typecast using (objectName)anotherObject

QCC:
-

*/

public class Driver {

	public static void main(String[] args) {
		String s = "random";
		Rational r = new Rational( 4, 5 );
		Rational q = new Rational( 4, 5 );
		Rational w = new Rational( 1, 2 );
		System.out.println("Comparing r (4/5) with q (4/5)...");
		System.out.println(r.compareTo(q));
		System.out.println(r.equals(q));
		System.out.println("Comparing r (4/5) with w (1/2)...");
		System.out.println(r.compareTo(w));
		System.out.println(r.equals(w));
		System.out.println("Comparing r (4/5) with s 'random'...");
		System.out.println(r.compareTo(s));
	}

}
