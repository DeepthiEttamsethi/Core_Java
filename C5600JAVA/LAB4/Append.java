package LAB4;
import java.io.*;
//reading input from keyboard and write the data to file in character stream
public class Append {
public static void main(String[] args) throws IOException
{
DataInputStream dis = new DataInputStream(System.in);
//used to open the file for writer
//FileWriter fw = new FileWriter("filename and path",appendmode);
FileWriter fw = new FileWriter("F:\\Anudip\\Test.txt",true);
//used to write data to file with the help of filewriter object
BufferedWriter br=new BufferedWriter(fw);
String str=null;
int size;
while( true )
{
System.out.println("Enter file input");
str=dis.readLine(); //read fromkeyborad
if(str.equals("null"))
break;
size=str.length();
br.write(str,0,size); //write to file
br.write("\n");
}
br.close();
fw.close();
}
}