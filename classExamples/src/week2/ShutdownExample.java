package week2;

public class ShutdownExample extends Thread {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new ShutdownExample());
		
		System.out.println("Main is sleeping - press ctrl + c to exit!");
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		
	}
	
	public void run() {
		System.out.println("Shutdown hook task completed!");
	}
}
