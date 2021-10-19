/**
   "The Cats" : Faiyaz Rafee, Xinqing Lin, Perry "the platypus" Huang
   APCS pd07
   HW19 -- Mo Money Mo Problemos.., More AWESOME
   2021-10-18
   DISCO:
   *You can convert int to short by putting method((short)****)
   QCC:
   *How does DISCO work and does it work with other primitives?
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {

	if (newPin >= 1000 && newPin <= 9998){
     	 short oldPin = newPin;
     	 pin = newPin;
     	 return pin;
       	 }
   	 else {
        	  System.out.println("Error : Invalid Pin");
         	 pin = 9999;
         	 return pin;
       	 }
  }

  public int setAcctNum( int newAcctNum ) {
    if (newAcctNum >= 100000000 && newAcctNum <= 999999998){
      int oldAcctNum = acctNum;
      acctNum = newAcctNum;
      return oldAcctNum;
	}
    else {
	  System.out.println("Error : Invalid AcctNum");
	  acctNum = 999999999;
	  return acctNum;
	}
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (withdrawAmount >= balance){
	System.out.println("Error : U too broke to withdraw this much bro");
	return false;
	}
    else {
        balance = balance - withdrawAmount;
	return true;
	}
  }

  public boolean authenticate(int acnm, String pswd){
	if (acnm == acctNum && pswd == passwd){
	  return true;
	 }
	else{
	  return false;
	}
   }

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {

	BankAccount cats = new BankAccount();
	cats.setName("Dr.Doofenshmirtz");
	cats.setPasswd("FaiyazXinqingPerry");
	cats.setPin((short)89703);
	cats.setAcctNum(1010000000);
	cats.setBalance(2138);
	cats.deposit(1000000);
	cats.withdraw(99990000);
	System.out.println(cats.toString());
	System.out.println(cats.authenticate(100000000, "FaiyazXinqingPerry"));
  }//end main()

}//end class BankAccount
