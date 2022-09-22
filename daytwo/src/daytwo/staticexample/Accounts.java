package daytwo.staticexample;

public class Accounts {
	
	private int accountId;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public static void displayAccounts() {
		System.out.println("I am inside static method in Accounts class");
	}

}
