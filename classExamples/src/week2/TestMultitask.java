package week2;

public class TestMultitask implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new TestMultitask());
		Thread t2 = new Thread(new TestMultitask());
		Thread t3 = new Thread(new TestMultitask());
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	public void run() {
		System.out.println("Task 1!");
	}

}
