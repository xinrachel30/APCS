public class Loops {
  public static void main(String [] args){
    System.out.println(power(2, 5));
    System.out.println(factorial(4));
    System.out.println(myexp(1, 17));
    System.out.println(check(1));
    double i;
    for (i = 0.1; i <= 100.0; i *= 10) {
        System.out.println();
        System.out.println(check(i)); // The accuracy of the result decreases as x increases.
        System.out.println(Math.exp(i)); // The number of digits of agreement decreases as x increases.
    }
    for (i = -0.1; i >= -100.0; i *= 10) {
        System.out.println();
        System.out.println(check(i)); // The accuracy of the result decreases as x decreases.
        System.out.println(Math.exp(i)); // The number of digits of agreement decreases as x decreases.
    }
  }
  public static double power(double x, int n){
    int i = 0;
    double ans = 1;
    while (i < n) {
      ans *= x;
      i ++;
    }
    return ans;
  }
  public static double factorial(int n){
    double ans = 1;
    while (n > 0){
      ans *= n;
      n --;
    }
    return ans;
  }
  public static double myexp(double x, int n){
    double ans = 0;
    int i;
    double numerator = 1.0;
    double denominator = 1.0;
    for (i = 1; i <= n; i ++) {
        double value = (numerator / denominator);
        ans += value;
        numerator *= x;
        denominator *= i;
    }
    return ans;
  }
  public static String check(double x){
    return x + "   " + myexp(x, 17) + "   " + Math.exp(x);
  }
}
