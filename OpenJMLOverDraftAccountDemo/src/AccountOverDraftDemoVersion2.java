public class AccountOverDraftDemoVersion2 {
	
	public static void main(String[] args) {
		
		 Account ac = new Account();
		 ac.setBalance(10);
		 System.out.println("Ordinary account balance = " + ac.withdraw(10));
		 
		 OD_Account od2 = new OD_Account();
		 od2.setBalance(10);
		 System.out.println("Overdraft account 2 balance = " + od2.withdraw(100));
	}
}


class Account {
 
 protected /*@ spec_public @*/ int balance;
 
 public void setBalance(int b){
	balance = b;
 }  

 /*@ requires x >= 1; 
   @ ensures balance >= 0; @*/
 public int withdraw(int x)  {
	  balance = balance - x;
	  return balance;
 }
 
}


class OD_Account extends Account {
		 
 public void setBalance(int b){
	balance = b;
 }  

 /*@ requires x >= 1; 
   @ ensures balance >= -1000; @*/
 public int withdraw(int x)  {
	  balance = balance - x;
	  return balance;
 }

}
