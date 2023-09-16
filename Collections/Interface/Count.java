package Interface;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String aldisp_str;
		int i, alph, digi, spl,count=0;
		alph=digi=spl=0;
		char ch;
		
		
		System.out.print("Please Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >='a' && ch <='z' || ch >='A' && ch <='Z' ) {
				alph++;
			}
			else if(ch >='0' && ch<='9') {
				digi++;
			}
			else {
				spl++;
			}
		}
		System.out.println("Number of count Characters = "+ count);
		System.out.println("Number of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);

	}

}
