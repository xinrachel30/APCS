import java.util.Random;
public class Arrays {
  public static void main(String [] args){
    double[] example = new double[]{1, 2, 3, 4};
    // printArray(powArray(example, 3));
    Random random = new Random();
    int[] example2 = new int[50];
    for (int i = 0; i < example2.length; i++) {
        example2[i] = random.nextInt(100);
      }
    printArray(example2);
    printArray(histogram(example2, 4));
    System.out.println(indexOfMax(example2));
    printArray2(sieve(21));
  }

  public static void printArray (int[] a) {
    if (a.length == 0){
      System.out.println("{}");
      return;
    }
    System.out.print("{");
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print(a[i] + ", ");
    }
    System.out.println(a[a.length - 1] + "}");
  }
  public static void printArray2 (boolean[] a) {
    if (a.length == 0){
      System.out.println("{}");
      return;
    }
    System.out.print("{");
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print(a[i] + ", ");
    }
    System.out.println(a[a.length - 1] + "}");
  }

  // public static double[] powArray(double[] a, double p){
  //   for (int i = 0; i < a.length; i++) {
  //     a[i] = Math.pow(a[i], p);
  //   }
  //   return a;
  // }
  public static int inRange(int[] a, int low, int high){  // from book
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= low && a[i] < high) {
            count++;
        }
    }
    return count;
}

  public static int[] histogram(int[] a, int counters){
    int[] answer = new int[counters];
    int range = 100 / counters;
    int index = 0;
    for (int i = 0; i < 100; i += range) {
      answer[index] = inRange(a, i, i + range);
      index ++;
    }
    return answer;
  }

  public static int indexOfMax(int[] a) {
    int largest = 0;
    int i;
    for (i = 0; i < a.length; i ++) { // You can't solve this problem using an enhanced for loop because you need to know the specific index.
      if (a[i] > largest) {
        largest = i;
      }
    }
    return largest;
  }

  public static boolean[] sieve(int n){
    boolean[] A = new boolean[n];
    for (int t = 2; t < A.length; t++) {
        A[t] = true;
    }
    
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (A[i]) {
        for (int j = i * i; j < n; j += i) {
          A[j] = false;
        }
      }
    }
    return A;
  }
    }
