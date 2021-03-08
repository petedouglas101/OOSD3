package assignment1;

public class Main extends Thread {

	public static void main(String[] args) {
		Repository repos = new Repository();
		Counter count = new Counter(repos);
		Publisher publish = new Publisher(repos);
		
		count.start();
		publish.start();

	}

}

class Repository {
	
	int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}

class Counter extends Thread {
	Repository repos;

	public Counter(Repository repos) {
		this.repos = repos;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			repos.setIndex(i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class Publisher extends Thread {
	Repository repos;

	public Publisher(Repository repos) {
		this.repos = repos;
	}

	synchronized public void publish() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("The number is: " + repos.getIndex());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void run() {
		this.publish();

	}

}
