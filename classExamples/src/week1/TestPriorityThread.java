package week1;

public class TestPriorityThread extends Thread {
	
	public void run() {
		System.out.println("Running thread: " + Thread.currentThread().getName());
		System.out.println("Running thread priority:" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		TestPriorityThread thread1 = new TestPriorityThread();
		TestPriorityThread thread2 = new TestPriorityThread();
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		
		

	}

}
