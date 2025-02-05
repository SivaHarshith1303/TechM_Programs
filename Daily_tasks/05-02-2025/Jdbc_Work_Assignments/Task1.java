package jdbcPrograms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Task1 {
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
			
			// Creating the Statement 
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?)");
			
			System.out.print("Enter the number of rows you want to enter : ");
			int n = sc.nextInt();
			int val = 0;
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter the id of employee : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the name of the employee : ");
				String s = sc.nextLine();
				System.out.print("Enter the salary of employee : ");
				int sal = sc.nextInt();
				sc.nextLine();
				
				ps.setInt(1, id);
				ps.setString(2, s);
				ps.setInt(3, sal);
				val += ps.executeUpdate();
			}
			System.out.println(val  + " rows entered");
			
			ps.close();
			conn.close();
			System.out.println("Connection is closed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
