package assignment3;

public class Chef extends Thread {
	
	public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			
	
			}
	
	public void preparingOrder(Order order) {
		    order.isReady();
		
	}

}
