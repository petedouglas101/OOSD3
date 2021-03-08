package week2;

public class GarbageCollectionTest {
	
	public void finalize() {
		System.out.println("Object is garbage collected!");
	}

	public static void main(String[] args) {
		
		GarbageCollectionTest gcTest = new GarbageCollectionTest();
		GarbageCollectionTest gcTest2 = new GarbageCollectionTest();
		
		gcTest = null;
		gcTest2 = null;
		
		System.gc();
		
		
		

	}

}
