/*
Duolingo -- Courtney Huang, Brianna Tieu, and Xinqing Lin
APCS
HW73 -- All About the About Face
2022-03-09
time spent: 1.3 hrs
*/

public class QuickSelect {

  public static int quickSelect(int[] arr, int start, int end, int y){

  int randomPos = (int)(Math.random() * (end - start)) + start;
  int currentPos = partition(arr, start, end, randomPos);

  if (currentPos == y-1) {
    return arr[currentPos];
  }
  else if (currentPos > y-1) {
    return quickSelect(arr, start, currentPos - 1, y);
  }
  else {
    return quickSelect(arr, currentPos + 1, end, y);
  }

//
  // int currentPos = partition(arr, start, end, y);
  //
  // if (currentPos == y-1) {
  //   return arr[currentPos];
  // }
  // else if (currentPos > y-1) {
  //   return quickSelect(arr, start, currentPos-1, y-1);
  // }
  // else {
  //   return quickSelect(arr, currentPos+1, end, y+1);
  // }

  }

  public static int partition( int[] arr, int a, int b, int c)
{
  int v = arr[c];

  swap( c, b, arr);
  int s = a;

  for( int i = a; i < b; i++ ) {
    if ( arr[i] <= v) {
      swap( i, s, arr );
      s++;}
  }
  swap(s,b,arr);

  return s;
}

public static void swap( int x, int y, int[] o )
{
  int tmp = o[x];
  o[x] = o[y];
  o[y] = tmp;
}

public static void print(int[] arr) {
  System.out.print("[");
  for (int i : arr) {
    System.out.print(i + ",");
  }
  System.out.println("]");
}

  public static void main(String[] args) {
    // int[] arr1 = {1, 2, 3, 4, 5};
    // System.out.println(partition(arr1, 0, 2, 4));
    // print(arr1);
    //
    // int[] arr2 = {7, 1, 5, 12, 3};
    // System.out.println(partition(arr2, 0, 1, 3));
    // print(arr2);

    int[] arr3 = {7, 1, 5, 12, 3};
    print(arr3);
    System.out.println(quickSelect(arr3, 0, arr3.length - 1, 4));

    int[] arr4 = {22, 3, 4, 98, 5, 8, 2};
    print(arr4);
    System.out.println(quickSelect(arr4, 0, arr4.length - 1, 7));

    int[] arr5 = {7, 1, 5, 24, 56, 22, 16, 12, 3};
    print(arr5);
    System.out.println(quickSelect(arr5, 0, arr5.length - 1, 4));

    int[] arr6 = {7, 1, 5, 24, 56, 22, 16, 12, 3};
    print(arr6);
    System.out.println(quickSelect(arr6, 0, arr5.length - 1, 8));
   }

}
