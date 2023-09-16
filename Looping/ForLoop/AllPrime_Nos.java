package ForLoop;
import java.util.*;
public class AllPrime_Nos {

	public static void main(String[] args) {
		int i,j,num,flag;
		for(i=1;i<=100;i++)
		{
			flag=0;
			num=i;
			for(j=2;j<num;j++)
			{
				if(num%j==0)
				{
					break;
				}
			}
			if(flag==0)
				System.out.println(i+" ");
		}

	}
}