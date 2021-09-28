public class Time{
      public static void main(String[] args){
          int hour = 12;
          int minute = 30;
          int second = 54;
          System.out.print("Number of Seconds Since Midnight: ");
          int sinceMidnight = hour * 3600 + minute * 60 + second;
          System.out.println(sinceMidnight);
          System.out.print("Number of Seconds Remaining in the Day: ");
          System.out.println(24 * 3600 - sinceMidnight);
          System.out.print("Percentage of the Day that has Passed: ");
          System.out.println(sinceMidnight / (24.0 * 3600.0) * 100);
          System.out.print("Elapsed Time: ");
          int cHour = 12;
          int cMinute = 40;
          int cSecond = 2;
          int elaspedTime = cHour * 3600 + cMinute * 60 + cSecond - sinceMidnight;
          System.out.println(elaspedTime + " seconds");
      }
}
