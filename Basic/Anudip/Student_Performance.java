package Anudip;
import java.util.*;
public class Student_Performance {

	public static void main(String[] args) {
		int roll;
		float sub1, sub2, sub3, total, average;
		String result,grade=null;
		
		try (Scanner obj = new Scanner(System.in)) {
		
		System.out.println("Enter rollno ");
		roll=obj.nextInt();
		System.out.println("Enter 3 subject marks ");
		sub1=obj.nextFloat();
		sub2=obj.nextFloat();
		sub3=obj.nextFloat();
		
		total=sub1+sub2+sub3;
		average=total/3;
		
		
		if(sub1>=40 & sub2>=40 & sub3>=40)
		{
			result="pass";
			if(average>80)
				grade="A+";
			else if(average>=60 & average<=80)
				grade="A";
			else if(average>=40 & average<=59)
				grade="B";
		}
		else
		{
			result="Fail";
			grade="Need improvement";
		}
		
		System.out.println("Rollno\t"+roll);
		System.out.println("3 subject marks\t"+sub1 +" "+ sub2+" "+ sub3);
		System.out.println("Total\t"+total);
		System.out.println("Average\t"+average);
		System.out.println("Result\t"+result);
		System.out.println("Grade\t"+grade);
		}
		
		


	}

}
