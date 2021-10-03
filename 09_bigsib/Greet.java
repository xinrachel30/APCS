/* 
MAX Swag (Xinqing Lin (Horse), Anjini Katari (Watson), and Michael Kamela (no duck yet))
APCS
HW09 -- Using methods across separate Java files
2021-10-03
*/

/*
DISCOVERIES:
- If you forget to make a java class, it will give you the error message: "cannot find symbol".
- You can use a method of one Java file in another Java file (as shown below) if they're in the same folder.
- You can write (and use) a class without a main method. 

UNRESOLVED QUESTIONS: 
- What's the difference between a private class and a public class?
*/

public class Greet {
    public static void main( String[] args ) {
        BigSib.greet("Flim");
        BigSib.greet("Flam");
        BigSib.greet("Kazaam");
    }
}
