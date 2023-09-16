package Inheritance;

public class Grandchild extends child {
	public void show3()
		{
			System.out.println("Method call from Grandchild");
		}
			public static void main(String[] args){
			
		Grandchild o = new Grandchild();
		o.show1();
		o.show2();
		o.show3();
	}
}