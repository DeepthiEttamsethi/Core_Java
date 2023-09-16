package Exceptionhandling;
public class ExExcep {

	public static void main(String[] args) {
        int a,b,c,d;
        String[] argval = null;
		a = Integer.parseInt(argval[0]);
        b = Integer.parseInt(argval[1]);
        try
        {
        c = a/b;
        System.out.println(a + "/" + b + "=" + c);
        }
        catch(Exception e)
        {
        	System.out.println("b should be non zero value");
        }
        d = a*b;
        System.out.println(a + "*" + b + "=" + d);
	}

}