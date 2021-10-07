/*
HorseSoup (Xinqing Lin (Horse) and Paul Serbanescu (Soup))
APCS
HW13 -- Where do BigSibs Come From? / Using Constructors
2021-10-06
*/

/*
DISCO:
- Using a constructor eliminates the need for setHelloMsg.
- The constructor must have the class name after the protection type.

QCC:
- None
*/

public class BigSib {
    public String helloMsg;
    public BigSib(String s){
      helloMsg = s;
    }
    public String greet(String x) {
        return helloMsg + " " + x;
    }
}
