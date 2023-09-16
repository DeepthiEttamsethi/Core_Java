package ForLoop;

public class pattern5 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=6;i++)
		{
			if(i%2==0)
			{
			for(j=1;j<=i;j++)
			System.out.print(" 0 ");
		}
		else
		{
			for(j=1;j<=i;j++)
			
			System.out.print(" 1 ");
			}
			System.out.println();
	}

}
}
