package week1;

public class TestCurrentThread extends Thread {
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

	public static void main(String[] args) {
		
		TestCurrentThread thread1 = new TestCurrentThread();
		TestCurrentThread thread2 = new TestCurrentThread();
		
		thread1.start();
		thread2.start();
		

	}

}
