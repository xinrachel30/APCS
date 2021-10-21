/*
   "The Cats" : Faiyaz Rafee, Xinqing Lin, Perry "the platypus" Huang
   APCS pd07
   HW21 -- STAtisTically Speaking...
   2021-10-20
   DISCO:
   You cannot convert double to int without typecasting.
   QCC:
   How do you do int geoMean without using typcasting?
*/

public class StatsDriver{

  public static void main(String[] args) {

    System.out.println(Stats.mean(0, 0));             // expecting... 0
    System.out.println(Stats.mean(7, 7));             // expecting... 7
    System.out.println(Stats.mean(-2, -4));           // expecting... -3
    System.out.println(Stats.mean(2, 4));             // expecting... 3
    System.out.println(Stats.mean(0.4, 0.2));         // expecting... 0.3
    System.out.println(Stats.max(0, -1));             // expecting... 0
    System.out.println(Stats.max(-99, -30));          // expecting... -30
    System.out.println(Stats.max(2, 4));              // expecting... 4
    System.out.println(Stats.max(0.4, 0.2));          // expecting... 0.4
    System.out.println(Stats.geoMean(6, 6));          // expecting... 6
    System.out.println(Stats.geoMean(0, 0));          // expecting... 0
    System.out.println(Stats.geoMean(9, 1));          // expecting... 3
    System.out.println(Stats.geoMean(-1, 1));         // expecting... error
    System.out.println(Stats.geoMean(-1, -1));        // expecting... 1
    System.out.println(Stats.geoMean(0.5, 72.0));     // expecting... 6
    System.out.println(Stats.max(1, 3, -4));          // expecting... 3
    System.out.println(Stats.max(-0.3, 2.3, 6.9));    // expecting... 6.9
    System.out.println(Stats.geoMean(3, 9, 1));       // expecting... 3
  }

}
