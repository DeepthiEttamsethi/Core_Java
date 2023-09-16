package Files;
import java.io.*;
public class Object_toFile {
	public static void main(String[] args)throws IOException
	{
		FileOutputStream fout = new FileOutputStream("F:\\Deepthi\\Files1");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		 Student s = new Student(100,"Sam","MCA",80.45f);
		 // s.Show();
		 out.writeObject(s);
		
		 System.out.println("data written to the file.");
	}
}