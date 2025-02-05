package jdbcPrograms;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Task3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			
			// Loading the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			// Establishing the Connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection is Established");
			
			// Statement creation 
			Statement st = conn.createStatement();
			System.out.print("Enter the id you want to delete : ");
			int id = sc.nextInt();
			ResultSet rs = st.executeQuery("select * from employee where empId = "+id);
			if(!rs.isBeforeFirst())
				System.out.println("There is no entry with the given id");
			else 
			{
				PreparedStatement ps = conn.prepareStatement("delete from employee where empId = ?");
				ps.setInt(1, id);
				
				int val = ps.executeUpdate();
				System.out.println(val + " Rows are updated");
			}
			st.close();
			rs.close();
			conn.close();
			System.out.println("The connection is closed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
