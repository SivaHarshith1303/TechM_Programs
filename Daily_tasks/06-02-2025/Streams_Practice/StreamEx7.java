package streamsExamples;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import static streamsExamples.Display.*;
public class StreamEx7 {
	public static void main(String[] args)
	{
		List<String> stringList = new ArrayList<>();
		
		stringList.add("a");
		stringList.add("b");
		stringList.add("a");
		
		// Display the distince records in the stream 
		
		Stream<String> stream = stringList.stream();
		stream.distinct().forEach(System.out::println);
		
		// short-circuting operations 
		print("Peforming short-circuit operations");
		
		Optional<String> optional = stream.findFirst();
		System.out.println(optional.get());
		
		print("Using find any method");

		Optional<String> optional2 = stream.findAny();
		System.out.println(optional2.get());
		
		// Find any record which starts with "a"
		
		boolean anyMath = stream.anyMatch(s -> s.startsWith("a"));
		// List<String> ans = stream.anyMatch(s -> s.startsWith("a")).collect(Collectors.toList()); 
	}
}
