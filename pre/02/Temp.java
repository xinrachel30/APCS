import java.util.Scanner;

public class Temp {
  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    System.out.print("How many degrees in Celsius? ");
    double celsius;
    celsius = in.nextDouble();
    double fahrenheit = celsius * 9/5 + 32;
    System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
  }
}
