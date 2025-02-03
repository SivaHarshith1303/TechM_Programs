package filesTasks_Feb03;
import java.io.File;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the path of the file or directory which you want to check");
		String path = sc.nextLine();
		
		File file_or_directory = new File(path);
		
		if(file_or_directory.isFile() || file_or_directory.isDirectory())
			System.out.println("The specified path exist");
		else 
			System.out.println("There is no file or directory with the specified path");
	}
}
