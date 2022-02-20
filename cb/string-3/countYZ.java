/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
*/

public class countYZ {

  public static int countYZ(String str) {
    int sum = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
        if (i == str.length() - 1 || !Character.isLetter(str.charAt(i+1))) {
          sum ++;
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(countYZ("fez day"));
    System.out.println(countYZ("day fez"));
    System.out.println(countYZ("day fyyyz"));

  }

}
