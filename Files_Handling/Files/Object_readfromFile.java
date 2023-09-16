package Files;
import java.io.*;
public class Object_readfromFile {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("F:\\Deepthi\\Files1");
	 ObjectInputStream in = new ObjectInputStream(fin);
	 Student s1 = (Student) in.readObject();
	 s1.Show();
	}
}