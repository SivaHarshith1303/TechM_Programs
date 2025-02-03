package filesTasks_Feb03;
import java.io.File;
public class Task1 {
	public static void main(String[] args)
	{
		String directory_path = "C:/Users/I SIVA HARSHITH/eclipse-workspace/Feb_03_TechMPrograms/src";
		
		File directory = new File(directory_path);
		
		if(directory.isDirectory())
		{
			String fileList[] = directory.list();
			
			if(fileList.length == 0 || fileList == null)
			{
				System.out.println("The directory is Empty");
			}
			else 
			{
				for(String file : fileList)
					System.out.println(file);
			}
		}
		else 
		{
			System.out.println("This is not an directory");
		}
	}
}
