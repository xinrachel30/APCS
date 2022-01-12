// kleex -- Lindsay Phung and Xinqing Lin
// APCS pd07
// HW55: Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 1.2 hrs
//
// DISCO
// - Amortized time is the average time undergone by each operation in the case that
//   multiple operations are done.
//
// QCC
// - How much does big O notation / time complexity correlate to the number of
//   nested for loops?

 import java.util.ArrayList;

 public class OrderedArrayList
 {

   // instance of class ArrayList, holding objects of type Integer
   // (i.e., objects of a class that implements interface Integer)
   private ArrayList<Integer> _data;


   // default constructor
   // initializes instance variables
   public OrderedArrayList()
   {
     _data = new ArrayList<Integer>();
   }


   //pass-tru functionality
   public String toString()
   {
     return _data.toString();
   }

/*
best-case scenario: the element being removed is the last element of the OrderedArrayList
big o notation: O(1)
explanation: no elements will have to be shifted. the only other operation done is
decreasing _size.

worst-case scenario: the element being removed is the first element of the OrderedArrayList
big o notation: O(n)
explanation: all elements succeeding the first element will have to be shifted to
the left. the number of elements shifted depends on the size of the array.
*/
   //pass-tru functionality
   public Integer remove( int index )
   {
     return _data.remove(index);
   }

/*
there is no best or worst case scenario
big o notation: O(1)
explanation: the only operation done is returning the instance variable _size
*/
   //pass-tru functionality
   public int size()
   {
     return _data.size();
   }

/*
there is no best or worst case scenario
big o notation: O(1)
explanation: the only operation done is returning the element at the inputted index
*/
   //pass-tru functionality
   public Integer get( int index )
   {
     return _data.get(index);
   }

/*
best-case scenario: the position indicated is the last index in the OrderedArrayList
big o notation: O(1)
explanation: no elements will have to be shifted. the only other operation done is
increasing _size.

worst-case scenario: the position indicated is the first index of the OrderedArrayList
big o notation: O(n)
explanation: all elements succeeding the first element will have to be shifted to
the right. the number of elements shifted depends on the size of the array.
*/
   //modified functionality
   //insert at appropriate location to maintain sortedness
   public boolean add( Integer newVal )
   {
     //call exactly 1 of the helper methods below...  your favorite?

     addLinear(newVal);
     //addBinary(newVal);
     return true;
   }

/*
there is no best or worst case scenario.
big o notation: O(n)
explanation: if newVal is less than the least element in the OrderedArrayList,
it will still be O(n) because add() will push every element to the right.
If newVal is greater than the greatest element in the OrderedArrayList, the entire
array will have to be traversed and the elements compared to newVal before appending
it.
*/
   // inserts newVal at the appropriate index
   // maintains ascending order of elements
   // uses a linear search to find appropriate index
   public void addLinear(Integer newVal)
   {
     for( int p = 0; p < _data.size(); p++ ) {
       if ( newVal.compareTo( _data.get(p) ) < 0 ) {
         //newVal < oal[p]
         _data.add( p, newVal );
         return; //Q:why not break?
       }
     }
     _data.add( newVal ); //newVal > every item, so add to end
   }

/*
best-case scenario: newVal is the element whose value is less than half of the
elements and more than half of the elements in the OrderedArrayList -- essentially
the "middle number"
big o notation: O(n)
explanation: addBinary would find the median index by adding the low and high indices
and dividing it by 2. with the newVal being the same value as the median, the program would
proceed to add the newVal at that index. the elements suceeding the newVal would be thusly shifted.

worst-case scenario: newVal is smaller than the smallest element in the OrderedArrayList
or greater than the greatest element in the OrderedArrayList
big o notation: O( log_2 (n) )
explanation: addBinary repeatedly compares the medium value to newVal and splitting
the OrderedArrayList into halves, thereby making it faster at narrowing down the appropriate
position while looking through larger arrays. Since we split the array into 2 halves
every "pass", log_2 is big O of n.
*/
   // inserts newVal at the appropriate index
   // maintains ascending order of elements
   // uses a binary search to find appropriate index
   public void addBinary(Integer newVal)
   {
     //initialize high, low, midpt indices
     int lo = 0;
     int med = 0;
     int hi = _data.size()-1;

     while ( lo <= hi ) { //running until target is found or bounds cross

       med = (lo + hi) / 2;
       int x = _data.get(med).compareTo( newVal );

       if ( x == 0 ) {
         //equal value found, insert here
         _data.add( med, newVal );
         return;
       }
       else if ( x > 0 )
         //newVal < med, so look at lower half of data
         hi = med - 1;
       else
         //newVal > med, so look at upper half of data
         lo = med + 1;
     }
     // If you made it this far, newVal is not present.
     // So insert at lo.
     _data.add( lo, newVal );
     //Q: How do you know lo is correct insertion index?
   }


   // main method solely for testing purposes
   public static void main( String[] args )
   {

     OrderedArrayList franz = new OrderedArrayList();

     // testing linear search
     for( int i = 0; i < 15; i++ )
       franz.addLinear( (int)( 50 * Math.random() ) );
     System.out.println( franz );

     // testing binary search
     franz = new OrderedArrayList();
     for( int i = 0; i < 15; i++ )
       franz.addBinary( (int)( 50 * Math.random() ) );
     System.out.println( franz );

     /*-----v-------move-me-down-----------------v--------
       =====^====================================^=========*/

   }//end main()

 }//end class OrderedArrayList
