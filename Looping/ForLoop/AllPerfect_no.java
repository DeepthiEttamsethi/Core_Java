package ForLoop;

public class AllPerfect_no {

	public static void main(String[] args) {
		int i,j,num,sum;
		for(i=1;i<=10000;i++)
		{
			num=i;
			sum=0;
			for(j=1;j<=num;j++)
			{
				if(num%j==0)
				sum=sum+j;
			}
			if(sum==num)
			System.out.println(i);
				
		}

	}

}
