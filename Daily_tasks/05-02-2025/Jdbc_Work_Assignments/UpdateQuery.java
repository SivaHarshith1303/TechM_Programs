package jdbcPrograms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UpdateQuery {
	public static void main(String[] args)
	{
		try {
			
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			// Establishing the connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection is Established");
			
			//Statement Creation 
			PreparedStatement ps = conn.prepareStatement("update employee set empName = ? where empName = ?");
			ps.setString(1, "Siva harshith Naidu");
			ps.setString(2, "Varun");
			
			int val = ps.executeUpdate();
			
			System.out.println(val + " Query Executed");
			ps.close();
			conn.close();
			System.out.println("Connection closed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
