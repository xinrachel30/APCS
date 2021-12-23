/*
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

public class Rational implements Comparable{
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
      this.numerator = this.numerator * a.numerator;
      this.denominator = this.denominator * a.denominator;
  }

  public void divide(Rational a) {
      if (a.numerator == 0) {
        System.out.println("You can't divide by 0!");
      }
      else {
        this.numerator = this.numerator * a.denominator;
        this.denominator = this.denominator * a.numerator;
      }
  }
  /*
  public static int lcm(int d1, int d2) {  // one way of implementing lcm
    int lcm = 0;
    if (gcd(d1, d2) == 1) {
      lcm = d1 * d2;
    }
    else if (d1 == d2) {
      lcm = d1;
    }
    else if (d1 > d2) {
      for (int i=0; d1 != d2; i++) {
        d2 += gcd(d1,d2);
        lcm = d2;
      }
    }
    else if (d2 > d1) {
      for(int i=0; d1 != d2; i++) {
        d1 += gcd(d1,d2);
        lcm = d1;
      }
      return lcm;
    }
    return lcm;
  }
*/
/*
  public static int lcm(int d1, int d2) {  // another way of implementing lcm
  int lcm;
  if (d1 >= d2) {
    lcm = d1;
    while (!(lcm % d2 == 0)) {
      lcm += d1;
    }
  }
  else {
    lcm = d2;
    while (!(lcm % d1 == 0)) {
      lcm += d2;
    }
  }
  return lcm;
}
*/

public static int lcm(int d1, int d2) {
  return d1 * d2 / gcd(d1, d2);
}

  public void add(Rational a) {
    int lcm = lcm(this.denominator, a.denominator);
    this.numerator = (this.numerator * (lcm / this.denominator)) + (a.numerator * (lcm / a.denominator));
    this.denominator = this.denominator * (lcm / this.denominator);
  }

  public void subtract(Rational a) {
    int lcm = lcm(this.denominator, a.denominator);
    this.numerator = (this.numerator * (lcm / this.denominator)) - (a.numerator * (lcm / a.denominator));
    this.denominator = this.denominator * (lcm / this.denominator);
  }

  public static int gcd(int p, int q) {
    int value = 1;
    int answer = p;
    if (p > q) {
      while (value < q) {
        if (((p % value) == 0) && (q % value) == 0) {
          answer = value;
        }
        value ++;
      }
    }
    else if (p < q) {
      while (value < p) {
        if (((p % value) == 0) && (q % value) == 0) {
          answer = value;
        }
        value ++;
      }
    }
    return answer;
  }

  public void reduce() {
    int value = gcd(this.numerator, this.denominator);
    this.numerator = (this.numerator / value);
    this.denominator = (this.denominator / value);
  }

  public int compareTo(Object o) {

    if (!(o instanceof Rational)) {
      throw new ClassCastException("\n compareTo() input not a Rational");
    }
    Rational a = (Rational) o;

    int mynum = this.numerator;
    int anum = a.numerator;
    if (this.denominator != a.denominator) {
      int lcm = lcm(this.denominator, a.denominator);
      mynum = this.numerator * lcm / this.denominator;
      anum = a.numerator * lcm / a.denominator;
    }
    if (mynum == anum) {
      return 0;
    }
    else if (mynum > anum) {
      return 1;
    }
    else {
      return -1;
    }
  }

  public boolean equals(Object o) {

    if (!(o instanceof Rational)) {
      throw new ClassCastException("\n compareTo() input not a Rational");
    }
    Rational a = (Rational)o;

    int mynum = this.numerator;
    int anum = a.numerator;
    if (this.denominator != a.denominator) {
      int lcm = lcm(this.denominator, a.denominator);
      mynum = this.numerator * lcm / this.denominator;
      anum = a.numerator * lcm / a.denominator;
    }
    if (mynum == anum) {
      return true;
    }
    return false;
  }

  public static void main(String [] args){
    /*
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
    */

    Rational r = new Rational(4,6);
    Rational s = new Rational(1,2);
    Rational t = new Rational(4,18);
    Rational r2 = new Rational(4,6);
    Rational s2 = new Rational(1,2);
    Rational t2 = new Rational(4, 18);
    Rational r3 = new Rational(4,6);
    Rational s3 = new Rational(1,2);
    Rational t3 = new Rational(4, 18);
    Rational x = new Rational(4,6);
    Rational y = new Rational(5,6);
    Rational z = new Rational(2,3);

    System.out.print("---------------- \n");

    System.out.print("add test cases \n");
    r.add(s);
    System.out.println("4/6 + 1/2: " + r);
    s.add(t);
    System.out.println("1/2 + 4/18: " + s);

    System.out.print("---------------- \n");

    System.out.print("subtract test cases \n");
    r2.subtract(s2);
    System.out.println("4/6 - 1/2: " + r2);
    s2.subtract(t2);
    System.out.println("1/2 - 4/18: " + s2);

    System.out.print("---------------- \n");

    System.out.print("gcd test cases \n");
    System.out.println("9 & 9: " + gcd(9, 9));
    System.out.println("5 & 9: " + gcd(5, 9));

    System.out.print("---------------- \n");

    System.out.print("reduce test cases \n");
    r3.reduce();
    System.out.println("4/6: " + r3);
    s3.reduce();
    System.out.println("1/2: " + s3);
    t3.reduce();
    System.out.println("4/18: " + t3);

    System.out.print("---------------- \n");

    System.out.print("compareTo test cases \n");
    System.out.println("4/6 compared to 5/6: " + r.compareTo(s));
    System.out.println("5/6 compared to 4/6: " + s.compareTo(r));
    System.out.println("5/6 compared to 2/3: " + s.compareTo(z));
    System.out.println("4/6 compared to 2/3: " + x.compareTo(z));

    System.out.print("---------------- \n");

    System.out.println(lcm(24, 27));
 }
}
