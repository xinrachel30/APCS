//note for StatsDriver.java : add System.out.println to everything

/*
   The Cats: Faiyaz Rafee, Xinqing Lin, Perry Huang
   APCS
   HW21 -- STAtisTically Speaking...
   2021-10-21
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   DISCO:
   We cannot convert from double to int without typecasting.
   Hanging out with friends consists of being in close physical proximity.
   QCC:
   How do you do int geoMean without using any form of typecasting?
 */

public class Stats {

  public static int mean(int a, int b) {
    return (a + b) / 2;
  }

  public static double mean(double a, double b) {
    return (a + b) / 2;
  }

  public static int max(int a, int b) {
    if (a >= b) {
    return a;
    }

    else {
    return b;
    }

  }

  public static double max(double a, double b) {
    if (a >= b) {
    return a;
    }

    else {
    return b;
    }

  }

/*  public static int geoMean(int a, int b) {
    double aa = (a * 1.0);
    double bb = (b * 1.0);
    double c = Math.sqrt(aa * bb);
    int cc = Math.round(c);
    return cc;
  }
*/
  public static double geoMean(double a, double b) {
    return Math.sqrt(a * b);
  }

  public static int max(int a, int b, int c) {
    if (a >= b && a >= c){
      return a;
    }
    if (b >= a && b >= c){
      return b;
    }
    else {
      return c;
    }
  }

  public static double max(double a, double b, double c) {

    if (a >= b && a >= c){
      return a;
    }
    if (b >= a && b >= c){
      return b;
    }
    else {
      return c;
    }
  }
/*
  public static int geoMean(int a, int b, int c) {
  }
*/
  public static double geoMean(double a, double b, double c) {
    return Math.cbrt(a * b * c);
  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
