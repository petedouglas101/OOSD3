package week2;

public class TestDaemonClass extends Thread  {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread here");
			
		}else {
			System.out.println("User thread here");
		}
	}

	public static void main(String[] args) {
		TestDaemonClass thread1 = new TestDaemonClass();
		TestDaemonClass thread2 = new TestDaemonClass();
		TestDaemonClass thread3 = new TestDaemonClass();
		
		thread1.start();//TEST FOR STARTING THREAD AND THEN SETTING TO DAEMON
		thread1.setDaemon(true);

		thread2.start();
		thread3.start();

	}

}
