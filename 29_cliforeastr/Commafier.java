/*
The Cats: Faiyaz Rafee, Xinqing Lin, Perry Huang
APCS
HW#29 -- Which Way Do You Roll? // Recursion and Iterative versions of Commafy
2021-11-2
Time Spent: 2.0 hrs

DISCO:
We need the for each loop in our main method to convert the String args into int since our commafy method only accepts integers
as parameters
This lets the commafyR commafy the inputs one at a time since it is being looped in a foreach loop.

QCC:
You can use Integer.toString to convert int to string and you can use Integer.parseInt to convert string to int.
*/
public class Commafier{

    public static String commafyF(int n) {
        String number = Integer.toString(n);
        String result = number;
        if (number.length() < 4) {
            return result;
        }
        result = "";
      	int count = 0;
        for (int i = number.length(); i >= 1; i = i - 1) {
            result = number.substring(i - 1, i) + result;
          	count += 1;
          	if (count%3 == 0 && count != number.length()) {
              result = "," + result;
        		}
        }

        return result;
    }

    public static String commafyR(int n) {
        String number = Integer.toString(n);
        String result = "";
        if (number.length() < 4) {
          return number;
        }
        result = number.substring(number.length() - 3);
        number = number.substring(0, number.length() - 3);
        result = commafyR(Integer.parseInt(number)) + "," + result;
        return result;
    }

    public static void main(String[] args) {
      	for(String s : args) {
         int n = Integer.parseInt(s);
         System.out.println(commafyR(n));
       	}
        System.out.println(commafyR(1001));
        System.out.println(commafyR(1000000));
        System.out.println(commafyF(1000));
        System.out.println(commafyF(1000000));
        System.out.println(commafyF(1000980990));
    }

}
