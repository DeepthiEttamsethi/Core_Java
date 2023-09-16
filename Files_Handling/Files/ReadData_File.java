package Files;
import java.io.*;
public class ReadData_File {
	public static void main(String[] sun) throws IOException
	{
	FileReader fr=new FileReader("F:\\Deepthi\\Test.txt");
	BufferedReader br=new BufferedReader(fr);
	String str=null;
	while( true )
	{ try
	{ str=br.readLine(); // read from file
	if(str.equals(null))
	break;
	System.out.println(str);
	}
	catch(NullPointerException e)
	{ break; }
	}
	br.close();
	fr.close();
	}
}