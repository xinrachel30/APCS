/*
OX (Xinqing Lin (Horse) and Orion Revlon (Von Geburt))
APCS
HW14 -- Default and Overloaded Constructors
2021-10-07
*/

/*
DISCO:
- With a default constructor, you use the same greeting for every person. An overloaded constructor makes it easier to personalize greetings because you can use inputs.

QCC:
- Comment: The Greet.java in defcon still works if there is only one BigSib (like Richard) instead of all 4.
*/

public class BigSib {
  public String helloMsg;
  public BigSib () {
    helloMsg = "Good morning";
  }
  public String greet (String x) {
    return helloMsg + " " + x;
  }
}
