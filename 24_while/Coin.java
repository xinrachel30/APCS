/***
 Blue Sushi - Lawrence Joa, Xinqing Lin
 APCS
 HW24 -- Get It While You Can / this(), .equals(), and using while loops
 2021-10-25
 time spent: 1.0 hours
 DISCO:
 
 QCC:

 POST-v0 MODS:
 ***/

import java.util.*;

public class Coin {
  //attributes aka instance vars
  double value;
  String upFace = "heads";
  String name;
  int flipCtr;
  int headsCtr;
  int tailsCtr;
  double bias = 0.5;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
		reset ("heads", 0.5);
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
  	this();
    name = s;
    assignValue(s);
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    this(s);
  	upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
  	return upFace;
  }

  public int getFlipCtr() {
	   return flipCtr;
  }

  public double getValue() {
	   return value;
  }

  public int getHeadsCtr() {
	   return headsCtr;
  }

  public int getTailsCtr() {
  	return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
  	if(name.equals("penny")){
  		value=0.01;
  	}
  	if(name.equals("nickel")){
  		value=0.05;
  	}
  	if(name.equals("dime")){
  		value=0.10;
  	}
  	if(name.equals("quarter")){
  		value = 0.25;
  	}
  	if(name.equals("half dollar")){
  		value = 0.50;
  	}
  	if(name.equals("dollar")){
  		value = 1.00;
  	}
  	return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = s;
    bias = d;
    headsCtr=0;
    tailsCtr=0;
    flipCtr=0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    double result = Math.random();
    flipCtr++;
    if (result < bias) {
      headsCtr ++;
      upFace = "heads";
    }
    else {
      tailsCtr ++;
      upFace = "tails";
    }
    return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return upFace.equals(other.upFace);
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
   public String toString() {
     return name + " -- " + upFace;
   }

}//end class
