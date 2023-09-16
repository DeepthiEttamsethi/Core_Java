package Modifiers;

public class Emp {
	private int empno; // class variables
	private String ename, job, dept;
	private float salary;
	
	//constructor with arguments
	public Emp(int no, String na, String j, String d, float sal)
	{
		empno =no;
		ename=na;
		job=j;
		dept=d;
		salary=sal;
		System.out.println("EMpno "+ empno +"\n" + "emp name " + ename + "\n");
		System.out.println("Job "+ job+"\n" + "Department " + dept + "\n");
		System.out.println("salary  "+ salary +"\n" );
				
	}
	
	//constructor without arguments
	public Emp()
	{
		empno =1001;
		ename="Chakra";
		job="manager";
		dept="Shipping";
		salary=25000;
		System.out.println("EMpno "+ empno +"\n" + "emp name " + ename + "\n");
		System.out.println("Job "+ job+"\n" + "Department " + dept + "\n");
		System.out.println("salary  "+ salary +"\n" );
				
	}

}
