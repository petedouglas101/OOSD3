package week7;

public class Counter {
	
	private int count = 0;
	
	public void add(int value) {
		this.count += value;
		//Read -> Modify -> Write
	}
	
	public static void main(String[] args) {
		
		Counter count = new Counter();
		//Create two threads, a and b, and pass in counter into each.	
		//ThreadA(counter)
		//ThreadB(counter)
		

	}

}

//this.count = 0;
//ThreadA: this.count ----> register (0);
//ThreadB: this.count ----> register (0);
//ThreadB: Adds value 2 to the register
//B: Writes register value (2) back to memory. this.count = 2 
//A: Adds 3 to the register 
//A: register ----> 0+3 ---->this.count = 3
//this.count should have been 5!
