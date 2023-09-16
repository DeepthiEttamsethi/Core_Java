package class1;
import java.util.*;
public class Ternary2 {

	public static void main(String[] args) {
		
		String s = "RollNo=100;StudName=Raja;Degree=MCA";
		
		StringTokenizer st = new StringTokenizer(s,"=;");
		while (st.hasMoreTokens())
		System.out.println(st.nextToken() + "=" + st.nextToken());
	}

}
