package Modifiers;
public class Compare {
	String[] str, str2;
	int size;
	
	
	Compare(String[] s, int n)
	{
		str=s; //allocate memory and copy the value of arguments
		str2=s;
		size=n;
	}
	
	void Converto()
	{
		int i;
		
		for(i=0;i<size;i++)
		{
			char ch = str[i].charAt(0);
			char ch1=Character.toUpperCase(ch);
			//System.out.println(ch1);
			
			
			
			str2[i]= str[i].replace(ch, ch1);
			
			//str2[i]+ str[i].substring(0, 1).toUpperCase();
			
			
		}
		
	}
	
	
	void display()
	{
		for(int i=0;i<size;i++)
			System.out.println(str2[i]);
	}
public static void main(String[] args) {
	
	String[] text = {"geetha", "anusha", "pavan", "jeo", "lee"};
	
	Compare obj = new Compare(text, text.length);
	
	obj.Converto();
	obj.display();
}

}
