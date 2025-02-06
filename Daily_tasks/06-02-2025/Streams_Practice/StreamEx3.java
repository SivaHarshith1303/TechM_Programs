package streamsExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import static streamsExamples.Display.*;
public class StreamEx3 {
	
	// a method to filter the strings based on length 
	
	private static List<String> filterAndConvertToUpper(Stream<String> stream,int length)
	{
		return stream.filter(s -> s.length() == length).map(String::toUpperCase).collect(Collectors.toList());
	}
	public static void main(String[] args)
	{
		String filePath = "src//streamsExamples//text1.txt";
		
		try(Stream <String> lines = Files.lines(Paths.get(filePath))){
			List<String> filteredStrings = filterAndConvertToUpper(lines,5);
			System.out.println(filteredStrings);
		}
		catch(IOException ie)
		{
			System.out.println("Exception occured");
			ie.printStackTrace();
		}
	}
}
