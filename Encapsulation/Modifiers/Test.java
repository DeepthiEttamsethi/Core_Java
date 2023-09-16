package Modifiers;

public class Test {
	public void msg()
	{
		System.out.println("Welcome to method overlaoding...");
	}
	
	public void msg(String na)
	{
		System.out.println(na + "hi, welcome to method overloading");
	}
	
	public void msg(String na, String greetings)
	{
		System.out.println(greetings + "by ANudip to : " + na);
	}

}
