/*The Cats: Perry Huang, Xinqing Lin, Faiyaz Rafee
APCS
HW18 -- <CPA-One/Bank Account Java/Summary>
2021-08-15
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
}
}
