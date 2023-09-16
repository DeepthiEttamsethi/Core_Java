package class1;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		
		String s = "roll no:100,name:Deepthi,Degree:MSC,Course:Java";
		
		    try (Scanner sc = new Scanner(s)) {
				sc.useDelimiter(",");
				while(sc.hasNext())
				System.out.println(sc.next());
			}
		}
}