package filesTasks_Feb03;
import java.io.File;
public class Task8 {
	public static void main(String[] args)
	{
		String path = "C:/Users/I SIVA HARSHITH/eclipse-workspace/Feb_03_TechMPrograms/src/filesTasks_Feb03/Task1.java";
		
		File file = new File(path);
		
		if(file.exists() && file.isFile())
		{
			long bytes = file.length();
			
			double kb = bytes/1024.0;
			
			double mb = kb/1024.0;
			
			System.out.println("File in Bytes : " + bytes);
			System.out.println("File in kb : " + kb);
			System.out.println("File in mb : " + mb);
		}
		else 
			System.out.println("There is no file exists with the given path");
	}
}
