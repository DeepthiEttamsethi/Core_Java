package Inheritance;

public class Bean_implementation {

public static void main(String[] args) {
		
		Emp obj = new Emp();
		
		obj.setEmpid(1001);
		obj.setEmpname("saikumar");
		obj.setBasicpay(25000f);
		
		System.out.println("record1 "+ obj.getEmpid() + " "+ obj.getBasicpay());
		
		obj.setEmpid(1002);
		obj.setEmpname("Jeevan");
		obj.setBasicpay(25000f);
		
		System.out.println("record2 "+ obj.getEmpid() + " "+ obj.getBasicpay());
		int a=10,b;
		b=a;
		
	}
}
