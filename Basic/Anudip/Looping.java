package Anudip;
import java.util.*;
public class Looping {

	public static void main(String[] args) {
		int i, tab_no, range;
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter table number");
			tab_no=obj.nextInt();
			System.out.println("Enter table Range");
			range=obj.nextInt();
		}
		for(i=1;i<=range;i++)
			System.out.println(tab_no +" x "+ i + " = "+ (i*tab_no) );
	}

}
