public class Methods {
  public static void main(String [] args) {
    System.out.println(isDivisible(12, 4));
    System.out.println(isDivisible(4, 3));
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(isTriangle(1, 12, 1));
    System.out.println(ack(3,3));
  }
  public static boolean isDivisible(int n, int m) {
    return n % m == 0;
  }
  public static boolean isTriangle(int x, int y, int z) {
    return (x < y + z) && (y < x + z) && (z < x + y);
  }
  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    } else if (m > 0 && n == 0) {
      return ack(m-1, 1);
    }
      else {
      return ack(m-1, ack(m, n-1));
    }
    }
  }
