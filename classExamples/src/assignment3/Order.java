package assignment3;

public class Order {
	
	private String order;
	private int tableNo;
	private boolean isReady;
	
	public Order(String order, int tableNo, boolean isReady) {
		this.order = order;
		this.tableNo = tableNo;
		this.isReady = isReady;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
	
	
}
