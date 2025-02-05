package jdbcPrograms;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Task4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			// Loading the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			// Establishing the Connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection is established");
			
			// Preparing a statement 
			PreparedStatement ps1 = conn.prepareStatement("insert into employee values(?,?,?)");
			PreparedStatement ps2 = conn.prepareStatement("update employee set empName = ? where empName = ?");
			PreparedStatement ps3 = conn.prepareStatement("delete from employee where empId=?");
			PreparedStatement ps4 = conn.prepareStatement("select * from employee where empId = ?");
			
			int choice = -1;
			do {
				System.out.println("1.Insert a new Row\n2.Update a Row\n3.Delete a Row\n4.Select a Row\n5.Exit\n");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				sc.nextLine();
				if(choice == 1)
				{
					System.out.print("Enter the id of employee : ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the name of employee : ");
					String name = sc.nextLine();
					System.out.print("Enter the salary of employee : ");
					int salary = sc.nextInt();
					
					ps1.setInt(1,id);
					ps1.setString(2, name);
					ps1.setInt(3, salary);
					ps1.executeUpdate();
				}
				else if(choice == 2)
				{
					System.out.print("Enter the name of employee : ");
					String name = sc.nextLine();
					System.out.print("Enter the new name of employee : ");
					String newName = sc.nextLine();
					ps2.setString(1, name);
					ps2.setString(2, newName);
					ps2.executeUpdate();
				}
				else if(choice == 3)
				{
					System.out.print("Enter the id of employee you want to delete : ");
					int id = sc.nextInt();
					ps3.setInt(1,id);
					ps3.executeUpdate();
				}
				else if(choice == 4)
				{
					System.out.println("Enter the id of employee : ");
					int id = sc.nextInt();
					ps4.setInt(1,id);
					ResultSet rs = ps4.executeQuery();
					while(rs.next())
					{
						System.out.print(rs.getInt(1) + " ");
						System.out.print(rs.getString(2) + " ");
						System.out.print(rs.getInt(3) + " ");
						System.out.println();
					}
				}
				else if(choice != 5)
					System.out.println("Please enter right choice");
			}while(choice != 5);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}
}
