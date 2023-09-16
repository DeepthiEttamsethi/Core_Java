package Interface;

public class InterfaceTest implements First,Second {
	
	
	public void add()
	{
		System.out.println("addition"+(a+b));
	}
	public void subtract()
	{
		System.out.println("subtract"+(a-b));
	}
	public void multiply()
	{
		System.out.println("product"+(a*b));
	}
	public void divide()
	{
		System.out.println("/"+(a/b));
	}
	public static void main(String[] args) {
		
		InterfaceTest  it =new InterfaceTest();
		
		it.add();
		it.subtract();
		it.multiply();
		it.divide();
		
		First obj = new InterfaceTest();
		
		obj.add();
		obj.subtract();
		
		Second obj1=new InterfaceTest();
		obj1.division();
		obj1.multiply();
		}
	@Override
	public void division() {
	}
		
	}