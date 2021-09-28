public class CodingBat{
  public static void main(String [] args){
    System.out.println(force(2.0, 3.0, 4.0, 2.0));
  }
  public static double force(double g, double m1, double m2, double r){
    double force = (g * (m1 * m2)) / (r * r);
    return force;
}
  public double average3(int a, int b, int c){
    return (a + b + c)/3.0;
  }
  public double sumOfSines(double t){
    double value1 = Math.PI * 2 * t / 180;
    double value2 = Math.PI * 3 * t / 180;
    double sum = Math.sin(value1) + Math.sin(value2);
    return Math.round(sum * 1000.0) / 1000.0;
}
  public int oddsAreNegated (int x){
    if (x % 2 == 0){
      return x;
    }
    else {
      return x * -1;
    }
  }
  public int noTeenSum(int a, int b, int c) {
    a = fixTeen(a);
    b = fixTeen(b);
    c = fixTeen(c);
    return a + b + c;
}

public static int fixTeen(int n) {
  if (n < 13 || n > 19) {
    return n;
  }
  else if (n == 15 || n == 16) {
    return n;
  }
  else {
    return 0;
  }
}
public String stringTimes(String str, int n) {
  String answer = "";
  int i;
  for (i = 0; i < n; i ++){
    answer += str;
  }
  return answer;
}
public int countEvens(int[] nums) {
  int count = 0;
  for (int num : nums){
    if (num % 2 == 0) {
      count++;
    }
  }
  return count;
}
public boolean sum28(int[] nums) {
  int sum = 0;
  int i = 0;
  while (i < nums.length){
    if (nums[i] == 2) {
      sum += 2;
    }
    i ++;
  }
  return sum == 8;
}
public boolean scoresIncreasing(int[] scores) {
  int i;
  for (i = 0; i < scores.length - 1; i ++) {
    if (scores[i + 1] < scores[i]){
      return false;
    }
  }
  return true;
}
  }
