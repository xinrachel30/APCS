/*
Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
APCS Pd 7
HW41 -- Be Rational
2021-12-01
time spent: 0.5 hrs

DISCO:
- The protected keyword allows objects to access the attributes of other objects

QCC:
- You can multiply an int by 0.1 to make it a floating point value.
*/

public class Rational {
  protected int numerator;
  protected int denominator;

  public Rational() {
    numerator = 0;
    denominator = 1;
  }

  public Rational(int p,int q) {
    if (q == 0) {
        System.out.println("That's not a valid denominator!");
        numerator = 0;
        denominator = 1;
    }
    else {
        numerator = p;
        denominator = q;
    }
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  public double floatValue() {
      return (numerator * 0.1) / (denominator * 0.1);
  }

  public void multiply(Rational a) {
      numerator = numerator * a.numerator;
      denominator = denominator * a.denominator;
  }

  public void divide(Rational a) {
      if (a.numerator == 0) {
        System.out.println("You can't divide by 0!");
      }
      else {
        numerator = numerator * a.denominator;
        denominator = denominator * a.numerator;
      }
  }

  public static void main(String [] args){
    Rational q = new Rational(1,0);
    Rational r = new Rational(2,3);
    Rational s = new Rational(1,2);

    System.out.print("fractions: \n");
    System.out.println(q);
    System.out.println(r);
    System.out.println(s);

    System.out.print("as floating values: \n");
    System.out.println(q.floatValue());
    System.out.println(r.floatValue());
    System.out.println(s.floatValue());

    System.out.print("multiplying q & r: \n");
    q.multiply(r);
    System.out.println(q);
    System.out.println(r);

    System.out.print("multiplying r & s: \n");
    r.multiply(s);
    System.out.println(r);
    System.out.println(s);

    System.out.print("dividing q by r: \n");
    q.divide(r);
    System.out.println(q);
    System.out.println(r);

    System.out.print("dividing r by q: \n");
    r.divide(q);
    System.out.println(r);
    System.out.println(q);
 }
}
