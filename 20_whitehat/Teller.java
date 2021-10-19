/*
The Cats: Faiyaz Rafee, Perry Huang, Xinqing Lin
APCS
HW#20 -- External Audit/White hacking BankAccount.java/Stress testing another trio's BankAccount.java from Teller.java
2021-10-19

DISCO:
The code of the Vegan Dragons is good and we didn't find any errors.
QCC:
Is there a better way to stress test so that we actually get errors?
*/

public class Teller{

    private String name;
    private String passwd;
    private short pin;
    private int acctNum;
    private double balance;

  public static void main(String [] args){
// create BankAccount of cats
    BankAccount cats = new BankAccount();
    cats.setName("Mr. Cat");
    cats.setPasswd("bugs4");
// testing limits of setAcctNum and setPin
    cats.setAcctNum(-999999998);
    cats.setPin((short)9998);
// testing limits of withdraw and deposit
    cats.setBalance(1);
    cats.withdraw(1);
    cats.withdraw(-1);
    cats.deposit(-1);
    cats.deposit(99);
    System.out.println(cats.toString());
    System.out.println(cats.authenticate(999999992, "randompasswordthatisn'tright")); //expecting... false
    System.out.println(cats.authenticate(999999999, "bugs4"));                        //expecting... true


    BankAccount dog = new BankAccount();
    dog.setName("Mr. Dog");
    dog.setPasswd("cats4");
// testing limits of setAcctNum and setPin
    dog.setAcctNum(123456789);
    dog.setPin((short)1234);
// testing limits of withdraw and deposit
    dog.setBalance(100);
    dog.withdraw(101);
    dog.withdraw(-10);
    dog.deposit(20);
    dog.deposit(-1);
    System.out.println(dog.toString());
  }

}
