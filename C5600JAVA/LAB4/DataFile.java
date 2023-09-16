package LAB4;
import java.io.*;
public class DataFile {
	
		public static void main(String[] sun) throws IOException
		{
		FileReader fr=new FileReader("F:\\Anudip\\Test.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=null;
		while( true )
		{ try
		{ str=br.readLine();
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