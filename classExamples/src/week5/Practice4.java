package week5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice4 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);

		Runnable r1 = new Task("Task 1");
		Runnable r2 = new Task("Task 2");
		Runnable r3 = new Task("Task 3");
		Runnable r4 = new Task("Task 4");
		Runnable r5 = new Task("Task 5");

		service.execute(r1);
		service.execute(r2);
		service.execute(r3);
		service.execute(r4);
		service.execute(r5);

		service.shutdown();
	}

}

class Task implements Runnable {

	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				if (i == 0) {
					Date date = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Start time for: " + name + " is " + ft.format(date));
				} else {
					Date date = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Excecuting time for: " + name + " is " + ft.format(date));
				}

				Thread.sleep(1000);
			}

			System.out.println(name + " completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
