package cap_13_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) throws FileNotFoundException, MyFirstException {
		System.out.println("Inside main....");
		
		share();
		
		System.out.println("End of main....");
		
		try {
			throw new MyFirstException();			
		}finally {
			
		}
		

	}
	
	private static void share() {
		System.out.println("Inside share...");
		
		try {			
		
			HttpConnect.send(1, "Hello", "http://www.goodsnips.com");

		}catch(FileNotFoundException e) { //FileNotFoundException é uma subclasse de IOException
			
			
			System.out.println("FileNotFoundException");
			
		
		}catch(IOException e) {//IOException é uma subclasse de Exception
		
			System.out.println("IOException");
			
		}catch(Exception e) { //Exception
			
			System.out.println("Exception"); 
			
		}catch(Throwable e) {
			
			System.out.println("Throwable");
		}
		
		// Ordem:
		//   Exception (classe pai)
		//   IOException (classe filha)
		//   FileNotFoundException (classe neta)
		
		System.out.println("End of share...");
	}

}
