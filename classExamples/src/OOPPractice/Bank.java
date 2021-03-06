package OOPPractice;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Bank {
	
	private static int uniqueIdentifier = 10001;
	private static String ibanStart = "IEAIB";
	private static int accountNo = 1000001;
	private static int sortCode = 900102;
	
	private Map<Integer, Customer> customerCollection;
	private int depositType = 101;
	private int currentType = 102;
	
	
	public Bank() {
		this.customerCollection = new Hashtable<Integer, Customer>();
	}
	
	public Customer createCustomer(String firstName, String lastName, String address, String phoneNo) {
		Bank.uniqueIdentifier++;
		int customerID = Bank.uniqueIdentifier;
		Customer myCustomer = new Customer(firstName, lastName, address, phoneNo, customerID);
		customerCollection.put(customerID, myCustomer);
		
		return myCustomer;
		
	}
	
	public void createAccount(int customerID, int accountType) {
		Customer customer = customerCollection.get(customerID);
		String accountNo = Bank.ibanStart + Bank.accountNo + Bank.sortCode;
		Account account = new Account(currentType, accountNo);
		customer.getCustomerAccounts().add(account);
		
		
	}
	
	public Customer findCustomer(int customerID) {
	
		return customerCollection.get(customerID);
		
	}
	
	public void deposit(Customer customer, double amount, String iban) {
		
		ArrayList<Account> customerAccounts = (ArrayList<Account>) customer.getCustomerAccounts();
		for(Account acc : customerAccounts) {
			if(acc.getIBAN().equals(iban)) {
				acc.setBalance(acc.getBalance() + amount);
			}
		}
		
		
	}
	
	public void withdraw(Customer customer, double amount, String iban) {
		
		ArrayList<Account> customerAccounts = (ArrayList<Account>) customer.getCustomerAccounts();
		for(Account acc : customerAccounts) {
			if(acc.getIBAN().equals(iban)) {
				if(acc.getBalance() >= amount)
				acc.setBalance(acc.getBalance() + amount);
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		

	}

}
