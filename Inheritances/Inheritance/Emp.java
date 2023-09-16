package Inheritance;
import java.io.Serializable;
public class Emp implements Serializable {
	
	    private int empid; //private fields
		private String empname;
		private float basicpay;
		
		public Emp()
		{
			
		} 
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public float getBasicpay() {
			return basicpay;
		}
		public void setBasicpay(float basicpay) {
			this.basicpay = basicpay;
		}
	


}