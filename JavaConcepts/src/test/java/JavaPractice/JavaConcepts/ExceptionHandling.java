package JavaPractice.JavaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


class FileHandling {
	
	// handling exception using throws
	// Exception can be handled at method/constructor level and not at class level
	
	public FileHandling() throws IOException {
	FileInputStream fis = new FileInputStream("D:\\testout.txt");
	fis.read();
}

}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//always a good practice to use try catch in main method instead of throws	
	// we can have try with multiple catch blocks
	// whichever exception is caught first it will execute that particular catch block
		
		try {
			FileHandling fileHandle = new FileHandling();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not Found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Content Not Found");
		}
		finally {
			System.out.println("Exception is handled");
		}

	}

}
