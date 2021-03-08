package week3;

public class TestThreadCom {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
		

	}

}

class Customer{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw: " + amount);
		
		if(this.amount < amount) {
			System.out.println("Insufficient balance! Waiting for a deposit!");
			
			try {
				wait();
			}catch (Exception e){
				
			}
		}
		
		this.amount -= amount;
		System.out.println("Withdraw complete!");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit: " + amount);
		
		this.amount += amount;
		System.out.println("Deposit complete");
		notify();
		
	}
}
