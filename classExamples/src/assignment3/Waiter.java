package assignment3;

public class Waiter extends Thread {
	
	private String order;
	private int tableNo;
	private boolean isReady;
	private Chef chef;
	
	
	public Waiter(Chef chef) {
		this.chef = chef;
	}
	
	public void run() {
		orderReady();
	}


	public void sendOrder(Order order) {
		synchronized(chef) {
		this.order = order.getOrder();
		this.tableNo = order.getTableNo();
		this.isReady = order.isReady();
		this.chef.preparingOrder(order);
		this.chef.start();
		this.orderReady();
		}
		
	}
	
	public void orderReady() {
		synchronized(this) {
			while (this.isReady == false){
				System.out.println("Order is still being made!");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Order is made!");
				
			}
		}
		
	}

}
