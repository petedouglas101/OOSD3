package week1;

//THRE

public class Multi2 implements Runnable  {

	public static void main(String[] args) {
		Multi2 multi2 = new Multi2();
		Thread thread = new Thread(multi2);
		thread.start();
		


	}

	@Override
	public void run() {
		System.out.println("Thread is running!");
		
	}

}
