/*
Duolingo -- Courtney Huang, Brianna Tieu, and Xinqing Lin
APCS
HW72 -- So So Fast
2022-03-08
time spent: 1.3 hrs
*/

/*
ALGO
1. Iterate through every element of the array.
2. Use partition() with that index being the pivot. If the position returned is equal to y - 1, then return the element at that index.

BEST CASE SCENARIO
  The yth smallest number is at index 0 of the array. The time complexity would be O(n)

WORST CASE SCENARIO
  The yth smallest number is at index array.length - 1 of the array (last index). The time complexity would be O(n^2)

DISCO
* Our idea did not work at first because partition changed the input array. Our idea
  only works if the input array is not changed. We fixed this by adding a deep copy
  to partition. This does not change the time complexity.
    * We tried to make a reference array by doing int[] refArr = arr and putting
      refArr in the partition method call. However, partition continued to directly
      change arr. We suspect this has to do with memory locations and references.

QCC
* Partition changed the original input array. However, Java is pass-by-value, which
  means that it should've changed a copy of the input array

*/

public class FastSelect {

  public static int fastSelect(int[] arr, int y){

    for (int i = 0; i < arr.length; i++) {

      if (partition(arr, 0, arr.length - 1, i) == y-1) {
        return arr[i];
      }
      else if (partition(arr, 0, arr.length - 1, i) > y-1){

      }

    }
    return -1;



  }

  public static int partition( int refArr[], int a, int b, int c)
{

  // int[] arr = new int[refArr.length];
  // for (int i = 0; i < arr.length; i++) {
  //   arr[i] = refArr[i];
  // }

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
    System.out.println(fastSelect(arr3, 3));

    int[] arr4 = {22, 3, 4, 98, 5, 8, 2};
    print(arr4);
    System.out.println(fastSelect(arr4, 6));
  }

}
