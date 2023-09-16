package Inheritance;

public class Marks extends Student {
	private float sub1, sub2, sub3, tot, avg;
	private String result;
	
	
	public void addMarks(int no, String na, String c, float m1, float m2, float m3 )
	{
		super.addStudent(no, na, c);
		sub1=m1;
		sub2=m2;
		sub3=m3;
		tot=m1+m2+m3;
		avg=tot/3;
		
		if(sub1>=40 & sub2>=40 & sub3>=40)
			result="pass";
		else
			result="fail";
		
	}
	
	public void show()
	{
		System.out.println("idno "+ id);
		System.out.println("idno "+ result);
	}
}