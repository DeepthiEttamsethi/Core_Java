package LAB5;
import java.io.*;
public class IOExcep {
	public static void main(String[] args) {
		FileReader fileReader = null; 
		try { 
			// Creating a FileReader object to read a file 
			fileReader = new FileReader("input.txt"); 
			// Reading the contents of the file 
			int character; 
			while ((character = fileReader.read()) != -1) { 
				System.out.print((char) character); 
				} 
			} 
		catch (IOException e)
		{ 
			// Handling the IOException 
			System.out.println("An error occurred while reading the file: " + e); 
			} 
		finally
		{ 
			// Closing the FileReader object in the finally block to ensure it's always closed 
			try
			{ 
				if (fileReader != null)
				{ 
					fileReader.close(); 
				} 
				}
			catch (IOException e)
			{ 
				System.out.println("An error occurred while closing the file: " + e); 
				} 
			} 
		} 
	} 