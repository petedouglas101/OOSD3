package week1;

public class NamingThread extends Thread {
	
	public void run() {
		System.out.println("Running!");
	}
	
	
	
	public static void main(String[] args) {
		NamingThread thread1 = new NamingThread();
		NamingThread thread2 = new NamingThread();
		
		System.out.println("Name of thread1 is: " + thread1.getName());
		System.out.println("Name of thread2 is: " + thread2.getName());
		
		thread1.start();
		thread2.start();
		
		thread1.setName("OOSD3 Thread");
		System.out.println("Thread1 name is now: " + thread1.getName());
	}

}
