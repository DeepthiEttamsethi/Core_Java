package LAB5;
import java.io.*;
public class FileWriting {
	public void Writedata()throws Exception
	{
		FileOutputStream fout = new FileOutputStream("F:\\Deepthi\\Write.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		 Data s = new Data(100,"Deepthi");
		 // s.Show();
		 out.writeObject(s);
		
		System.out.println("Data written to file...");
	}
	public static void main(String[] args) throws Exception {
		
		FileWriting f = new FileWriting();
		f.Writedata();
		
	}
}