package week8;

public class Lock {
	
	private boolean isLocked = false;
	private Thread lockingThread = null;
	
	public synchronized void lock() throws InterruptedException{
		while(isLocked) {
			wait();
		}
		
		isLocked = true;
		lockingThread = Thread.currentThread();
	}
	
	public synchronized void unlock() {
		isLocked = false;
		lockingThread = null;
		notify();
	}
}
