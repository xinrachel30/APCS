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

public class Greet {
        public static void main (String [] args ) {
                String greeting;
                BigSib richard = new BigSib("Word up");
                BigSib grizz = new BigSib("Hey ya");
                BigSib dotCom = new BigSib("Sup");
                BigSib tracy = new BigSib("Salutations");
                greeting = richard.greet("freshman");
                System.out.println(greeting);
                greeting = tracy.greet("Dr.Spaceman");
                System.out.println(greeting);
                greeting = grizz.greet("Kong Fooey");
                System.out.println(greeting);
                greeting = dotCom.greet("mom");
                System.out.println(greeting);
        } //end main()
} //end Greet
