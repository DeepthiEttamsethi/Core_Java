package Exceptionhandling;
public class Sample1 {
	public void calculate(String s1, String s2) throws Exception
     {
             int a=0,b=0,c,d;
             a = Integer.parseInt(s1);
             b = Integer.parseInt(s2);
             c = a/b;
             System.out.println(a + "/" + b + "=" + c);
             d = a*b;
             System.out.println(a + "*" + b + "=" + d);
    
	}

}
