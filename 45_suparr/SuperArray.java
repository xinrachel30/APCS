// Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS1 pd7
// HW45 -- Array of Titanium
// 2021-12-08
// time spent: 0.67 hrs
//
// DISCO
// - ListInt is an interface and thus can't be instantiated
//
// QCC
// - How do we know if we're testing SuperArray's methods or ListInt's?

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
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
    int temp = _data[index];
    _data[index] = newVal;
    _size++;
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
    if (_size + 1 > _data.length) {
      expand();
    }
    _data[_size] = newVal;
    _size++;
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    if (_size + 1 > _data.length) {
      expand();
    }
    if (index >= _size) {
      System.out.println("The index is greater than the size!");
    }
    _size++;
    for (int i = _size; i > index; i--){ // moves values to the right, starting with the rightmost value
      _data[i] = _data[i - 1];
    }
    _data[index] = newVal;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    for (int i = index; i < _size - 1; i++) { // moves values to the left, starting with the leftmost value
      _data[i] = _data[i + 1];
    }
    _data[_size] = 0;
    _size--;
  }


  //return number of meaningful items in _data
  public int size()
  {
    return _size;
  }



  //main method for testing
  public static void main( String[] args )
  {
    SuperArray ra = new SuperArray();
    ra.add(2);
    ra.add(3);
    ra.add(4);
    System.out.println("adding..." + ra);
    ra.add(1, 4);
    ra.add(2, 2);
    ra.add(3, 3);
    System.out.println("adding at index..." + ra);
    ra.remove(3);
    System.out.println("removing..." + ra);
    System.out.println("size..." + ra.size());
  }//end main()


}//end class
