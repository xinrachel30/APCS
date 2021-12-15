// Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS pd7
// HW47 -- Guess Again / create a guess-a-number game
// 2021-12-14
// time spent: 0.67 hrs

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO:
    - You can do return; to end a method that has void as its return type.
    - (piazza) You can do break; to exit out of a loop.

    QCC:
    - We took inspiration from Team And Then There were Two's piazza post (@352)
      about what to do when _lo == _hi
 ***/

import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 1;

    //pick random number in range [a,b]
    _target = (int)(Math.random() * (_hi - _lo)) + _lo;
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();
    //3 cases: we either found it, too hi, too lo

    /* YOUR CODE HERE */

    if (guess == _target){
      System.out.println("Correct! It took " + _guessCtr + " guesses");
      return;
    }
    else {
      if (guess > _target) {
        System.out.println("Too high, try again...");
        _hi = guess - 1;
        _guessCtr++;
        if (_lo == _hi) {
          System.out.println("You are a loser. The number was " + _target);
          return;
        }
      }
      else {
        System.out.println("Too low, try again...");
        _lo = guess + 1;
        _guessCtr++;
        if (_lo == _hi) {
          System.out.println("You are a loser. The number was " + _target);
          return;
        }
      }
      playRec();
    }
  }

  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
    public void playIter()
    {
      int guess;

      while( true ) {
        System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
        guess = sc.nextInt();

        //3 cases: we either found it, too hi, too lo

        _guessCtr++;
        if (guess > _target) {
          System.out.println("Too high, try again...");
          _hi = guess - 1;
          if (_lo == _hi) {
            System.out.println("You are a loser. The number was " + _target);
            return;
          }
        }
        if (guess < _target) {
          System.out.println("Too low, try again...");
          _lo = guess + 1;
          if (_lo == _hi) {
            System.out.println("You are a loser. The number was " + _target);
            return;
          }
        }
        if (guess == _target) {
          System.out.println("Correct! It took " + (_guessCtr - 1) + " guesses");
          return;
        }
      }
    }

  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    playRec();
    //playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
