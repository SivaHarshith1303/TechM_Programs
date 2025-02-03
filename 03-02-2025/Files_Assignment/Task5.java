package filesTasks_Feb03;
import java.io.File;
public class Task5 {
	public static void main(String[] args)
	{
		String path = "C:/Users/I SIVA HARSHITH/eclipse-workspace/Feb_03_TechMPrograms/src/filesTasks_Feb03/Task5.java";
		
		File file = new File(path);
		
		if(file.exists())
		{
			if(file.isFile())
				System.out.println("This is a file");
			else if(file.isDirectory())
				System.out.println("This is a directory");
			else 
				System.out.println("This is neither file or directory");
		}
		else 
			System.out.println("The given path does not exist");
	}
}
