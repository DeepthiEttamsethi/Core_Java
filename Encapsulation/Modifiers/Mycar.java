package Modifiers;
public class Mycar {
	String Model; //data member
	public Mycar(String m) //constructor with argu
	{
	Model=m;
	System.out.println("My car model is : "+ Model);
	}
	public boolean compareTo(Mycar mycar)
	{
	return (Model.equals(mycar.Model));
	}
	
	
	public static void main(String[] args)
	{
		Mycar mycar = new Mycar("Ferrari");
		Mycar mycar1 = new Mycar("Ferrari");
		System.out.println("2 Objects are same Model " + mycar.compareTo(mycar1));
	}

}
