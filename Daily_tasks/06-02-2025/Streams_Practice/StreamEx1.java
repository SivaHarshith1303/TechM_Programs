package streamsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		for(int i=1;i<=10;i++)		
			arrli.add(i);
		System.out.println(arrli);
		
		List<Integer> ls = arrli.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(ls);
	}
}
