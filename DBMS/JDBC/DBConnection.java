package JDBC;
import java.sql.*;
public class DBConnection {
	public Connection con;
	public PreparedStatement ps;
	
	public void GetConnection ()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 //connection URL or string
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMP","root", "root");
		
		 System.out.println("DB connection established...");
	}
	public void InsertRecord(int no, String na, String job, float sal) throws Exception
	{
		ps=con.prepareStatement("insert into emp values (?,?,?,?)");
		ps.setInt(1, no);
		ps.setString(2, na);
		ps.setString(3, job);
		ps.setFloat(4, sal);
		
		
		int i= ps.executeUpdate();
		
		if(i>0)
			System.out.println(i + " Record inserted successfully");
		else
			System.out.println("Record not inserted");
	}
}