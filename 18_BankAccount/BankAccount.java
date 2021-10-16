/*
The Cats: Perry Huang, Xinqing Lin, Faiyaz Rafee
APCS
HW18 -- <CPA-One/Codify BankAccount.java/Making methods inside BankAccount to view details, withdraw and deposit money, and make an account>
2021-08-15
*/

/*
DISCO:
We discovered that you should use a period to invoke a method with an object - not accDetails(PerryThePlatypus), but PerryThePlatypus.accDetails(params).

QCC:
How does PerryThePlatypus.accDetails(params) work?

Q2: Before we write a constructor, we can make an instance variable using "BankAccount Perry = new BankAccount();"
We know that there is a default constructor because we can successfully make an instance without any arguments.

Q3: You can get the string representation using "System.out.println(object);
*/

public class BankAccount{
  private static String accHolderName;
  private static String password;
  private static int pin;
  private static int accNumber;
  private static double balance;

  public BankAccount(String a, String b, int c, int d, double u){
    accHolderName = a;
    password = b;
    pin = c;
    accNumber = d;
    balance = u;
  }

  public static void accDetails(){
    System.out.println(accHolderName);
    System.out.println(password);
    System.out.println(pin);
    System.out.println(accNumber);
    System.out.println(balance);
  }

  public static void deposit(double money) {
    balance += money;
  }

  public static void withdraw(double money) {
    balance -= money;
  }

  public static void main(String[] args){
    BankAccount PerryThePlatypus = new BankAccount("PerryThePlatypus", "ILikePlatypuses", 1234, 000000002, 169);
    PerryThePlatypus.accDetails();
    PerryThePlatypus.deposit(800);
    PerryThePlatypus.accDetails();
    PerryThePlatypus.withdraw(500);
    PerryThePlatypus.accDetails();
  }
}
