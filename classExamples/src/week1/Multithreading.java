package week1;

public class Multithreading extends Thread {

	public void run() {

		System.out.println("Thread is running!");
	}

	public static void main(String[] args) {

		Multithreading multithreading = new Multithreading();
		multithreading.start();

	}

}
