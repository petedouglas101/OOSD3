package week6Revision;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("My runnable thread is running!");
		

	}

	public static void main(String[] args) {
		ThreadRunnable runnable = new ThreadRunnable();
		new Thread(runnable).start();


	}

}
