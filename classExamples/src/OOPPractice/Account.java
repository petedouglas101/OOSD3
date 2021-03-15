package OOPPractice;

public class Account {
	
	private int accountType;
	private double balance;
	private String IBAN;
	
	public Account(int accountType, String iBAN) {
		this.accountType = accountType;
		this.balance = 0;
		this.IBAN = iBAN;
	}
	public int getAccountType() {
		return accountType;
	}
	
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", balance=" + balance + ", IBAN=" + IBAN + "]";
	}
	

}
