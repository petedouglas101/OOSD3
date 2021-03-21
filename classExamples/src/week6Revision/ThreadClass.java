package week6Revision;

public class ThreadClass extends Thread {

	public static void main(String[] args) {
		ThreadClass myThread = new ThreadClass();
		myThread.start();//We must use start() to start a thread, we don't just call the run() method.
		

	}
	
	public void run() {
		System.out.println("My thread is running!");
	}

}
