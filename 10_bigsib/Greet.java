/* 
MAX Swag (Xinqing Lin (Horse), Anjini Katari (Watson), and Michael Kamela (no duck yet))
APCS
HW10 -- Using return statements
2021-10-04
*/

/*
DISCOVERIES: 
- Instead of having the greet method print the greeting, we can make it return the greeting. If we do this, we have to put the print statements in the main method. 
- If you don't change the "void" to "String", you get an error message (error: incompatible types: unexpected return value). 
- "void" means that no value should be returned from the method.

UNRESOLVED QUESTIONS:
- Why does Java require you to put the return type when other languages like Python don't?
- If "void" refers to the return type, what does "static" refer to?
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
