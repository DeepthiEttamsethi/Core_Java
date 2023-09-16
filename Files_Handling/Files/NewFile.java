package Files;
import java.io.*;
import java.util.*;
public class NewFile {
	public static void main(String[] args) throws Exception {
		OutputStream lt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		
		String data=sc.nextLine();
		
		lt = new FileOutputStream(new File("F:\\Deepthi\\Test"),true);
		lt.write(data.getBytes(), 0, data.length());
		lt.close();
		
		}
}