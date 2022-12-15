
public class Account {
	private double balance;
	private int accountID;
	private String accountType;
	
	
	public Account(double balance, int accountID, String accountType){
		this.balance = balance;
		this.accountID = accountID;
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString(){
		return "Account # " + this.accountID + ": " + this.balance;
	}
	
	
}
