package Loop;

public class Boxing {

	public static void main(String[] args) {
		int a=10;
		Object obj=new Object();
		obj=a;
		System.out.println(obj);
		
		String x=obj.toString();
		
		int y=Integer.parseInt(x);
		System.out.println(y);

	}

}