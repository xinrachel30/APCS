/*
Jinx - Josiah Moltz, Nora Miller, Xinqing Lin
APCS pd6
HW63: Read/Review/Expand
2021-02-10
time spent: 1.5 hr + class time

Starter1 from: https://kidscodecs.com/python-mad-libs/
Starter2 from: http://www.redkid.net/cgi-bin/madlibs/albert.pl

*/

import java.io.*;
import java.util.*;

public class MadLibs {

  private static String starter1 = "It was *FOOD day at school, and *NAME was super *ADJECTIVE for lunch. \nBut when she went outside to eat, a *NOUN stole her *SAMEFOOD! \n*SAMENAME chased the *SAMENOUN all over school. She *VERB1, *VERB2, and *VERB3 through the playground. \nThen she tripped on her *NOUN and the *SAMENOUNASFIRST escaped! \nLuckily, *SAMENAME friends were willing to share their *SAMEFOOD with her.";
  private static String starter2 = "Albert Einstein, the son of *MALECELEB and *FEMALECELEB, was born in Ulm, Germany, in 1879.\nIn 1902, he had a job the University of Zurich.\nThere he began studying atoms, molecules, and *PLUARALNOUN1 .\nHe developed the theory of *ADJECTIVE1 relativity, which expanded the phenomena of sub-atomic *PLURALNOUN2 and *ADJECTIVE2 magnetism.\nIn 1921, he won the Nobel prize for *PLURALNOUN3 and was director of theoretical physics at the Kaiser Wilhelm *NOUN2 in Berlin.\nIn 1933, when Hitler became Chancellor of *PLACE , Einstein came to America to take a post at Princeton Institute for *PLURALNOUN4, where his theories helped America devise the first atomic *NOUN3 .\nThere is no question about it: Einstein was one of the most brilliant *PLURALPROFESSION of our time.";

  public static void fillIn (String story) {
    Scanner s = new Scanner(System.in);

    String madlib = story; //copy over starter

    while (madlib.indexOf("*") > -1) { //iteration
      int askeriskI = madlib.indexOf("*");
      int spaceI = madlib.indexOf(" ", askeriskI); //end index of to-be-deleted word
      System.out.println("Insert a " + madlib.substring(askeriskI + 1, spaceI));
      String newWord = "";
      newWord = s.nextLine();
      madlib = madlib.substring(0, askeriskI) + newWord + madlib.substring(spaceI);
    }

    System.out.println("Finished piece:\n" + madlib);
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which MadLib do you want to play? 1 or 2?");
    int choice = Integer.parseInt( sc.nextLine() );

    if (choice == 1 || choice == 2) { // rewritten in order to satisfy cobo demands, used to be cleaner
      if (choice == 1) {
        fillIn(starter1);
      }
      else {
        fillIn(starter2);
      }
    }
    else {
      System.out.println("Now that's not one of the options!");
    }
  }

}
