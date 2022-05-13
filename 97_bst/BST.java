/**
RachelHateCult: Xinqing Lin, Jeffery Tang, May Qiu
APCS Pd 6
HW97 -- Prune Your Trees
2022-05-11
time spent: 2 hrs
/**

DISCO
* Finding the parent of the node that is to replace the removed node is more useful than the child node itself.

QCC
* We tried to use in-order traversal to find the values that could replace the node being replaced but the spaces in its output
made it difficult to use.

/**
 * class BST
 * v2:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else //recurse down left subtree
        insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else //recurse down right subtree
        insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~
  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  public String inOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += inOrderTravStr( currNode.getLeft() );
    retStr += " " + currNode.getValue();
    retStr += inOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String preOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += " " + currNode.getValue();
    retStr += preOrderTravStr( currNode.getLeft() );
    retStr += preOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String postOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += postOrderTravStr( currNode.getLeft() );
    retStr += postOrderTravStr( currNode.getRight() );
    retStr += " " + currNode.getValue();
    return retStr;
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //~~~~~~~~~~~~~v~~MISC.HELPERS~~v~~~~~~~~~~~~~~~~~~~
  public boolean isLeaf( TreeNode node )
  {
    return ( node.getLeft() == null
             &&
             node.getRight() == null );
  }
  //~~~~~~~~~~~~~^~~MISC.HELPERS~~^~~~~~~~~~~~~~~~~~~~


  //overridden toString
  public String toString()
  {
    return
      " pre-order trav:" + preOrderTravStr( _root ) + '\n' +
      "  in-order trav:" + inOrderTravStr( _root ) + '\n' +
      "post-order trav:" + postOrderTravStr( _root ) + '\n' +
      "         height: " + height() + '\n' +
      "     num leaves: " + numLeaves()
      ;
  }


  /**
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   */
  TreeNode search( int target )
  {
    return search( target, _root );
  }
  TreeNode search( int target, TreeNode currNode )
  {
    if ( currNode==null || currNode.getValue()==target )
      return currNode;
    else if ( target < currNode.getValue() )
      return search( target, currNode.getLeft() );
    else if ( target > currNode.getValue() )
      return search( target, currNode.getRight() );
    else
      return null; //to get past compiler
  }


  /**
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 0
   */
  public int height()
  {
    return height( _root );
  }
  //recursive helper for height()
  public int height( TreeNode currNode )
  {
    if ( currNode==null ) //Q: Why cannot use .equals() ?
      return 0;
    if ( isLeaf(currNode) )
      return 0;
    else //height is 1 for this node + height of deepest subtree
      return 1 + Math.max( height(currNode.getLeft()),
                           height(currNode.getRight()) );
  }


  /**
   * int numLeaves()
   * returns number of leaves in tree
   */
  public int numLeaves()
  {
    return numLeaves( _root );
  }
  public int numLeaves( TreeNode currNode ) {
    int foo = 0;
    if ( currNode == null )
      return 0;
    foo += numLeaves( currNode.getLeft() );
    if ( isLeaf(currNode) )
      foo++;
    foo += numLeaves( currNode.getRight() );
    return foo;
  }


  public void remove(int tea) {

    if (tea == _root.getValue()) {
      TreeNode smaller = slightlysmaller(_root);
      TreeNode bigger = slightlybigger(_root);
      if (tea - smaller.getRight().getValue() > bigger.getLeft().getValue() - tea) {
        _root.setValue(bigger.getLeft().getValue());
        bigger.setLeft(null);

      }
      else {
        _root.setValue(smaller.getRight().getValue());
        bigger.setRight(null);
      }
    }

  }

  public TreeNode slightlysmaller(TreeNode geoff) {
    TreeNode reference = geoff.getLeft();
    while (reference.getRight() != null && reference.getRight().getRight() != null) {
      reference = reference.getRight();
    }
    return reference;
  }

  public TreeNode slightlybigger(TreeNode geoff) {
    TreeNode reference = geoff.getRight();
    while (reference.getLeft() != null && reference.getLeft().getLeft() != null) {
      reference = reference.getLeft();
    }
    return reference;
  }

  // public TreeNode returnParent(TreeNode child, TreeNode current) {
  //   if (current == child) {
  //     return current;
  //   }
  //   else if (current == null) {
  //     return null;
  //   }
  //   else {
  //     if (returnParent(child, current.left()) == null) {
  //
  //     }
  //   }
  // }
  // TreeNode largest = slightlysmaller(_root);
  // TreeNode smallest = slightlybigger(_root);
  // if (tea - largest.getValue() > smallest.getValue() - tea) {
  //   smallest.setLeft(_root.getLeft());
  //   smallest.setRight(_root.getRight());
  // }
  // else {
  //   largest.setLeft(_root.getLeft());
  //   largest.setRight(_root.getRight());
  // }


  //main method for testing
  public static void main( String[] args )
  {

  	BST arbol = new BST();

  	System.out.println( "tree init'd: " + arbol );

  	//inserting in this order will build a perfect tree
  	arbol.insert( 3 );
  	arbol.insert( 1 );
  	arbol.insert( 0 );
  	arbol.insert( 2 );
  	arbol.insert( 5 );
  	arbol.insert( 4 );
  	arbol.insert( 6 );
  	/*
  	*/

  	//inserting in this order will build a linked list to left
  	/*
  	arbol.insert( 6 );
  	arbol.insert( 5 );
  	arbol.insert( 3 );
  	arbol.insert( 4 );
  	arbol.insert( 2 );
  	arbol.insert( 1 );
  	arbol.insert( 0 );
  	*/

  	System.out.println( "tree after insertions:\n" + arbol );
  	System.out.println();

  	System.out.println();
  	for( int i=-1; i<8; i++ ) {
  	    System.out.println(" searching for "+i+": " + arbol.search(i) );
  	}

  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(3);
  	System.out.println();
  	System.out.println( arbol );

  	// arbol.remove(5);
  	// System.out.println();
  	// System.out.println( arbol );
    //
  	// arbol.remove(4);
  	// System.out.println();
  	// System.out.println( arbol );
    //
  	// arbol.remove(3);
  	// System.out.println();
  	// System.out.println( arbol );
    //
  	// arbol.remove(2);
  	// System.out.println();
  	// System.out.println( arbol );
    //
  	// arbol.remove(1);
  	// System.out.println();
  	// System.out.println( arbol );
    //
  	// arbol.remove(0);
  	// System.out.println();
  	// System.out.println( arbol );


  }

}//end class
