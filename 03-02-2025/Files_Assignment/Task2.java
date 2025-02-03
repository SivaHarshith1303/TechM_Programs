package filesTasks_Feb03;
import java.io.File;
import java.io.FilenameFilter;
public class Task2 {
	public static void main(String[] args)
	{
		String directory_Path = "C:/Users/I SIVA HARSHITH/eclipse-workspace/Feb_03_TechMPrograms/src";
		
		String extension = ".dat";
		
		File directory = new File(directory_Path);
		
		if(directory.isDirectory())
		{
			File[] files = directory.listFiles(new FilenameFilter() {
				@Override 
				public boolean accept(File dir,String fileName)
				{
					return fileName.endsWith(extension);
				}
			});
			
			if(files.length == 0 || files == null)
				System.out.println("There is no file present in the directory with the given extension");
			else 
			{
				for(File file : files)
					System.out.println(file);
			}
		}
		else 
		{
			System.out.println("This is  not a directory");
		}
	}
}
