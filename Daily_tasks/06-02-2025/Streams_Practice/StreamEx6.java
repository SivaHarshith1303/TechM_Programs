package streamsExamples;

import java.util.*;
import java.util.stream.*;
import static streamsExamples.Display.*;
public class StreamEx6 {
	public static void main(String[] args)
	{
		List<String> arrli = new ArrayList<>();
		arrli.add("Java");
		arrli.add("Python");
		arrli.add("React");
		
		Stream<String> slist = arrli.stream();
		
		print("Reduce list to store in Optional");
		
		Optional<String> ans = slist.sorted().reduce((i,j) -> i+","+j);
		System.out.println(ans.isPresent());
		
		System.out.println(ans.get());
		
		ans.ifPresent(System.out::println);
	}
}
