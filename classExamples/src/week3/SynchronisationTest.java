package week3;

public class SynchronisationTest {

	public static void main(String[] args) {
		Table table = new Table();
		MyThreadOne t1 = new MyThreadOne(table);
		MyThreadTwo t2 = new MyThreadTwo(table);

		t1.start();
		t2.start();

	}

}

class Table {

	void printTable(int n) { // IS NOW A SYNCHRONISED METHOD! (IF THE METHOD IS SYNC
		synchronized (this) { //NOW SYNCHRONISED WITH A SYNCHRONISED BLOCK!
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}

	}
}

class MyThreadOne extends Thread {
	Table t;

	MyThreadOne(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThreadTwo extends Thread {
	Table t;

	MyThreadTwo(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}

}


