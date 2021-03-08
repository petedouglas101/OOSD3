package week7;

public class Sums {
	
	private int sum1 = 0;
	private int sum2 = 0;
	
	private Integer sumLock1 = 1;
	private Integer sumLock2 = 2;
	
	public void add(int value1, int value2) {
		synchronized (this.sumLock1) {
			this.sum1 += value1;
			
		}
		
		synchronized(this.sumLock2) {
			this.sum2 += value2;
		}
	}
	public static void main(String[] args) {
		

	}

}
