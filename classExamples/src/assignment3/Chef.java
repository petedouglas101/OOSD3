package assignment3;

public class Chef extends Thread {
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		notify();
		
		
		
	}
	
	public void preparingOrder() {
		
	}

}