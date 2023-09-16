package Inheritance;

public class Manager extends Employee {
	private String job;
	private float allowances;
	
	
	public void addEmployee(int id, String na, float b,String j, float all)
	{
		super.addEmployee(id, na, b);
		job=j;
		allowances=all;
	}
	
	public void showEmployee()
	{
		System.out.println("empid"+ id);
		System.out.println("employee Name"+ name);
		System.out.println("Basicpay"+ basic);
		System.out.println("Designation"+ job);
		System.out.println("Allowances"+ allowances);
	}
	
	public static void main(String[] args)
	{
		Manager obj = new Manager();
		obj.addEmployee(1001, "ram", 12000, "manager", 13000f);
		obj.showEmployee();
	
	}
}