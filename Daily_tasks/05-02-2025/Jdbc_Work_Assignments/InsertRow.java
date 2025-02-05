package jdbcPrograms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class InsertRow {
	public static void main(String[] args) 
	{
		try {
			
			// Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			// Establishing the connection 
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection established");
			
			
			// Statement Creation 
			
			Statement st = conn.createStatement();
			System.out.println("Statement Created");
			
			st.executeUpdate("insert into employee values(1,'Arjun',25000)");
			
			System.out.println("Row inserted successfully");
			
			// Closing of Statement 
			conn.close();
			System.out.println("Connection closed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured : ");
			e.printStackTrace();
		}
	}
}
