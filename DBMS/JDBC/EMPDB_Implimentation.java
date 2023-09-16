package JDBC;
public class EMPDB_Implimentation {
	public static void main(String[] args)throws Exception {
		DBConnection dc = new DBConnection();
		
		dc.GetConnection();
		dc.InsertRecord(1006, "Deepthi", "L2 TechSupporEngineer",80000 );
	}
}