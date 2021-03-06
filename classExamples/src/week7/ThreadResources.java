package week7;

//Thread safe --->//HELLO MY NAME IS PETER
//I would like to do a test on GitHub
public class ThreadResources {
	
	public void resourceMethod() {
		long resourceCount = 0;
		resourceCount++;
	}
	
	public void objectResources() {
		LocalObject myObject = new LocalObject();
		myObject.callMethod();
	}
	
	public void methodTest(LocalObject localObjectRef) {
		localObjectRef.setValue("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class NotThreadSafe{
	StringBuilder builder = new StringBuilder();
	
	public void add(String text) {
		this.builder.append(text);
	}
	
}

//Create two threads -> A and B
//Create instance of NotThreadSafe
//Both threads use  the same instance of nts
//Both call add method simultaneously --> cause race condition