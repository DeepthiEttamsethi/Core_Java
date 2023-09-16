package Interface;

public class HDFC implements Bank{
	public void TypeofLoan(String loan_Type,double loanamt, int repay_months)
	{
		double amt,business_loan = 0,percent=0;
		
		if(loan_Type.contains("house"))
			percent=house_loan;
		else if(loan_Type .contains("edu"))
			percent=edu_loan;
		else if(loan_Type .contains("business"))
			percent=business_loan;
		
		amt=loanamt*(repay_months/12)*(percent/100);
		
		System.out.println("loan type" + loan_Type);
		System.out.println("Interest Rate" + percent);
		System.out.println("Simple Interest" + amt);
	}

	public static void main(String[] args) {
		HDFC hdfc =new HDFC();
		hdfc.TypeofLoan("education", 50000,60);
	}

}