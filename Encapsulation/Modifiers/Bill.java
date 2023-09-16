package Modifiers;
import java.util.*;
public class Bill {
		private String billno,customername, description;
		private float billamount; // class variables
		private float discount,paybleamount;
		
		public void Addbill() // member fuctions or method method
		{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter billno ");
		billno = key.next();
		System.out.println("Enter customer Name");
		customername = key.next();
		System.out.println("Enter discription ");
		description = key.next();
		System.out.println("Enter billamount");
		billamount = key.nextFloat();
		}

		public void calculate()
		{
			discount=billamount*.15f;
			paybleamount=billamount-discount;
		}
	//method with no returntype / no arguments
	        public void printbill()
	        {
	           System.out.println("Enter billno\t"+billno);
	           System.out.println("Enter customer Name\t"+ customername);
	           System.out.println("Enter description\t"+description);
	           System.out.println("Enter bill amount\t"+billamount);
	           System.out.println("Enter discount\t"+discount);
	           System.out.println("Enter payble amount\t"+paybleamount);
	         }
	//method with returntype and no arguments
	        public static void main(String[] args)
	        {
	          Bill b=new Bill();
	          
	          b.Addbill();
	          b.printbill();
	          b.calculate();

	        }		
}