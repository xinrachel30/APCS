// Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS pd7
// HW43 -- Array of Steel / encapsulation (basic SuperArray functionality)
// 2021-12-06
// time spent: 0.66 hrs
//
// DISCO
// -
//
// QCC
// - We can increase the size of an array by making a new array and copying over the contents of the old array

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String _placer = "[";
    for (int i = 0; i < _size - 1; i++) {
      _placer += _data[i] + ", ";
    }
    _placer += _data[_size - 1] + "]";
    return _placer;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] _another = new int[_size * 2]; // makes new array with double the size
    for(int i = 0; i < _size; i++) { // copies over values from old array
      _another[i] = _data[i];
    }
    _size *= 2; // updt size
    _data = _another;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int oldVal = get(index);
    _data[index] = newVal;
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.print( "---------------- \n");
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.print( "---------------- \n");
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
        curtis.expand();
        System.out.print( "---------------- \n");
        System.out.println("Printing expanded SuperArray curtis...");
        System.out.println(curtis);
      }
      System.out.print( "---------------- \n");
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
