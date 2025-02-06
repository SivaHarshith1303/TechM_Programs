package streamsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx2 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		for(int i=1;i<=10;i++)
			arrli.add(i);
		
		System.out.println(arrli);
		
		
		// The above arraylist consist of marks of students.
		// If we want to add some grace marks to all the students . Then we can use map 
		
		List<Integer> ls = arrli.stream().map(i -> i+10).collect(Collectors.toList());
		
		System.out.println(ls);
	}
}
