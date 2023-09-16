package ForLoop;

public class pattern2 {
	public static void main(String[] args) {
		int i,j;
		int ch=65;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			System.out.print((char)ch++ +" ");
			System.out.println();
		}
	}
}