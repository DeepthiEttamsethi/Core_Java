package Files;
import java.util.Scanner;
public class Thread1 extends Thread {
		public void run1(){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		long a;
		System.out.println("Enter a number");
		a=sc.nextInt();
		for(int i=1;i<a;i++) {
		if(a%i==0) {
		sum=sum+i;
		}
		}if(sum==a) {
		System.out.println("Perfect number");
		}else {
		System.out.println("Not a perfect number");
		}
	}
}