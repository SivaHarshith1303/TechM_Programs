package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;
public class Task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			// Loading the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
						
			// Establishing the Connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection established");
						
			Statement st = conn.createStatement();
			
			System.out.print("Enter the name of the person you want to update : ");
			String s = sc.nextLine();
			
			System.out.print("Enter the new name of the person  : ");
			String newName = sc.nextLine();
			
			st.executeUpdate("update employee set empName='"+newName+"' where empName='"+s+"'");
			
			System.out.println("Updated");
			st.close();
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
