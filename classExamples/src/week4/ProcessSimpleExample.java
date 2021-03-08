package week4;

import java.util.concurrent.TimeUnit;

public class ProcessSimpleExample {

	public static void main(String[] args) throws Exception {
		
		Runtime r = Runtime.getRuntime();
		
		Process p = r.exec("C:/Program Files (x86)/Internet Explorer/iexplore.exe");

		p.waitFor(10, TimeUnit.SECONDS);
		p.destroy();
		
		
		
	}

}
