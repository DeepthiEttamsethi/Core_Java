package class1;
import java.util.StringTokenizer;
public class Ternary3 {

	public static void main(String[] args) {
		String s = "Ram/Sam,Sekar,Mohan,Raju";
		StringTokenizer st = new StringTokenizer(s,"/,");
		while (st.hasMoreTokens())
		System.out.println(st.nextToken());

	}

}
