package Files;
import java.io.*;
public class CreateFloder {
	public static void main(String[] args) {
		File f = new File("F:\\Deepthi\\Files1");
		if (!f.exists()) // to check directory existence
		{
			if (f.mkdir()) // creating a new folder
				System.out.println("Dir Created ...");
			else
				System.out.println("Uanble to Create dir ...");
		}
		else
			System.out.println("Dir. already exist ....");
	}
}