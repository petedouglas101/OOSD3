package assignment1;

class Repository {
	int index; // Stores the number being generated in the Counter class

	// Allows access to the index variable
	public int getIndex() {
		return index;
	}

	// Allows the index variable to be updated
	public void setIndex(int index) {
		this.index = index;
	}
}

class Counter extends Thread {
	Repository repos; // A reference variable to the Repository class

	// Counter constructor with a Repository instance as a parameter
	public Counter(Repository repos) {
		this.repos = repos;
	}

	//Method for running the thread that calls the count() method
	@Override
	public void run() {
		this.count();

	}
	
	//Method for counting the numbers and storing them in the Repository class
	public void count() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				repos.setIndex(i);
				//For loop that updates the index in Repository class with each iteration

				try {
					Thread.sleep(100);//Sleeps the thread so that the publish thread can start
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

}

class Publisher extends Thread {
	Repository repos; // A reference variable to the Repository class
	
	//Publisher constructor which takes a Repository as a parameter
	public Publisher(Repository repos) {
		this.repos = repos;
	}
	
	//Method that prints out the value in the Repository class
	public void publish() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				System.out.println("The number is: " + repos.getIndex());
				//For loop that goes from 0 - 10 and prints out the Repository index with each iteration.

				try {
					Thread.sleep(100);//Sleeps the thread so that the Publisher thread can start.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}
	
	//Method for running the Thread, which calls the publish() method.
	public void run() {
		this.publish();

	}
}

//Main method which runs the program
public class Main {

	public static void main(String[] args) {
		Repository repos = new Repository();//Creates an instance of Repository
		Counter count = new Counter(repos);//Creates an instance of Counter, takes the Repository instance as a parameter
		Publisher publish = new Publisher(repos);//Creates an instance of Publisher, takes the Repository instance as a parameter

		count.start();//Starts the count thread
		publish.start();//Starts the publish thread

	}

}//END OF PROGRAM
