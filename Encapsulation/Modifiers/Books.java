package Modifiers;

public class Books {
	int bkid;
	String bktitle, author;
	float price;
	
	//constructor with args
	
	Books(int id, String t, String a, float p)
	{
		bkid=id;
		bktitle=t;
		author=a;
		price=p;
	}
	//method
	void print()
	{
		System.out.println("book id\t" + bkid +"\n"+ "booktitle\t"+ bktitle + "\nAuthor\t"+ author + "\nPrice\t"+ price);
		System.out.println("---------------\n");
	}
	
	public static void main(String[] args) {
		
		Books[] barray = new Books[5]; //declaration array of objects
		
		//for(int i=0;i<5;i++)
		//{
			barray[0]= new Books(1, "LetusC", "yashwanth", 350f);
			barray[1]= new Books(2, "Unix shell", "James", 4350f);
			barray[2]= new Books(3, "windows11", "ABc", 300f);
			barray[3]= new Books(4, "AI", "bala", 380f);
			barray[4]= new Books(5, "R language", "richer", 1350f);
		//}
		
		
			for(int i=0;i<5;i++)
				barray[i].print();
	}

}
