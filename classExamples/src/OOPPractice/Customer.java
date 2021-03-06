package OOPPractice;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String firstName;
	private String lastName;
	private String addresss;
	private String phoneNo;
	private List<Account> customerAccounts;
	private int customerID;
	
	public Customer(String firstName, String lastName, String addresss, String phoneNo, int customerID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresss = addresss;
		this.phoneNo = phoneNo;
		this.customerAccounts = new ArrayList<Account>();
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Account> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(List<Account> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", addresss=" + addresss + ", phoneNo="
				+ phoneNo + ", customerAccounts=" + customerAccounts + ", customerID=" + customerID + "]";
	}

	
	
	
	
	
}
