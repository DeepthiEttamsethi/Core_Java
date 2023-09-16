package LAB5;
import java.io.Serializable;
public class Data  implements Serializable {
	int idno;
	String Name;
	
	public Data(int id, String na)
	{
		idno=id;
		Name=na;
	}
}