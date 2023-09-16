package Files;
import java.io.*;
public class DeleteFile {
	public static void main(String[] args) {
		File f = new File("F:\\Deepthi\\Files1");
		if (f.exists())
		{
			if (f.delete())
				System.out.println("Dir/File Deleted ...");
			else
				System.out.println("Unable to Delete ...");
		}
		else
			System.out.println("Dir. not found ....");
	}
}