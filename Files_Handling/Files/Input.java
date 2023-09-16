package Files;
import java.io.*;
public class Input {
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);
		int roll;
		String name;
		
		System.out.println("Enter Name ");
		name= dis.readLine();
		
		System.out.println("Enter Rollno ");
		roll= Integer.parseInt(dis.readLine());
		
		System.out.println(roll +" "+ name);
	}
}