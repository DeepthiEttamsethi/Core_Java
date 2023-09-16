package Loop;

import java.util.Scanner;

public class Arrays_UserInput {

	
		public static void main(String[] args) {
			
			String[] bk_id, bk_title, author;  		
			float[] bk_price; 						
			int i;
			
			
			bk_id= new String[5]; 					
			bk_title = new String[5];
			author= new String[5];
			bk_price = new float[5];
			
			
			try (Scanner obj = new Scanner(System.in)) {
			
			System.out.println("Enter 5 Record ");
			
			for(i=0;i<bk_price.length;i++)
			{
				System.out.println("Enter Bookid, Title, Author and Price ");
				
				bk_id[i]=obj.next();
				bk_title[i]=obj.next();
				author[i]=obj.next();
				bk_price[i]=obj.nextFloat();
				
			}
			
			
			for(i=0;i<author.length;i++)
				System.out.println(bk_id[i]+"\t"+bk_title[i]+"\t"+author[i]+"\t"+bk_price[i]);
			
			//search
			
			System.out.println("Enter book title to search in the Library ");
			
			String title = obj.next();
			int c=0;
			
			for(i=0;i<author.length;i++)
			{
				if(title.equals(bk_title[i]))
				{
					c=1;
					System.out.println(bk_id[i]+"\t"+bk_title[i]+"\t"+author[i]+"\t"+bk_price[i]);
					
				}
			}
			
			if(c==0)
				System.out.println(title +" : Searching Record not found in the library");
			
			
		}
	}
}
