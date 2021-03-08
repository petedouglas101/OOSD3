package week3;

public class MemoryTest {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("Total memory: " + runtime.totalMemory());
		System.out.println("Free memory: " + runtime.freeMemory());
		
		for(int i = 0; i < 10000; i++) {
			new MemoryTest();
			
		}
		
		System.out.println("Free memory after 10000 instances: " + runtime.freeMemory());
		
		System.gc();
		
		System.out.println("Free memory after gc call: " + runtime.freeMemory());
		
				

	}

}
