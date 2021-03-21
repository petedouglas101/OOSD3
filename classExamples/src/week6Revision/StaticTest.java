package week6Revision;

public class StaticTest {
	public static int count = 0;
	public int instanceCount = 0;

	public static void getCount() {
		System.out.println("Count: " + count);
		
	}
	
	public static void setCount() {
		count++;
	}
	
	public void setInstanceCount() {
		instanceCount++;
	}
	
	public void printInstanceCount() {
		System.out.println("Address: " + instanceCount);
		
	}

}
