package week4;

public class ProcessDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Number of procesors: " + r.availableProcessors());
		System.out.println("Total memory: " + r.totalMemory());
		System.out.println("Free memory: " + r.freeMemory());
		System.out.println("Used memory: " + (r.totalMemory() - r.freeMemory()));
		
		for(int i = 0; i < 10000; i++) {
			new Object();
		}
		r.gc();
		
		System.out.println("Memory status");
		System.out.println("Number of procesors: " + r.availableProcessors());
		System.out.println("Total memory: " + r.totalMemory());
		System.out.println("Free memory: " + r.freeMemory());
		System.out.println("Used memory: " + (r.totalMemory() - r.freeMemory()));
		

	}

}
