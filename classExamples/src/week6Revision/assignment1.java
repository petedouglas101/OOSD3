package week6Revision;

public class assignment1 {

	public static void main(String[] args) {
		Repository repos = new Repository();
		Counter counter = new Counter(repos);
		Publisher publish = new Publisher(repos);

		Thread countThread = new Thread(counter);
		countThread.start();
		publish.start();

	}

}

class Counter implements Runnable {
	Repository repos;

	public Counter(Repository repos) {
		this.repos = repos;
	}

	@Override
	public void run() {
		synchronized (repos) {
			for (int i = 0; i < 100; i++) {
				while(!repos.isPrinted()) {
					try {
						repos.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Counter thread setting value: " + i);
				repos.setValue(i);
				repos.setPrinted(false);
				repos.notify();
			}
		}

	}

}

class Publisher extends Thread {
	Repository repos;

	public Publisher(Repository repos) {
		this.repos = repos;
	}

	public void run() {
		synchronized (repos) {
			for (int i = 0; i < 100; i++) {
				while(repos.isPrinted()) {
					try {
						repos.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Publisher thread reading value: " + repos.getValue());
				repos.setPrinted(true);
				repos.notify();
	
			}
		}
 
	}

}

class Repository {
	private boolean printed = true;
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isPrinted() {
		return printed;
	}
	
	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}

}
