class AccountOverDraftDemoVersion3  {
	
public static void main(String[] args) {
	
		 Account2 ac = new Account2(10, 0);
		 
		 System.out.println("Ordinary account balance = " + ac.withdraw(10));
		 		 
		 OD_Account2 od2 = new OD_Account2(20);
		 System.out.println("Overdraft account 2 balance = " + od2.withdraw(2000));
	}
}


class Account2 {

	/*@ public invariant balance >= minimum; @*/
	
    protected /*@ spec_public @*/ int balance; 
	protected /*@ spec_public @*/ int minimum;

	/*@ requires b >=0 && b <= Integer.MAX_VALUE;
	  @ requires m >=0 && m <= Integer.MAX_VALUE; @*/
	public Account2(int b, int m) {
		balance = b;
		minimum = m;
	}

	/*@ requires x > 0 && x <= Integer.MAX_VALUE;
	  @ requires balance > 0 && balance <= Integer.MAX_VALUE; @*/
	int withdraw(int x) {
		balance = balance - x;
		return balance;
	}

}

class OD_Account2 extends Account2 {

	public OD_Account2(int b) {
		super(b, -2000);
	}
}

