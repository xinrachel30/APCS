/* 
MAX Swag (Xinqing Lin (Horse), Anjini Katari (Watson), and Michael Kamela (no duck yet))
APCS
HW12 -- Using instance variables
2021-10-05
*/

/*
DISCO:
- You can create a (instance) variable outside of a method that can be used by all methods. 
- In order to be able to use an instance variable, you have to make the methods nonstatic by deleting the static after each public. Otherwise, you get the error message: "error: non-static variable hellomsg cannot be referenced from a static context"

QCC:
- What is the difference between static and nonstatic?
*/

public class BigSib {
    public String helloMsg;
    public String greet(String x) {
        return helloMsg + " " + x;
    }
    public void setHelloMsg(String x) {
        helloMsg = x;
    }
}
