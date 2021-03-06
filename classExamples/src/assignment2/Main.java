package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		ExecutorService servicePool = Executors.newSingleThreadExecutor();//Creates an Executor service, which will execute the processes.
		ProcessBuilder pb = new ProcessBuilder();//Builds a process.
		pb.command("cmd.exe", "/c", "ping -n 10 www.reddit.com");//Passes the command to the process.
		Process process = pb.start();//Starts the process.

		ReadData readData = new ReadData(process.getInputStream());//Creating an instance of the ReadData class and passing the input stream from the process as a parameter.
		Future<List<String>> future = servicePool.submit(readData);//Returns a future object.
		
		// I understand that here I am supposed to loop through the future object by calling one of the Future.get() methods and pull of the input stream as a string but I just
		//wasn't able to figure it out.

	}

}

//Class for reading the data from the input stream which implements Callable interface.
class ReadData implements Callable<List<String>> {

	InputStream inputStream;//Input stream from the process
	
	//Constructor which takes the processes input stream as a parameter
	public ReadData(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override //Call method for the ReadData class which returns a string of the input stream
	public List<String> call() throws Exception {

		List<String> inputStreamList = new ArrayList<String>();//ArrayList for storing input stream.
		BufferedReader br = null;//Buffered reader for reading the input stream.
		br = new BufferedReader(new InputStreamReader(inputStream));//The BufferedReader takes an input stream reader as a parameter, which in turn takes the input stream we have passed into the constructor of the ReadData class. 
		String line = null;//String variable which will hold the data from the input stream
		try {
			while ((line = br.readLine()) != null) {
				inputStreamList.add(line);//A loop which reads the data from the input stream and puts each sentence (information from each ping) in an array.
			}
		} catch (IOException e) {
			e.printStackTrace();//Catches the exception.
		} finally {
			br.close();//Closes the buffered reader.
		}

		return inputStreamList;//Returning the array which stores all the information from the input stream.
	}

}
