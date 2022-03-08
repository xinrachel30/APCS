// Jinx -- Nora Miller, Josiah Moltz, and Xinqing Lin
// APCS pd6
// HW71 -- Whut Dis.
// 2022-03-07
// time spent: 0.7 hrs

/*
DISCO
* We can use find all + replace all to replace a variable/method name that we would like to replace

QCC
* Josiah wanted to name it Moses instead of partitionator

q0: What does it do?
  Separate part (a -> bi) of an array into 2 parts, one with elements less than v and one with elements greater than v

q1: What is its Big-Oh runtime?
  Depends on the values of a and b. At most, this is O(n) where n is the length of the array.

*/

public class Mysterion {

/*
partitionator will return an array where
  all elements before arr[c] are less than arr[c],
  and all elements after arr[c] are greater than arr[c].
arr: represents an array
start (a): starting index for where we look
end (b): ending index for where we look
partition (c): index of v
  v: value we will use to split the array into numbers greater than it and numbers less than it
*/
  public static void partitionator(int[] arr, int start, int end, int partition) {
    int v = arr[partition];
    arr[partition] = arr[end];
    arr[end] = v;
    int s = start;
    for (int i = start; i < end; i++) {
      if (arr[i] < v) {
        int temp = arr[i];
        arr[i] = arr[s];
        arr[s] = temp;
        s += 1;
      }
    }
    int temp2 = arr[s];
    arr[s] = arr[end];
    arr[end] = temp2;
  }

  public static void print(int[] arr) {
    System.out.print("[");
    for (int i : arr) {
      System.out.print(i + ",");
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    int[] arr0 = {7, 1, 5, 12, 3};
    partitionator(arr0, 0, 4, 2);
    print(arr0); // {1, 3, 5, 12, 7} everything before 5 is <5, everything after 5 is >5

    int[] arr1 = {1, 3, 5, 7, 12};
    partitionator(arr1, 0, 4, 2);
    print(arr1); // {1, 3, 5, 7, 12} everything before 5 is <5, everything after 5 is >5

    int[] arr2 = {12, 7, 5, 3, 1};
    partitionator(arr2, 0, 4, 2);
    print(arr2); // {1, 3, 5, 7, 12} everything before 5 is <5, everything after 5 is >5

    int[] arr3 = {7, 1, 5, 12, 3};
    partitionator(arr3, 0, 4, 3);
    print(arr3); // {7, 1, 5, 3, 12} everything before 12 is <12, everything after 12 is >12

    int[] arr4 = {7, 1, 12, 5, 3};
    partitionator(arr4, 0, 4, 2);
    print(arr4); // {7, 1, 3, 5, 12} everything before 12 is <12, everything after 12 is >12

    int[] arr5 = {7, 1, 12, 5, 3};
    partitionator(arr5, 0, 4, 3);
    print(arr5); // {7, 1, 3, 5, 12} everything before 5 is <5, everything after 5 is >5

    int[] arr6 = {7, 12, 1, 5, 3};
    partitionator(arr6, 0, 4, 2);
    print(arr6); // {1, 12, 3, 5, 7} everything before 1 is <1, everything after 1 is >1

    int[] arr7 = {7, 12, 1, 5, 3};
    partitionator(arr7, 3, 4, 3);
    print(arr7); // {7, 12, 1, 3, 5} elements at index 3 up to 5 are less than 5

    int[] arr8 = {2, 7, 5, 1, 3};
    partitionator(arr8, 3, 4, 4);
    print(arr8); // {2, 7, 5, 1, 3} elements at index 4 up to 5 are less than 4

    int[] arr9 = {2, 42, 3, 5, 91, 34, 88, 22, 153};
    partitionator(arr9, 0, 8, 4);
    print(arr9); // {2, 42, 3, 5, 34, 88, 22, 91, 153}
  }

}
