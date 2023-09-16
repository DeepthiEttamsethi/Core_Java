package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpRecords {
	public static void main(String[] args)throws Exception {
		
		//public Connection con = null;
		//public PreparedStament ps=null;
		
		Class.forName("com.sql.cj.jdbc.Driver");
		
		//connection URL or string
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMP","root", "root");
		
		System.out.println("DB connection established");
		
		PreparedStatement ps = con.prepareStatement("insert into testtemp values(?,?,?,?)");
			ps.setInt(1, 1003);
			ps.setString(2, "Deepthi");
			ps.setString(3, "Developer");
			ps.setFloat(4, 80000);
			
			int i = ps.executeUpdate();
			
			if(i>0)
				System.out.println(i + " Record inserted sucessfully");
			else
				System.out.println("Record not inserted");
	}
}